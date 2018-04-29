package models

/**
  * Description of class:
  *
  * Created on 28 Apr 2018 (16:23)
  *
  * @author dawid
  */

import play.api.libs.json._

case class Opinion(product: Long, comment: String)

object Opinion {
  implicit val opinionFormat = Json.format[Opinion]
}

