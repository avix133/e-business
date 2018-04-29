package controllers

import javax.inject._
import models._
import play.api.libs.json.Json
import play.api.mvc._

import scala.concurrent.ExecutionContext

class OpinionController @Inject()(opinionRepository: OpinionRepository,
                                  cc: MessagesControllerComponents
                                 )(implicit ec: ExecutionContext)
  extends MessagesAbstractController(cc) {

  def getOpinions = Action.async { implicit request =>
    opinionRepository.list().map { basketIds =>
      Ok(Json.toJson(basketIds))
    }
  }
}
