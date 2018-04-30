
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

object opinion extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[CreateOpinionForm],Seq[Product],MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(opinion: Form[CreateOpinionForm], product: Seq[Product])(implicit request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/request/*5.9*/.flash.get("success").map/*5.34*/ { key =>_display_(Seq[Any](format.raw/*5.43*/("""
   """),_display_(/*6.5*/request/*6.12*/.messages(key)),format.raw/*6.26*/("""
""")))}),format.raw/*7.2*/("""

"""),_display_(/*9.2*/main("Welcome to Ebiznes")/*9.28*/ {_display_(Seq[Any](format.raw/*9.30*/("""
  """),_display_(/*10.4*/form(routes.OpinionController.addOpinion())/*10.47*/ {_display_(Seq[Any](format.raw/*10.49*/("""
		"""),_display_(/*11.4*/inputText(opinion("opinion"))),format.raw/*11.33*/("""

	  	"""),format.raw/*13.5*/("""<select name="product" id="product">
		"""),_display_(/*14.4*/for(prod <- product) yield /*14.24*/{_display_(Seq[Any](format.raw/*14.25*/("""
			"""),format.raw/*15.4*/("""<option value=""""),_display_(/*15.20*/prod/*15.24*/.id),format.raw/*15.27*/("""">"""),_display_(/*15.30*/prod/*15.34*/.name),format.raw/*15.39*/("""</option>
		""")))}),format.raw/*16.4*/("""
		"""),format.raw/*17.3*/("""</select>

		"""),_display_(/*19.4*/CSRF/*19.8*/.formField),format.raw/*19.18*/("""

		"""),format.raw/*21.3*/("""<div class="buttons">
			<input type="submit" value="Add opinion"/>
		</div>
	""")))}),format.raw/*24.3*/("""
""")))}),format.raw/*25.2*/("""
"""))
      }
    }
  }

  def render(opinion:Form[CreateOpinionForm],product:Seq[Product],request:MessagesRequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(opinion,product)(request)

  def f:((Form[CreateOpinionForm],Seq[Product]) => (MessagesRequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (opinion,product) => (request) => apply(opinion,product)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Apr 30 22:28:18 CEST 2018
                  SOURCE: /home/dawid/IdeaProjects/Ebusiness/app/views/opinion.scala.html
                  HASH: c262b80b2415c0718c66e6d389b1dc6000e6f006
                  MATRIX: 783->1|954->102|998->100|1025->118|1052->120|1066->127|1099->152|1145->161|1175->166|1190->173|1224->187|1255->189|1283->192|1317->218|1356->220|1386->224|1438->267|1478->269|1508->273|1558->302|1591->308|1657->348|1693->368|1732->369|1763->373|1806->389|1819->393|1843->396|1873->399|1886->403|1912->408|1955->421|1985->424|2025->438|2037->442|2068->452|2099->456|2208->535|2240->537
                  LINES: 21->1|24->3|27->2|28->4|29->5|29->5|29->5|29->5|30->6|30->6|30->6|31->7|33->9|33->9|33->9|34->10|34->10|34->10|35->11|35->11|37->13|38->14|38->14|38->14|39->15|39->15|39->15|39->15|39->15|39->15|39->15|40->16|41->17|43->19|43->19|43->19|45->21|48->24|49->25
                  -- GENERATED --
              */
          