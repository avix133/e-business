package models

/**
  * Description of class:
  *
  * Created on 28 Apr 2018 (16:21)
  *
  * @author dawid
  */

import play.api.libs.json._

case class Keyword(keyword_id: Long, value: String)

object Keyword {
  implicit val keywordFormat = Json.format[Keyword]
}

