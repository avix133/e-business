package controllers

import javax.inject._
import models._
import play.api.libs.json._
import play.api.mvc._

import scala.collection.mutable.ArrayBuffer
import scala.concurrent.{ExecutionContext, Future}


class CategoryController @Inject()(categoryRepo: CategoryRepository,
                                   cc: MessagesControllerComponents
                                )(implicit ec: ExecutionContext)
  extends MessagesAbstractController(cc) {

  import play.api.libs.json.Json

  def addCategory(): Action[JsValue] = Action.async(parse.json) { implicit request =>

    val categoryFromJson: JsResult[Category] = Json.fromJson[Category](request.body)

    categoryFromJson match {
      case JsSuccess(c: Category, path: JsPath) =>
        categoryRepo.create(c.name).map {
          _ =>
            Ok(Json.obj(
              "status" -> "OK"
            ))
        }
      case e: JsError => Future.successful(Ok("Errors: " + JsError.toJson(e).toString()))
    }

  }

  def getCategoryByName(name: String):Action[AnyContent] = Action.async { implicit request =>
    var categoryId: Int = -1

    categoryRepo.list().map { categories =>
      categories.foreach(category => {
        if (category.name.toUpperCase == name.toUpperCase()) {
          categoryId = category.id
        }
      })
      if (categoryId > -1)
        Ok(Json.toJson(categoryId))
      else
        Ok(Json.toJson(null))
    }
  }
}
