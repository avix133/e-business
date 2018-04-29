package controllers

import javax.inject._
import models._
import play.api.libs.json.Json
import play.api.mvc._

import scala.concurrent.ExecutionContext

class CategoryController @Inject()(categoryRepo: CategoryRepository,
                                   cc: MessagesControllerComponents
                                  )(implicit ec: ExecutionContext)
  extends MessagesAbstractController(cc) {


  //  val categoryForm: Form[CreateCategoryForm] = Form {
  //    mapping(
  //      "name" -> nonEmptyText,
  //    )(CreateCategoryForm.apply)(CreateCategoryForm.unapply)
  //  }


  def getCategories = Action.async { implicit request =>
    categoryRepo.list().map { products =>
      Ok(Json.toJson(products))
    }
  }
}


case class CreateCategoryForm(name: String)