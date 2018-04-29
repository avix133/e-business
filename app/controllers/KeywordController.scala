package controllers

import javax.inject._
import models._
import play.api.libs.json.Json
import play.api.mvc._

import scala.concurrent.ExecutionContext

class KeywordController @Inject()(keywordRepository: KeywordRepository,
                                  cc: MessagesControllerComponents
                                 )(implicit ec: ExecutionContext)
  extends MessagesAbstractController(cc) {

  def getKeywords = Action.async { implicit request =>
    keywordRepository.list().map { basketIds =>
      Ok(Json.toJson(basketIds))
    }
  }
}
