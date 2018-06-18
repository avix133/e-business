package controllers

import javax.inject._
import models._
import play.api.libs.json._
import play.api.mvc._

import scala.collection.mutable.ArrayBuffer
import scala.concurrent.{ExecutionContext, Future}


class CartController @Inject()(cartRepo: CartRepository,
                               cc: MessagesControllerComponents
                               )(implicit ec: ExecutionContext)
  extends MessagesAbstractController(cc) {

  import play.api.libs.json.Json

  def addCart(): Action[JsValue] = Action.async(parse.json) { implicit request =>

    val cartFromJson: JsResult[Cart] = Json.fromJson[Cart](request.body)

    cartFromJson match {
      case JsSuccess(c: Cart, path: JsPath) =>
        cartRepo.create(c.user).map {
          _ =>
            Ok(Json.obj(
              "status" -> "OK"
            ))
        }
      case e: JsError => Future.successful(Ok("Errors: " + JsError.toJson(e).toString()))
    }
  }

  def getCartId(id: String): Action[AnyContent] = Action.async { implicit request =>
    var cartById = new ArrayBuffer[Cart]()

    cartRepo.list().map { carts =>
      carts.foreach(cart => {
        if (cart.user == id) {
          cartById += cart
        }
      })
      Ok(Json.toJson(cartById))
    }
  }
}