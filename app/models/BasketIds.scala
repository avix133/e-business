package models

/**
  * Description of class:
  *
  * Created on 28 Apr 2018 (16:19)
  *
  * @author dawid
  */

import play.api.libs.json._

case class BasketIds(basket_id: Long, user: Long)

object BasketIds {
  implicit val basketIdsFormat = Json.format[BasketIds]
}
