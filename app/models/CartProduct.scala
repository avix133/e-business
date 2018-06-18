package models

import play.api.libs.json.{Json, OFormat}

case class CartProduct(cart: Long, product: Long, amount: Int)

object CartProduct {
  implicit val categoryFormat: OFormat[CartProduct] = Json.format[CartProduct]
}

