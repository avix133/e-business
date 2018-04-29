package controllers

import javax.inject._
import models._
import play.api.libs.json.Json
import play.api.mvc._

import scala.concurrent.ExecutionContext

class BasketProductController @Inject()(basketProductRepository: BasketProductRepository,
                                    cc: MessagesControllerComponents
                                   )(implicit ec: ExecutionContext)
  extends MessagesAbstractController(cc) {

  def getBasketProducts = Action.async { implicit request =>
    basketProductRepository.list().map { basketIds =>
      Ok(Json.toJson(basketIds))
    }
  }
}
