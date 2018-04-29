package models

/**
  * Description of class:
  *
  * Created on 28 Apr 2018 (16:20)
  *
  * @author dawid
  */

import play.api.libs.json._

case class BasketProduct(basket: Long, product: Long, amount: Int)

object BasketProduct {
  implicit val basketProductFormat = Json.format[BasketProduct]
}
