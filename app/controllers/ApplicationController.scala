package controllers

import com.mohiva.play.silhouette.api.actions.SecuredRequest
import com.mohiva.play.silhouette.api.{LogoutEvent, Silhouette}
import forms.SignInForm
import javax.inject.Inject
import models.{Cart, _}
import org.webjars.play.WebJarsUtil
import play.Logger
import play.api.i18n.I18nSupport
import play.api.libs.json.Json
import play.api.mvc.{AbstractController, AnyContent, ControllerComponents, _}
import utils.auth.DefaultEnv

import scala.concurrent.{ExecutionContext, Future}
import scala.util.{Failure, Success}

/**
  * The basic application controller.
  *
  * @param components  The Play controller components.
  * @param silhouette  The Silhouette stack.
  * @param webJarsUtil The webjar util.
  * @param assets      The Play assets finder.
  */
class ApplicationController @Inject()(
                                       userCustomRepo: UserRepository,
                                       cartRepo: CartRepository,
                                       components: ControllerComponents,
                                       silhouette: Silhouette[DefaultEnv]
                                     )(
                                       implicit
                                       webJarsUtil: WebJarsUtil,
                                       assets: AssetsFinder,
                                       ec: ExecutionContext
                                     ) extends AbstractController(components) with I18nSupport {

  /**
    * Handles the index action.
    *
    * @return The result to display.
    */
  def index = silhouette.SecuredAction.async { implicit request: SecuredRequest[DefaultEnv, AnyContent] =>
    val userID = request.identity.userID
    val firstName = request.identity.firstName
    val lastName = request.identity.lastName
    val fullName = request.identity.fullName
    val email = request.identity.email
    var token = request.authenticator.id

    userCustomRepo.getByEmail(email).onComplete({
      case Success(user) =>
        Logger.warn("User: success!")
        Logger.warn("User: " + user)
        if (user.isEmpty) {
          userCustomRepo.create(firstName, lastName, fullName, email, token).map(u => Logger.warn("Adding new user! " + u))
        }
    })

    Logger.warn("Redirecting to home")
    Logger.info("INFO LOGGER TEST")
    Future.successful(Ok(views.html.home(request.identity)))
//    Future.successful(Ok(views.html.main(request.identity)))
  }

  def getCurrencyUser = silhouette.SecuredAction.async { implicit request: SecuredRequest[DefaultEnv, AnyContent] =>

    val userID = request.identity.userID
    val firstName = request.identity.firstName
    var lastName = request.identity.lastName
    val fullName = request.identity.fullName
    val email = request.identity.email
    var token = request.authenticator.id

    Future.successful(Ok(Json.obj(
      "userID" -> userID,
      "name" -> fullName,
      "role" -> email
    )))
  }

  def getUsers: Action[AnyContent] = Action.async { implicit request =>
    userCustomRepo.list().map { users =>
      Ok(Json.toJson(users))
    }
  }

  def addCart(): Action[AnyContent] = Action.async { implicit request =>

    val userID = request.body.asJson.get("userID").as[Int]
    var existingCart: Cart = null

    cartRepo.list().map { carts =>
      carts.foreach(cart => {
        if (cart.user == userID) {
          existingCart = cart
        }
      })

      if (existingCart == null) {
        cartRepo.create(userID)
      } else {
        val newCart: Cart = Cart(existingCart.cart_id, userID)
        cartRepo.updateById(existingCart.cart_id, newCart)
      }
      Ok(Json.toJson("success" -> "OK"))
    }
  }


  /**
    * Handles the Sign Out action.
    *
    * @return The result to display.
    */
  def signOut = silhouette.SecuredAction.async { implicit request: SecuredRequest[DefaultEnv, AnyContent] =>
    Logger.warn("Sign out")
    val result = Redirect("http://localhost:9090/")
    silhouette.env.eventBus.publish(LogoutEvent(request.identity, request))
    silhouette.env.authenticatorService.discard(request.authenticator, result)
  }
}
