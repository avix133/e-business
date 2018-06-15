
package views.html

/*2.2*/import play.api.data.Form
/*3.2*/import play.api.i18n.Messages
/*4.2*/import play.api.mvc.RequestHeader
/*5.2*/import org.webjars.play.WebJarsUtil
/*6.2*/import controllers.AssetsFinder
/*7.2*/import com.mohiva.play.silhouette.impl.providers.SocialProviderRegistry
/*8.2*/import forms.SignInForm.Data
/*9.2*/import b3.inline.fieldConstructor

object signIn extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template6[Form[Data],SocialProviderRegistry,RequestHeader,Messages,WebJarsUtil,AssetsFinder,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*11.2*/(signInForm: Form[Data], socialProviders: SocialProviderRegistry)(implicit request: RequestHeader, messages: Messages, webJarsUtil: WebJarsUtil, assets: AssetsFinder):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*12.1*/("""
"""),_display_(/*13.2*/main(messages("My Shop"))/*13.27*/ {_display_(Seq[Any](format.raw/*13.29*/("""
    """),format.raw/*14.5*/("""<fieldset class="col-md-6 col-md-offset-3">
        <legend>"""),_display_(/*15.18*/messages("Sign in credentials")),format.raw/*15.49*/("""</legend>
        """),_display_(/*16.10*/helper/*16.16*/.form(action = controllers.routes.SignInController.submit())/*16.76*/ {_display_(Seq[Any](format.raw/*16.78*/("""
            """),_display_(/*17.14*/b3/*17.16*/.email(signInForm("email"), '_hiddenLabel -> messages("email"), 'placeholder -> messages("email"), 'class -> "form-control input-lg")),format.raw/*17.149*/("""
            """),_display_(/*18.14*/b3/*18.16*/.password(signInForm("password"), '_hiddenLabel -> messages("password"), 'placeholder -> messages("password"), 'class -> "form-control input-lg")),format.raw/*18.161*/("""
            """),_display_(/*19.14*/b3/*19.16*/.checkbox(signInForm("rememberMe"), '_text -> messages("Remember me"), 'checked -> true)),format.raw/*19.104*/("""
            """),format.raw/*20.13*/("""<div class="form-group">
                <div>
                    <button id="submit" type="submit" value="submit" class="btn btn-lg btn-primary btn-block">"""),_display_(/*22.112*/messages("Sign in")),format.raw/*22.131*/("""</button>
                </div>
            </div>
        """)))}),format.raw/*25.10*/("""

        """),_display_(/*27.10*/if(socialProviders.providers.nonEmpty)/*27.48*/ {_display_(Seq[Any](format.raw/*27.50*/("""
            """),format.raw/*28.13*/("""<div class="social-providers">
                <p>"""),_display_(/*29.21*/messages("Or use social:")),format.raw/*29.47*/("""</p>
                <div>
                """),_display_(/*31.18*/for(p <- socialProviders.providers) yield /*31.53*/ {_display_(Seq[Any](format.raw/*31.55*/("""
                    """),format.raw/*32.21*/("""<a href=""""),_display_(/*32.31*/controllers/*32.42*/.routes.SocialAuthController.authenticate(p.id)),format.raw/*32.89*/("""" class="provider """),_display_(/*32.108*/p/*32.109*/.id),format.raw/*32.112*/("""" title=""""),_display_(/*32.122*/messages(p.id)),format.raw/*32.136*/(""""><img src=""""),_display_(/*32.149*/assets/*32.155*/.path(s"images/providers/${p.id}.png")),format.raw/*32.193*/("""" width="64px" height="64px" alt=""""),_display_(/*32.228*/messages(p.id)),format.raw/*32.242*/(""""></a>
                """)))}),format.raw/*33.18*/("""
                """),format.raw/*34.17*/("""</div>
            </div>
        """)))}),format.raw/*36.10*/("""

    """),format.raw/*38.5*/("""</fieldset>
""")))}))
      }
    }
  }

  def render(signInForm:Form[Data],socialProviders:SocialProviderRegistry,request:RequestHeader,messages:Messages,webJarsUtil:WebJarsUtil,assets:AssetsFinder): play.twirl.api.HtmlFormat.Appendable = apply(signInForm,socialProviders)(request,messages,webJarsUtil,assets)

  def f:((Form[Data],SocialProviderRegistry) => (RequestHeader,Messages,WebJarsUtil,AssetsFinder) => play.twirl.api.HtmlFormat.Appendable) = (signInForm,socialProviders) => (request,messages,webJarsUtil,assets) => apply(signInForm,socialProviders)(request,messages,webJarsUtil,assets)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Jun 15 01:41:40 CEST 2018
                  SOURCE: /home/dawid/IdeaProjects/ebusiness/app/views/signIn.scala.html
                  HASH: 8750b3a39cb2adea694bf4d293eab006f0a9b837
                  MATRIX: 28->2|61->29|98->60|139->95|182->132|221->165|300->238|336->268|751->304|1012->471|1040->473|1074->498|1114->500|1146->505|1234->566|1286->597|1332->616|1347->622|1416->682|1456->684|1497->698|1508->700|1663->833|1704->847|1715->849|1882->994|1923->1008|1934->1010|2044->1098|2085->1111|2271->1269|2312->1288|2404->1349|2442->1360|2489->1398|2529->1400|2570->1413|2648->1464|2695->1490|2766->1534|2817->1569|2857->1571|2906->1592|2943->1602|2963->1613|3031->1660|3078->1679|3089->1680|3114->1683|3152->1693|3188->1707|3229->1720|3245->1726|3305->1764|3368->1799|3404->1813|3459->1837|3504->1854|3570->1889|3603->1895
                  LINES: 4->2|5->3|6->4|7->5|8->6|9->7|10->8|11->9|16->11|21->12|22->13|22->13|22->13|23->14|24->15|24->15|25->16|25->16|25->16|25->16|26->17|26->17|26->17|27->18|27->18|27->18|28->19|28->19|28->19|29->20|31->22|31->22|34->25|36->27|36->27|36->27|37->28|38->29|38->29|40->31|40->31|40->31|41->32|41->32|41->32|41->32|41->32|41->32|41->32|41->32|41->32|41->32|41->32|41->32|41->32|41->32|42->33|43->34|45->36|47->38
                  -- GENERATED --
              */
          