package models

/**
  * Description of class:
  *
  * Created on 28 Apr 2018 (16:28)
  *
  * @author dawid
  */

import play.api.libs.json._
import java.sql.Date

case class Payment(payment_id: Long, basket: Long, value: Float, date: Date)

object Payment {
  implicit val paymentFormat = Json.format[Payment]
}

