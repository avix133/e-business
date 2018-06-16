package models

import play.api.libs.json.{Json, OFormat}

case class Cart(cart_id: Int, user: String)

object Cart {
  implicit val commentsFormat: OFormat[Cart] = Json.format[Cart]
}

