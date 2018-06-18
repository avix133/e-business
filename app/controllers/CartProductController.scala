package controllers

import javax.inject._
import models._
import play.api.libs.json._
import play.api.mvc._

import scala.collection.mutable.ArrayBuffer
import scala.concurrent.{ExecutionContext, Future}


class CartProductController @Inject()(cartProductRepo: CartProductRepository, productRepo: ProductRepository,
                                  cc: MessagesControllerComponents
                                 )(implicit ec: ExecutionContext)
  extends MessagesAbstractController(cc) {

  import play.api.libs.json.Json


  def addCartProduct(): Action[JsValue] = Action.async(parse.json) { implicit request =>

    val cartProductFromJson: JsResult[CartProduct] = Json.fromJson[CartProduct](request.body)

    cartProductFromJson match {
      case JsSuccess(c: CartProduct, path: JsPath) =>
        cartProductRepo.create(c.cart, c.product, c.amount).map {
          _ =>
            Ok(Json.obj(
              "status" -> "OK"
            ))
        }
      case e: JsError => Future.successful(Ok("Errors: " + JsError.toJson(e).toString()))
    }
  }


  def getProductsInCart(cartId: Long) = Action.async { implicit request =>
    var result = new ArrayBuffer[Product]()

    cartProductRepo.list().map { cartProducts =>
      cartProducts.foreach(cartProduct => {
        if (cartProduct.cart == cartId) {
          var product = productRepo.getById(cartProduct.product).map(product => result += product.get)
        }
      })
      Ok(Json.toJson(result))
    }
  }
}

