
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

object basketid extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[CreateBasketIdsForm],MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(basketIds: Form[CreateBasketIdsForm])(implicit request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/request/*5.9*/.flash.get("success").map/*5.34*/ { key =>_display_(Seq[Any](format.raw/*5.43*/("""
   """),_display_(/*6.5*/request/*6.12*/.messages(key)),format.raw/*6.26*/("""
""")))}),format.raw/*7.2*/("""

"""),_display_(/*9.2*/main("Welcome to Ebiznes")/*9.28*/ {_display_(Seq[Any](format.raw/*9.30*/("""
  """),_display_(/*10.4*/form(routes.BasketIdsController.addBasketId())/*10.50*/ {_display_(Seq[Any](format.raw/*10.52*/("""
		"""),_display_(/*11.4*/inputText(basketIds("user"))),format.raw/*11.32*/("""

		"""),_display_(/*13.4*/CSRF/*13.8*/.formField),format.raw/*13.18*/("""

		"""),format.raw/*15.3*/("""<div class="buttons">
			<input type="submit" value="Add basked id"/>
		</div>
	""")))}),format.raw/*18.3*/("""
""")))}),format.raw/*19.2*/("""
"""))
      }
    }
  }

  def render(basketIds:Form[CreateBasketIdsForm],request:MessagesRequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(basketIds)(request)

  def f:((Form[CreateBasketIdsForm]) => (MessagesRequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (basketIds) => (request) => apply(basketIds)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Apr 30 22:28:18 CEST 2018
                  SOURCE: /home/dawid/IdeaProjects/Ebusiness/app/views/basketid.scala.html
                  HASH: 0f905f9cb58e1d1995b3d115f80b4e6b1d3a6822
                  MATRIX: 773->1|925->83|969->81|996->99|1023->101|1037->108|1070->133|1116->142|1146->147|1161->154|1195->168|1226->170|1254->173|1288->199|1327->201|1357->205|1412->251|1452->253|1482->257|1531->285|1562->290|1574->294|1605->304|1636->308|1747->389|1779->391
                  LINES: 21->1|24->3|27->2|28->4|29->5|29->5|29->5|29->5|30->6|30->6|30->6|31->7|33->9|33->9|33->9|34->10|34->10|34->10|35->11|35->11|37->13|37->13|37->13|39->15|42->18|43->19
                  -- GENERATED --
              */
          