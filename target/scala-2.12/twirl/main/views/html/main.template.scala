
package views.html

/*1.2*/import play.api.i18n.Messages
/*2.2*/import play.api.mvc.RequestHeader
/*3.2*/import play.twirl.api.Html
/*4.2*/import org.webjars.play.WebJarsUtil
/*5.2*/import controllers.AssetsFinder

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template7[String,Option[models.User],Html,RequestHeader,Messages,AssetsFinder,WebJarsUtil,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*7.2*/(title: String, user: Option[models.User]=None)(content: Html)(implicit request: RequestHeader, messages: Messages, assets: AssetsFinder, webJarsUtil: WebJarsUtil):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*8.1*/("""
"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*15.59*/assets/*15.65*/.path("images/favicon.png")),format.raw/*15.92*/("""">
        <title>"""),_display_(/*16.17*/title),format.raw/*16.22*/("""</title>
        <link href="//fonts.googleapis.com/css?family=Roboto|Montserrat:400,700|Open+Sans:400,300,600" rel="stylesheet">
        <link href="//cdnjs.cloudflare.com/ajax/libs/ionicons/1.5.2/css/ionicons.min.css" rel="stylesheet">
        """),_display_(/*19.10*/Html(webJarsUtil.css("bootstrap.min.css"))),format.raw/*19.52*/("""
        """),_display_(/*20.10*/Html(webJarsUtil.css("bootstrap-theme.min.css"))),format.raw/*20.58*/("""
        """),format.raw/*21.9*/("""<link rel="stylesheet" href=""""),_display_(/*21.39*/assets/*21.45*/.path("styles/main.css")),format.raw/*21.69*/("""">
            <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
            <!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
            <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
            <![endif]-->
    </head>
    <body>
        <header class="navbar navbar-inverse navbar-fixed-top" role="navigation">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="sr-only">"""),_display_(/*33.48*/messages("toggle.navigation")),format.raw/*33.77*/("""</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href=""""),_display_(/*38.52*/controllers/*38.63*/.routes.ApplicationController.index),format.raw/*38.98*/("""">Silhouette Seed Template</a>
                </div>
                <nav class="collapse navbar-collapse">
                    <ul class="nav navbar-nav">
                        <li><a href=""""),_display_(/*42.39*/controllers/*42.50*/.routes.ApplicationController.index),format.raw/*42.85*/("""">"""),_display_(/*42.88*/messages("Home")),format.raw/*42.104*/("""</a></li>
                        <li><a href="https://github.com/mohiva/play-silhouette-seed">GitHub</a></li>
                    </ul>
                    <ul class="nav navbar-nav navbar-right">
                    """),_display_(/*46.22*/user/*46.26*/.map/*46.30*/ { u =>_display_(Seq[Any](format.raw/*46.37*/("""
                    """),format.raw/*47.21*/("""<li><a href=""""),_display_(/*47.35*/controllers/*47.46*/.routes.ApplicationController.index),format.raw/*47.81*/("""">"""),_display_(/*47.84*/u/*47.85*/.name),format.raw/*47.90*/("""</a></li>
                    <li><a href=""""),_display_(/*48.35*/controllers/*48.46*/.routes.ApplicationController.signOut),format.raw/*48.83*/("""">"""),_display_(/*48.86*/messages("Sign out")),format.raw/*48.106*/("""</a></li>
                    """)))}/*49.22*/.getOrElse/*49.32*/ {_display_(Seq[Any](format.raw/*49.34*/("""
                        """),format.raw/*50.25*/("""<li><a href=""""),_display_(/*50.39*/controllers/*50.50*/.routes.SignInController.view),format.raw/*50.79*/("""">"""),_display_(/*50.82*/messages("Sign in")),format.raw/*50.101*/("""</a></li>

                    """)))}),format.raw/*52.22*/("""
                    """),format.raw/*53.21*/("""</ul>
                </nav>
            </div>
        </header>
        <main class="container">
            <div class="starter-template row">
                """),_display_(/*59.18*/request/*59.25*/.flash.get("error").map/*59.48*/ { msg =>_display_(Seq[Any](format.raw/*59.57*/("""
                    """),format.raw/*60.21*/("""<div class="col-md-6 col-md-offset-3 alert alert-danger">
                        <a href="#" class="close" data-dismiss="alert">&times;</a>
                        <strong>"""),_display_(/*62.34*/messages("error")),format.raw/*62.51*/("""</strong> """),_display_(/*62.62*/msg),format.raw/*62.65*/("""
                    """),format.raw/*63.21*/("""</div>
                """)))}),format.raw/*64.18*/("""
                """),_display_(/*65.18*/request/*65.25*/.flash.get("info").map/*65.47*/ { msg =>_display_(Seq[Any](format.raw/*65.56*/("""
                    """),format.raw/*66.21*/("""<div class="col-md-6 col-md-offset-3 alert alert-info">
                        <a href="#" class="close" data-dismiss="alert">&times;</a>
                        <strong>"""),_display_(/*68.34*/messages("info")),format.raw/*68.50*/("""</strong> """),_display_(/*68.61*/msg),format.raw/*68.64*/("""
                    """),format.raw/*69.21*/("""</div>
                """)))}),format.raw/*70.18*/("""
                """),_display_(/*71.18*/request/*71.25*/.flash.get("success").map/*71.50*/ { msg =>_display_(Seq[Any](format.raw/*71.59*/("""
                    """),format.raw/*72.21*/("""<div class="col-md-6 col-md-offset-3 alert alert-success">
                        <a href="#" class="close" data-dismiss="alert">&times;</a>
                        <strong>"""),_display_(/*74.34*/messages("success")),format.raw/*74.53*/("""</strong> """),_display_(/*74.64*/msg),format.raw/*74.67*/("""
                    """),format.raw/*75.21*/("""</div>
                """)))}),format.raw/*76.18*/("""
                """),_display_(/*77.18*/content),format.raw/*77.25*/("""
            """),format.raw/*78.13*/("""</div>
        </main>
        """),_display_(/*80.10*/Html(webJarsUtil.script("jquery.min.js"))),format.raw/*80.51*/("""
        """),_display_(/*81.10*/Html(webJarsUtil.script("bootstrap.min.js"))),format.raw/*81.54*/("""
        """),format.raw/*82.9*/("""<script src="https://cdnjs.cloudflare.com/ajax/libs/zxcvbn/4.2.0/zxcvbn.js"></script>
        <script src=""""),_display_(/*83.23*/assets/*83.29*/.path("javascripts/zxcvbnShim.js")),format.raw/*83.63*/(""""></script>
    </body>
</html>"""))
      }
    }
  }

  def render(title:String,user:Option[models.User],content:Html,request:RequestHeader,messages:Messages,assets:AssetsFinder,webJarsUtil:WebJarsUtil): play.twirl.api.HtmlFormat.Appendable = apply(title,user)(content)(request,messages,assets,webJarsUtil)

  def f:((String,Option[models.User]) => (Html) => (RequestHeader,Messages,AssetsFinder,WebJarsUtil) => play.twirl.api.HtmlFormat.Appendable) = (title,user) => (content) => (request,messages,assets,webJarsUtil) => apply(title,user)(content)(request,messages,assets,webJarsUtil)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Jun 15 01:43:00 CEST 2018
                  SOURCE: /home/dawid/IdeaProjects/ebusiness/app/views/main.scala.html
                  HASH: b633c37987b57fbe0f98c9e434ef1f2eaf6c62d1
                  MATRIX: 28->1|65->32|106->67|140->95|183->132|591->166|848->330|875->331|1174->603|1189->609|1237->636|1283->655|1309->660|1583->907|1646->949|1683->959|1752->1007|1788->1016|1845->1046|1860->1052|1905->1076|2625->1769|2675->1798|2956->2052|2976->2063|3032->2098|3254->2293|3274->2304|3330->2339|3360->2342|3398->2358|3644->2577|3657->2581|3670->2585|3715->2592|3764->2613|3805->2627|3825->2638|3881->2673|3911->2676|3921->2677|3947->2682|4018->2726|4038->2737|4096->2774|4126->2777|4168->2797|4218->2828|4237->2838|4277->2840|4330->2865|4371->2879|4391->2890|4441->2919|4471->2922|4512->2941|4575->2973|4624->2994|4814->3157|4830->3164|4862->3187|4909->3196|4958->3217|5159->3391|5197->3408|5235->3419|5259->3422|5308->3443|5363->3467|5408->3485|5424->3492|5455->3514|5502->3523|5551->3544|5750->3716|5787->3732|5825->3743|5849->3746|5898->3767|5953->3791|5998->3809|6014->3816|6048->3841|6095->3850|6144->3871|6346->4046|6386->4065|6424->4076|6448->4079|6497->4100|6552->4124|6597->4142|6625->4149|6666->4162|6725->4194|6787->4235|6824->4245|6889->4289|6925->4298|7060->4406|7075->4412|7130->4446
                  LINES: 4->1|5->2|6->3|7->4|8->5|13->7|18->8|19->9|25->15|25->15|25->15|26->16|26->16|29->19|29->19|30->20|30->20|31->21|31->21|31->21|31->21|43->33|43->33|48->38|48->38|48->38|52->42|52->42|52->42|52->42|52->42|56->46|56->46|56->46|56->46|57->47|57->47|57->47|57->47|57->47|57->47|57->47|58->48|58->48|58->48|58->48|58->48|59->49|59->49|59->49|60->50|60->50|60->50|60->50|60->50|60->50|62->52|63->53|69->59|69->59|69->59|69->59|70->60|72->62|72->62|72->62|72->62|73->63|74->64|75->65|75->65|75->65|75->65|76->66|78->68|78->68|78->68|78->68|79->69|80->70|81->71|81->71|81->71|81->71|82->72|84->74|84->74|84->74|84->74|85->75|86->76|87->77|87->77|88->78|90->80|90->80|91->81|91->81|92->82|93->83|93->83|93->83
                  -- GENERATED --
              */
          