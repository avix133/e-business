// @GENERATOR:play-routes-compiler
// @SOURCE:/home/dawid/IdeaProjects/Ebusiness/conf/routes
// @DATE:Sun Apr 29 22:44:06 CEST 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  ProductController_4: controllers.ProductController,
  // @LINE:9
  CategoryController_5: controllers.CategoryController,
  // @LINE:12
  BasketIdsController_7: controllers.BasketIdsController,
  // @LINE:15
  BasketProductController_2: controllers.BasketProductController,
  // @LINE:16
  OpinionController_3: controllers.OpinionController,
  // @LINE:17
  PaymentController_1: controllers.PaymentController,
  // @LINE:18
  KeywordController_0: controllers.KeywordController,
  // @LINE:22
  Assets_6: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    ProductController_4: controllers.ProductController,
    // @LINE:9
    CategoryController_5: controllers.CategoryController,
    // @LINE:12
    BasketIdsController_7: controllers.BasketIdsController,
    // @LINE:15
    BasketProductController_2: controllers.BasketProductController,
    // @LINE:16
    OpinionController_3: controllers.OpinionController,
    // @LINE:17
    PaymentController_1: controllers.PaymentController,
    // @LINE:18
    KeywordController_0: controllers.KeywordController,
    // @LINE:22
    Assets_6: controllers.Assets
  ) = this(errorHandler, ProductController_4, CategoryController_5, BasketIdsController_7, BasketProductController_2, OpinionController_3, PaymentController_1, KeywordController_0, Assets_6, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, ProductController_4, CategoryController_5, BasketIdsController_7, BasketProductController_2, OpinionController_3, PaymentController_1, KeywordController_0, Assets_6, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.ProductController.index"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addproduct""", """controllers.ProductController.addProduct"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """products""", """controllers.ProductController.getProducts"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """categories""", """controllers.CategoryController.getCategories"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """category""", """controllers.CategoryController.index"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addcategory""", """controllers.CategoryController.addCategory"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """basket_ids""", """controllers.BasketIdsController.getBasketIds"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """basketid""", """controllers.BasketIdsController.index"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addbasketid""", """controllers.BasketIdsController.addBasketId"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """basket_product""", """controllers.BasketProductController.getBasketProducts"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """opinions""", """controllers.OpinionController.getOpinions"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """payments""", """controllers.PaymentController.getPayments"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """keywords""", """controllers.KeywordController.getKeywords"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_ProductController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_ProductController_index0_invoker = createInvoker(
    ProductController_4.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ Home page""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_ProductController_addProduct1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addproduct")))
  )
  private[this] lazy val controllers_ProductController_addProduct1_invoker = createInvoker(
    ProductController_4.addProduct,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductController",
      "addProduct",
      Nil,
      "POST",
      this.prefix + """addproduct""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_ProductController_getProducts2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("products")))
  )
  private[this] lazy val controllers_ProductController_getProducts2_invoker = createInvoker(
    ProductController_4.getProducts,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductController",
      "getProducts",
      Nil,
      "GET",
      this.prefix + """products""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_CategoryController_getCategories3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("categories")))
  )
  private[this] lazy val controllers_CategoryController_getCategories3_invoker = createInvoker(
    CategoryController_5.getCategories,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CategoryController",
      "getCategories",
      Nil,
      "GET",
      this.prefix + """categories""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_CategoryController_index4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("category")))
  )
  private[this] lazy val controllers_CategoryController_index4_invoker = createInvoker(
    CategoryController_5.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CategoryController",
      "index",
      Nil,
      "GET",
      this.prefix + """category""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_CategoryController_addCategory5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addcategory")))
  )
  private[this] lazy val controllers_CategoryController_addCategory5_invoker = createInvoker(
    CategoryController_5.addCategory,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CategoryController",
      "addCategory",
      Nil,
      "POST",
      this.prefix + """addcategory""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_BasketIdsController_getBasketIds6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("basket_ids")))
  )
  private[this] lazy val controllers_BasketIdsController_getBasketIds6_invoker = createInvoker(
    BasketIdsController_7.getBasketIds,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BasketIdsController",
      "getBasketIds",
      Nil,
      "GET",
      this.prefix + """basket_ids""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_BasketIdsController_index7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("basketid")))
  )
  private[this] lazy val controllers_BasketIdsController_index7_invoker = createInvoker(
    BasketIdsController_7.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BasketIdsController",
      "index",
      Nil,
      "GET",
      this.prefix + """basketid""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_BasketIdsController_addBasketId8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addbasketid")))
  )
  private[this] lazy val controllers_BasketIdsController_addBasketId8_invoker = createInvoker(
    BasketIdsController_7.addBasketId,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BasketIdsController",
      "addBasketId",
      Nil,
      "POST",
      this.prefix + """addbasketid""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_BasketProductController_getBasketProducts9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("basket_product")))
  )
  private[this] lazy val controllers_BasketProductController_getBasketProducts9_invoker = createInvoker(
    BasketProductController_2.getBasketProducts,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BasketProductController",
      "getBasketProducts",
      Nil,
      "GET",
      this.prefix + """basket_product""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_OpinionController_getOpinions10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("opinions")))
  )
  private[this] lazy val controllers_OpinionController_getOpinions10_invoker = createInvoker(
    OpinionController_3.getOpinions,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OpinionController",
      "getOpinions",
      Nil,
      "GET",
      this.prefix + """opinions""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_PaymentController_getPayments11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("payments")))
  )
  private[this] lazy val controllers_PaymentController_getPayments11_invoker = createInvoker(
    PaymentController_1.getPayments,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PaymentController",
      "getPayments",
      Nil,
      "GET",
      this.prefix + """payments""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_KeywordController_getKeywords12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("keywords")))
  )
  private[this] lazy val controllers_KeywordController_getKeywords12_invoker = createInvoker(
    KeywordController_0.getKeywords,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.KeywordController",
      "getKeywords",
      Nil,
      "GET",
      this.prefix + """keywords""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_Assets_versioned13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned13_invoker = createInvoker(
    Assets_6.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_ProductController_index0_route(params@_) =>
      call { 
        controllers_ProductController_index0_invoker.call(ProductController_4.index)
      }
  
    // @LINE:7
    case controllers_ProductController_addProduct1_route(params@_) =>
      call { 
        controllers_ProductController_addProduct1_invoker.call(ProductController_4.addProduct)
      }
  
    // @LINE:8
    case controllers_ProductController_getProducts2_route(params@_) =>
      call { 
        controllers_ProductController_getProducts2_invoker.call(ProductController_4.getProducts)
      }
  
    // @LINE:9
    case controllers_CategoryController_getCategories3_route(params@_) =>
      call { 
        controllers_CategoryController_getCategories3_invoker.call(CategoryController_5.getCategories)
      }
  
    // @LINE:10
    case controllers_CategoryController_index4_route(params@_) =>
      call { 
        controllers_CategoryController_index4_invoker.call(CategoryController_5.index)
      }
  
    // @LINE:11
    case controllers_CategoryController_addCategory5_route(params@_) =>
      call { 
        controllers_CategoryController_addCategory5_invoker.call(CategoryController_5.addCategory)
      }
  
    // @LINE:12
    case controllers_BasketIdsController_getBasketIds6_route(params@_) =>
      call { 
        controllers_BasketIdsController_getBasketIds6_invoker.call(BasketIdsController_7.getBasketIds)
      }
  
    // @LINE:13
    case controllers_BasketIdsController_index7_route(params@_) =>
      call { 
        controllers_BasketIdsController_index7_invoker.call(BasketIdsController_7.index)
      }
  
    // @LINE:14
    case controllers_BasketIdsController_addBasketId8_route(params@_) =>
      call { 
        controllers_BasketIdsController_addBasketId8_invoker.call(BasketIdsController_7.addBasketId)
      }
  
    // @LINE:15
    case controllers_BasketProductController_getBasketProducts9_route(params@_) =>
      call { 
        controllers_BasketProductController_getBasketProducts9_invoker.call(BasketProductController_2.getBasketProducts)
      }
  
    // @LINE:16
    case controllers_OpinionController_getOpinions10_route(params@_) =>
      call { 
        controllers_OpinionController_getOpinions10_invoker.call(OpinionController_3.getOpinions)
      }
  
    // @LINE:17
    case controllers_PaymentController_getPayments11_route(params@_) =>
      call { 
        controllers_PaymentController_getPayments11_invoker.call(PaymentController_1.getPayments)
      }
  
    // @LINE:18
    case controllers_KeywordController_getKeywords12_route(params@_) =>
      call { 
        controllers_KeywordController_getKeywords12_invoker.call(KeywordController_0.getKeywords)
      }
  
    // @LINE:22
    case controllers_Assets_versioned13_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned13_invoker.call(Assets_6.versioned(path, file))
      }
  }
}
