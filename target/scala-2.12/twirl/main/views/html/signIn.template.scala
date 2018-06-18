
package views.html

/*1.2*/import play.api.data.Form
/*2.2*/import play.api.i18n.Messages
/*3.2*/import play.api.mvc.RequestHeader
/*4.2*/import org.webjars.play.WebJarsUtil
/*5.2*/import controllers.AssetsFinder
/*6.2*/import com.mohiva.play.silhouette.impl.providers.SocialProviderRegistry
/*7.2*/import forms.SignInForm.Data
/*8.2*/import b3.inline.fieldConstructor

object signIn extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template6[Form[Data],SocialProviderRegistry,RequestHeader,Messages,WebJarsUtil,AssetsFinder,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*10.2*/(signInForm: Form[Data], socialProviders: SocialProviderRegistry)(implicit request: RequestHeader, messages: Messages, webJarsUtil: WebJarsUtil, assets: AssetsFinder):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*11.1*/("""
"""),_display_(/*12.2*/main(messages("My Shop"))/*12.27*/ {_display_(Seq[Any](format.raw/*12.29*/("""
    """),format.raw/*13.5*/("""<fieldset class="col-md-6 col-md-offset-3">
        <legend>"""),_display_(/*14.18*/messages("Sign in credentials")),format.raw/*14.49*/("""</legend>
        """),_display_(/*15.10*/helper/*15.16*/.form(action = controllers.routes.SignInController.submit())/*15.76*/ {_display_(Seq[Any](format.raw/*15.78*/("""
            """),_display_(/*16.14*/b3/*16.16*/.email(signInForm("email"), '_hiddenLabel -> messages("email"), 'placeholder -> messages("email"), 'class -> "form-control input-lg")),format.raw/*16.149*/("""
            """),_display_(/*17.14*/b3/*17.16*/.password(signInForm("password"), '_hiddenLabel -> messages("password"), 'placeholder -> messages("password"), 'class -> "form-control input-lg")),format.raw/*17.161*/("""
            """),_display_(/*18.14*/b3/*18.16*/.checkbox(signInForm("rememberMe"), '_text -> messages("Remember me"), 'checked -> true)),format.raw/*18.104*/("""
            """),format.raw/*19.13*/("""<div class="form-group">
                <div>
                    <button id="submit" type="submit" value="submit" class="btn btn-lg btn-primary btn-block">"""),_display_(/*21.112*/messages("Sign in")),format.raw/*21.131*/("""</button>
                </div>
            </div>
        """)))}),format.raw/*24.10*/("""

        """),_display_(/*26.10*/if(socialProviders.providers.nonEmpty)/*26.48*/ {_display_(Seq[Any](format.raw/*26.50*/("""
            """),format.raw/*27.13*/("""<div class="social-providers">
                <p>"""),_display_(/*28.21*/messages("Or use social:")),format.raw/*28.47*/("""</p>
                <div>
                """),_display_(/*30.18*/for(p <- socialProviders.providers) yield /*30.53*/ {_display_(Seq[Any](format.raw/*30.55*/("""
                    """),format.raw/*31.21*/("""<a href=""""),_display_(/*31.31*/controllers/*31.42*/.routes.SocialAuthController.authenticate(p.id)),format.raw/*31.89*/("""" class="provider """),_display_(/*31.108*/p/*31.109*/.id),format.raw/*31.112*/("""" title=""""),_display_(/*31.122*/messages(p.id)),format.raw/*31.136*/(""""><img src=""""),_display_(/*31.149*/assets/*31.155*/.path(s"images/providers/${p.id}.png")),format.raw/*31.193*/("""" width="64px" height="64px" alt=""""),_display_(/*31.228*/messages(p.id)),format.raw/*31.242*/(""""></a>
                """)))}),format.raw/*32.18*/("""
                """),format.raw/*33.17*/("""</div>
            </div>
        """)))}),format.raw/*35.10*/("""

    """),format.raw/*37.5*/("""</fieldset>
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
                  DATE: Fri Jun 15 21:27:25 CEST 2018
                  SOURCE: /home/dawid/IdeaProjects/ebusiness/app/views/signIn.scala.html
                  HASH: 32fe99089b2d93cb2a3a80d212b221203e1f1263
                  MATRIX: 28->1|61->28|98->59|139->94|182->131|221->164|300->237|336->267|751->303|1012->470|1040->472|1074->497|1114->499|1146->504|1234->565|1286->596|1332->615|1347->621|1416->681|1456->683|1497->697|1508->699|1663->832|1704->846|1715->848|1882->993|1923->1007|1934->1009|2044->1097|2085->1110|2271->1268|2312->1287|2404->1348|2442->1359|2489->1397|2529->1399|2570->1412|2648->1463|2695->1489|2766->1533|2817->1568|2857->1570|2906->1591|2943->1601|2963->1612|3031->1659|3078->1678|3089->1679|3114->1682|3152->1692|3188->1706|3229->1719|3245->1725|3305->1763|3368->1798|3404->1812|3459->1836|3504->1853|3570->1888|3603->1894
                  LINES: 4->1|5->2|6->3|7->4|8->5|9->6|10->7|11->8|16->10|21->11|22->12|22->12|22->12|23->13|24->14|24->14|25->15|25->15|25->15|25->15|26->16|26->16|26->16|27->17|27->17|27->17|28->18|28->18|28->18|29->19|31->21|31->21|34->24|36->26|36->26|36->26|37->27|38->28|38->28|40->30|40->30|40->30|41->31|41->31|41->31|41->31|41->31|41->31|41->31|41->31|41->31|41->31|41->31|41->31|41->31|41->31|42->32|43->33|45->35|47->37
                  -- GENERATED --
              */
          