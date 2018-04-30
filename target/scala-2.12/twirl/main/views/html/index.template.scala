
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[CreateProductForm],Seq[Category],MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(product: Form[CreateProductForm], category: Seq[Category])(implicit request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/request/*5.9*/.flash.get("success").map/*5.34*/ { key =>_display_(Seq[Any](format.raw/*5.43*/("""
   """),_display_(/*6.5*/request/*6.12*/.messages(key)),format.raw/*6.26*/("""
""")))}),format.raw/*7.2*/("""

"""),_display_(/*9.2*/main("Welcome to Ebiznes")/*9.28*/ {_display_(Seq[Any](format.raw/*9.30*/("""
  """),_display_(/*10.4*/form(routes.ProductController.addProduct())/*10.47*/ {_display_(Seq[Any](format.raw/*10.49*/("""
		"""),_display_(/*11.4*/inputText(product("name"))),format.raw/*11.30*/("""
		"""),_display_(/*12.4*/inputText(product("description"))),format.raw/*12.37*/("""

	  """),format.raw/*14.4*/("""<select name="category" id="category">
		"""),_display_(/*15.4*/for(cat <- category) yield /*15.24*/{_display_(Seq[Any](format.raw/*15.25*/("""
			"""),format.raw/*16.4*/("""<option value=""""),_display_(/*16.20*/cat/*16.23*/.id),format.raw/*16.26*/("""">"""),_display_(/*16.29*/cat/*16.32*/.name),format.raw/*16.37*/("""</option>
		""")))}),format.raw/*17.4*/("""
	  """),format.raw/*18.4*/("""</select>


		"""),_display_(/*21.4*/CSRF/*21.8*/.formField),format.raw/*21.18*/("""

		"""),format.raw/*23.3*/("""<div class="buttons">
			<input type="submit" value="Add Product"/>
		</div>
	""")))}),format.raw/*26.3*/("""
""")))}),format.raw/*27.2*/("""
"""))
      }
    }
  }

  def render(product:Form[CreateProductForm],category:Seq[Category],request:MessagesRequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(product,category)(request)

  def f:((Form[CreateProductForm],Seq[Category]) => (MessagesRequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (product,category) => (request) => apply(product,category)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Apr 30 22:28:18 CEST 2018
                  SOURCE: /home/dawid/IdeaProjects/Ebusiness/app/views/index.scala.html
                  HASH: 23f080bb92401f71493231589f894cd72a88e8b4
                  MATRIX: 782->1|955->104|999->102|1026->120|1053->122|1067->129|1100->154|1146->163|1176->168|1191->175|1225->189|1256->191|1284->194|1318->220|1357->222|1387->226|1439->269|1479->271|1509->275|1556->301|1586->305|1640->338|1672->343|1740->385|1776->405|1815->406|1846->410|1889->426|1901->429|1925->432|1955->435|1967->438|1993->443|2036->456|2067->460|2108->475|2120->479|2151->489|2182->493|2291->572|2323->574
                  LINES: 21->1|24->3|27->2|28->4|29->5|29->5|29->5|29->5|30->6|30->6|30->6|31->7|33->9|33->9|33->9|34->10|34->10|34->10|35->11|35->11|36->12|36->12|38->14|39->15|39->15|39->15|40->16|40->16|40->16|40->16|40->16|40->16|40->16|41->17|42->18|45->21|45->21|45->21|47->23|50->26|51->27
                  -- GENERATED --
              */
          