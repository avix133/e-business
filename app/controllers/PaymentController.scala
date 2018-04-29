package controllers

import javax.inject._
import models._
import play.api.libs.json.Json
import play.api.mvc._

import scala.concurrent.ExecutionContext

class PaymentController @Inject()(paymentRepository: PaymentRepository,
                                  cc: MessagesControllerComponents
                                 )(implicit ec: ExecutionContext)
  extends MessagesAbstractController(cc) {

  def getPayments = Action.async { implicit request =>
    paymentRepository.list().map { basketIds =>
      Ok(Json.toJson(basketIds))
    }
  }
}
