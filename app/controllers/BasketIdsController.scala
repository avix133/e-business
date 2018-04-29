package controllers

import javax.inject._
import models._
import play.api.libs.json.Json
import play.api.mvc._

import scala.concurrent.ExecutionContext

class BasketIdsController @Inject()(basketIdsRepository: BasketIdsRepository,
                                    cc: MessagesControllerComponents
                                   )(implicit ec: ExecutionContext)
  extends MessagesAbstractController(cc) {

  def getBasketIds = Action.async { implicit request =>
    basketIdsRepository.list().map { basketIds =>
      Ok(Json.toJson(basketIds))
    }
  }
}
