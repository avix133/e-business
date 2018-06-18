package controllers

import javax.inject._
import models._

import play.api.libs.json.Json.toJson
import play.api.libs.json._
import play.api.mvc._

import scala.collection.mutable.ArrayBuffer
import scala.concurrent.{ExecutionContext, Future}

case class KeySearch(key: String)

object KeySearch {
  implicit val keySearchFormat: OFormat[KeySearch] = Json.format[KeySearch]
}

class ProductController @Inject()(productsRepo: ProductRepository, categoryRepo: CategoryRepository,
                                  cc: MessagesControllerComponents
                                 )(implicit ec: ExecutionContext)
  extends MessagesAbstractController(cc) {

  import play.api.libs.json.Json

  def addProduct(): Action[JsValue] = Action.async(parse.json) { implicit request =>

    val productFromJson: JsResult[Product] = Json.fromJson[Product](request.body)

    productFromJson match {
      case JsSuccess(p: Product, path: JsPath) =>
        productsRepo.create(p.name, p.description, p.category, p.image, p.price).map {
          _ =>
            Ok(Json.obj(
              "status" -> "OK"
            ))
        }
      case e: JsError => Future.successful(Ok("Errors: " + JsError.toJson(e).toString()))
    }

  }

  def getProducts: Action[AnyContent] = Action.async { implicit request =>
    productsRepo.list().map { products =>
      Ok(toJson(products))
    }
  }

  def getProduct(id: Int):Action[AnyContent] = Action.async { implicit request =>
    var productsById = new ArrayBuffer[Product]()

    productsRepo.list().map { products =>
      products.foreach(product => {
        if (product.id == id) {
          productsById += product
        }
      })
      Ok(Json.toJson(productsById))
    }
  }
}


case class CreateProductForm(name: String, description: String, category: Int)
