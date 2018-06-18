
package views.html

/*1.2*/import play.api.i18n.Messages
/*2.2*/import play.api.mvc.RequestHeader
/*3.2*/import org.webjars.play.WebJarsUtil
/*4.2*/import controllers.AssetsFinder

object home extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template5[models.User,RequestHeader,Messages,WebJarsUtil,AssetsFinder,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(user: models.User)(implicit request: RequestHeader, messages: Messages, webJarsUtil: WebJarsUtil, assets: AssetsFinder):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.1*/("""
"""),_display_(/*8.2*/main(messages("home.title"), Some(user))/*8.42*/ {_display_(Seq[Any](format.raw/*8.44*/("""
    """),format.raw/*9.5*/("""<div class="user col-md-6 col-md-offset-3">
        <div class="row">
            <hr class="col-md-12" />
            <h4 class="col-md-8">"""),_display_(/*12.35*/messages("Welcome!")),format.raw/*12.55*/("""</h4>
            <hr class="col-md-12" />
        </div>
        <div class="row data">
            <div class="col-md-12">
                <div class="row">
                    <p class="col-md-6"><strong>"""),_display_(/*18.50*/messages("First name")),format.raw/*18.72*/(""":</strong></p><p class="col-md-6">"""),_display_(/*18.107*/user/*18.111*/.firstName.getOrElse("None")),format.raw/*18.139*/("""</p>
                </div>
                <div class="row">
                    <p class="col-md-6"><strong>"""),_display_(/*21.50*/messages("Last name")),format.raw/*21.71*/(""":</strong></p><p class="col-md-6">"""),_display_(/*21.106*/user/*21.110*/.lastName.getOrElse("None")),format.raw/*21.137*/("""</p>
                </div>
                <div class="row">
                    <p class="col-md-6"><strong>"""),_display_(/*24.50*/messages("Email")),format.raw/*24.67*/(""":</strong></p><p class="col-md-6">"""),_display_(/*24.102*/user/*24.106*/.email.getOrElse("None")),format.raw/*24.130*/("""</p>
                </div>
            </div>
        </div>
    </div>
""")))}))
      }
    }
  }

  def render(user:models.User,request:RequestHeader,messages:Messages,webJarsUtil:WebJarsUtil,assets:AssetsFinder): play.twirl.api.HtmlFormat.Appendable = apply(user)(request,messages,webJarsUtil,assets)

  def f:((models.User) => (RequestHeader,Messages,WebJarsUtil,AssetsFinder) => play.twirl.api.HtmlFormat.Appendable) = (user) => (request,messages,webJarsUtil,assets) => apply(user)(request,messages,webJarsUtil,assets)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Jun 15 18:00:24 CEST 2018
                  SOURCE: /home/dawid/IdeaProjects/ebusiness/app/views/home.scala.html
                  HASH: fe508c2223695a494712bb99f068e6d1b2aa35a5
                  MATRIX: 28->1|65->32|106->67|149->104|537->138|751->259|778->261|826->301|865->303|896->308|1064->449|1105->469|1340->677|1383->699|1446->734|1460->738|1510->766|1648->877|1690->898|1753->933|1767->937|1816->964|1954->1075|1992->1092|2055->1127|2069->1131|2115->1155
                  LINES: 4->1|5->2|6->3|7->4|12->6|17->7|18->8|18->8|18->8|19->9|22->12|22->12|28->18|28->18|28->18|28->18|28->18|31->21|31->21|31->21|31->21|31->21|34->24|34->24|34->24|34->24|34->24
                  -- GENERATED --
              */
          