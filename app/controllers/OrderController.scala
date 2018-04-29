package controllers

import javax.inject._
import models._
import play.api.libs.json.Json
import play.api.mvc._

import scala.concurrent.ExecutionContext

class OrderController @Inject()(orderRepository: OrderRepository,
                                    cc: MessagesControllerComponents
                                   )(implicit ec: ExecutionContext)
  extends MessagesAbstractController(cc) {

  def getOrders = Action.async { implicit request =>
    orderRepository.list().map { basketIds =>
      Ok(Json.toJson(basketIds))
    }
  }
}
