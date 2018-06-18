package models

import play.api.libs.json._

case class Product(id: Long, name: String, description: String, category: Long, image: Long, price: String)

object Product {
  implicit val productFormat: OFormat[Product] = Json.format[Product]
}
