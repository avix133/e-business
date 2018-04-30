
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object order extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[CreateOrderForm],MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(order: Form[CreateOrderForm])(implicit request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/request/*5.9*/.flash.get("success").map/*5.34*/ { key =>_display_(Seq[Any](format.raw/*5.43*/("""
   """),_display_(/*6.5*/request/*6.12*/.messages(key)),format.raw/*6.26*/("""
""")))}),format.raw/*7.2*/("""

"""),_display_(/*9.2*/main("Welcome to Ebiznes")/*9.28*/ {_display_(Seq[Any](format.raw/*9.30*/("""
  """),_display_(/*10.4*/form(routes.OrderController.addOrder())/*10.43*/ {_display_(Seq[Any](format.raw/*10.45*/("""
		"""),_display_(/*11.4*/inputText(order("basket"))),format.raw/*11.30*/("""
	  	"""),_display_(/*12.6*/inputText(order("date"))),format.raw/*12.30*/("""
	  	"""),_display_(/*13.6*/inputText(order("address"))),format.raw/*13.33*/("""

		"""),_display_(/*15.4*/CSRF/*15.8*/.formField),format.raw/*15.18*/("""

		"""),format.raw/*17.3*/("""<div class="buttons">
			<input type="submit" value="Add order"/>
		</div>
	""")))}),format.raw/*20.3*/("""
""")))}),format.raw/*21.2*/("""
"""))
      }
    }
  }

  def render(order:Form[CreateOrderForm],request:MessagesRequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(order)(request)

  def f:((Form[CreateOrderForm]) => (MessagesRequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (order) => (request) => apply(order)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Apr 30 22:28:18 CEST 2018
                  SOURCE: /home/dawid/IdeaProjects/Ebusiness/app/views/order.scala.html
                  HASH: d3d402711ef01127d96947cc796aa4943934670f
                  MATRIX: 766->1|910->75|954->73|981->91|1008->93|1022->100|1055->125|1101->134|1131->139|1146->146|1180->160|1211->162|1239->165|1273->191|1312->193|1342->197|1390->236|1430->238|1460->242|1507->268|1539->274|1584->298|1616->304|1664->331|1695->336|1707->340|1738->350|1769->354|1876->431|1908->433
                  LINES: 21->1|24->3|27->2|28->4|29->5|29->5|29->5|29->5|30->6|30->6|30->6|31->7|33->9|33->9|33->9|34->10|34->10|34->10|35->11|35->11|36->12|36->12|37->13|37->13|39->15|39->15|39->15|41->17|44->20|45->21
                  -- GENERATED --
              */
          