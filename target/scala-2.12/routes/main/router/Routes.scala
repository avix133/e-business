// @GENERATOR:play-routes-compiler
// @SOURCE:/home/dawid/IdeaProjects/ebusiness/conf/routes
// @DATE:Sat Jun 16 03:44:54 CEST 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.utils.route.Binders._

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:12
  ProductController_3: controllers.ProductController,
  // @LINE:16
  CartProductController_2: controllers.CartProductController,
  // @LINE:19
  CommentsController_9: controllers.CommentsController,
  // @LINE:23
  OrdersController_1: controllers.OrdersController,
  // @LINE:31
  CategoryController_5: controllers.CategoryController,
  // @LINE:35
  CartController_4: controllers.CartController,
  // @LINE:36
  ApplicationController_10: controllers.ApplicationController,
  // @LINE:41
  SocialAuthController_8: controllers.SocialAuthController,
  // @LINE:46
  SignInController_6: controllers.SignInController,
  // @LINE:49
  ActivateAccountController_0: controllers.ActivateAccountController,
  // @LINE:53
  Assets_7: controllers.Assets,
  // @LINE:54
  webjars_Routes_0: webjars.Routes,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:12
    ProductController_3: controllers.ProductController,
    // @LINE:16
    CartProductController_2: controllers.CartProductController,
    // @LINE:19
    CommentsController_9: controllers.CommentsController,
    // @LINE:23
    OrdersController_1: controllers.OrdersController,
    // @LINE:31
    CategoryController_5: controllers.CategoryController,
    // @LINE:35
    CartController_4: controllers.CartController,
    // @LINE:36
    ApplicationController_10: controllers.ApplicationController,
    // @LINE:41
    SocialAuthController_8: controllers.SocialAuthController,
    // @LINE:46
    SignInController_6: controllers.SignInController,
    // @LINE:49
    ActivateAccountController_0: controllers.ActivateAccountController,
    // @LINE:53
    Assets_7: controllers.Assets,
    // @LINE:54
    webjars_Routes_0: webjars.Routes
  ) = this(errorHandler, ProductController_3, CartProductController_2, CommentsController_9, OrdersController_1, CategoryController_5, CartController_4, ApplicationController_10, SocialAuthController_8, SignInController_6, ActivateAccountController_0, Assets_7, webjars_Routes_0, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, ProductController_3, CartProductController_2, CommentsController_9, OrdersController_1, CategoryController_5, CartController_4, ApplicationController_10, SocialAuthController_8, SignInController_6, ActivateAccountController_0, Assets_7, webjars_Routes_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addproduct""", """controllers.ProductController.addProduct"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """products""", """controllers.ProductController.getProducts"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """product/""" + "$" + """id<[^/]+>""", """controllers.ProductController.getProduct(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """products_in_cart/""" + "$" + """id<[^/]+>""", """controllers.CartProductController.getProductsInCart(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """comments/""" + "$" + """id<[^/]+>""", """controllers.CommentsController.getComments(id:Int)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addcomment""", """controllers.CommentsController.addComments()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addorders""", """controllers.OrdersController.addOrders()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getorders""", """controllers.OrdersController.getOrders"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getorders/""" + "$" + """id<[^/]+>""", """controllers.OrdersController.getOrdersByUser(id:Int)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addcategory""", """controllers.CategoryController.addCategory"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """category/""" + "$" + """name<[^/]+>""", """controllers.CategoryController.getCategoryByName(name:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """usercart/""" + "$" + """id<[^/]+>""", """controllers.CartController.getCartId(id:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addcart""", """controllers.ApplicationController.addCart()"""),
    ("""GET""", this.prefix, """controllers.ApplicationController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signOut""", """controllers.ApplicationController.signOut"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """authenticate/""" + "$" + """provider<[^/]+>""", """controllers.SocialAuthController.authenticate(provider:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """current_user""", """controllers.ApplicationController.getCurrentUser"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users""", """controllers.ApplicationController.getUsers"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signIn""", """controllers.SignInController.view"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signIn""", """controllers.SignInController.submit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """account/email/""" + "$" + """email<[^/]+>""", """controllers.ActivateAccountController.send(email:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """account/activate/""" + "$" + """token<[^/]+>""", """controllers.ActivateAccountController.activate(token:java.util.UUID)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(file:String)"""),
    prefixed_webjars_Routes_0_23.router.documentation,
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:12
  private[this] lazy val controllers_ProductController_addProduct0_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addproduct")))
  )
  private[this] lazy val controllers_ProductController_addProduct0_invoker = createInvoker(
    ProductController_3.addProduct,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductController",
      "addProduct",
      Nil,
      "POST",
      this.prefix + """addproduct""",
      """ Products""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_ProductController_getProducts1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("products")))
  )
  private[this] lazy val controllers_ProductController_getProducts1_invoker = createInvoker(
    ProductController_3.getProducts,
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

  // @LINE:14
  private[this] lazy val controllers_ProductController_getProduct2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("product/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProductController_getProduct2_invoker = createInvoker(
    ProductController_3.getProduct(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductController",
      "getProduct",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """product/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_CartProductController_getProductsInCart3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("products_in_cart/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CartProductController_getProductsInCart3_invoker = createInvoker(
    CartProductController_2.getProductsInCart(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CartProductController",
      "getProductsInCart",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """products_in_cart/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_CommentsController_getComments4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("comments/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CommentsController_getComments4_invoker = createInvoker(
    CommentsController_9.getComments(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CommentsController",
      "getComments",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """comments/""" + "$" + """id<[^/]+>""",
      """ Comments""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_CommentsController_addComments5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addcomment")))
  )
  private[this] lazy val controllers_CommentsController_addComments5_invoker = createInvoker(
    CommentsController_9.addComments(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CommentsController",
      "addComments",
      Nil,
      "POST",
      this.prefix + """addcomment""",
      """""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_OrdersController_addOrders6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addorders")))
  )
  private[this] lazy val controllers_OrdersController_addOrders6_invoker = createInvoker(
    OrdersController_1.addOrders(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrdersController",
      "addOrders",
      Nil,
      "POST",
      this.prefix + """addorders""",
      """ Orders""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_OrdersController_getOrders7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getorders")))
  )
  private[this] lazy val controllers_OrdersController_getOrders7_invoker = createInvoker(
    OrdersController_1.getOrders,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrdersController",
      "getOrders",
      Nil,
      "GET",
      this.prefix + """getorders""",
      """""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_OrdersController_getOrdersByUser8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getorders/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_OrdersController_getOrdersByUser8_invoker = createInvoker(
    OrdersController_1.getOrdersByUser(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrdersController",
      "getOrdersByUser",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """getorders/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:31
  private[this] lazy val controllers_CategoryController_addCategory9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addcategory")))
  )
  private[this] lazy val controllers_CategoryController_addCategory9_invoker = createInvoker(
    CategoryController_5.addCategory,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CategoryController",
      "addCategory",
      Nil,
      "POST",
      this.prefix + """addcategory""",
      """ Category""",
      Seq()
    )
  )

  // @LINE:32
  private[this] lazy val controllers_CategoryController_getCategoryByName10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("category/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CategoryController_getCategoryByName10_invoker = createInvoker(
    CategoryController_5.getCategoryByName(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CategoryController",
      "getCategoryByName",
      Seq(classOf[String]),
      "GET",
      this.prefix + """category/""" + "$" + """name<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:35
  private[this] lazy val controllers_CartController_getCartId11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usercart/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CartController_getCartId11_invoker = createInvoker(
    CartController_4.getCartId(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CartController",
      "getCartId",
      Seq(classOf[String]),
      "GET",
      this.prefix + """usercart/""" + "$" + """id<[^/]+>""",
      """ Cart""",
      Seq()
    )
  )

  // @LINE:36
  private[this] lazy val controllers_ApplicationController_addCart12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addcart")))
  )
  private[this] lazy val controllers_ApplicationController_addCart12_invoker = createInvoker(
    ApplicationController_10.addCart(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApplicationController",
      "addCart",
      Nil,
      "POST",
      this.prefix + """addcart""",
      """""",
      Seq()
    )
  )

  // @LINE:39
  private[this] lazy val controllers_ApplicationController_index13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_ApplicationController_index13_invoker = createInvoker(
    ApplicationController_10.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApplicationController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ Home page""",
      Seq()
    )
  )

  // @LINE:40
  private[this] lazy val controllers_ApplicationController_signOut14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signOut")))
  )
  private[this] lazy val controllers_ApplicationController_signOut14_invoker = createInvoker(
    ApplicationController_10.signOut,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApplicationController",
      "signOut",
      Nil,
      "GET",
      this.prefix + """signOut""",
      """""",
      Seq()
    )
  )

  // @LINE:41
  private[this] lazy val controllers_SocialAuthController_authenticate15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("authenticate/"), DynamicPart("provider", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SocialAuthController_authenticate15_invoker = createInvoker(
    SocialAuthController_8.authenticate(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SocialAuthController",
      "authenticate",
      Seq(classOf[String]),
      "GET",
      this.prefix + """authenticate/""" + "$" + """provider<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:43
  private[this] lazy val controllers_ApplicationController_getCurrentUser16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("current_user")))
  )
  private[this] lazy val controllers_ApplicationController_getCurrentUser16_invoker = createInvoker(
    ApplicationController_10.getCurrentUser,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApplicationController",
      "getCurrentUser",
      Nil,
      "GET",
      this.prefix + """current_user""",
      """""",
      Seq()
    )
  )

  // @LINE:44
  private[this] lazy val controllers_ApplicationController_getUsers17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users")))
  )
  private[this] lazy val controllers_ApplicationController_getUsers17_invoker = createInvoker(
    ApplicationController_10.getUsers,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApplicationController",
      "getUsers",
      Nil,
      "GET",
      this.prefix + """users""",
      """""",
      Seq()
    )
  )

  // @LINE:46
  private[this] lazy val controllers_SignInController_view18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signIn")))
  )
  private[this] lazy val controllers_SignInController_view18_invoker = createInvoker(
    SignInController_6.view,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SignInController",
      "view",
      Nil,
      "GET",
      this.prefix + """signIn""",
      """""",
      Seq()
    )
  )

  // @LINE:47
  private[this] lazy val controllers_SignInController_submit19_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signIn")))
  )
  private[this] lazy val controllers_SignInController_submit19_invoker = createInvoker(
    SignInController_6.submit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SignInController",
      "submit",
      Nil,
      "POST",
      this.prefix + """signIn""",
      """""",
      Seq()
    )
  )

  // @LINE:49
  private[this] lazy val controllers_ActivateAccountController_send20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("account/email/"), DynamicPart("email", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ActivateAccountController_send20_invoker = createInvoker(
    ActivateAccountController_0.send(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ActivateAccountController",
      "send",
      Seq(classOf[String]),
      "GET",
      this.prefix + """account/email/""" + "$" + """email<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:50
  private[this] lazy val controllers_ActivateAccountController_activate21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("account/activate/"), DynamicPart("token", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ActivateAccountController_activate21_invoker = createInvoker(
    ActivateAccountController_0.activate(fakeValue[java.util.UUID]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ActivateAccountController",
      "activate",
      Seq(classOf[java.util.UUID]),
      "GET",
      this.prefix + """account/activate/""" + "$" + """token<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:53
  private[this] lazy val controllers_Assets_versioned22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned22_invoker = createInvoker(
    Assets_7.versioned(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )

  // @LINE:54
  private[this] val prefixed_webjars_Routes_0_23 = Include(webjars_Routes_0.withPrefix(this.prefix + (if (this.prefix.endsWith("/")) "" else "/") + "webjars"))


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:12
    case controllers_ProductController_addProduct0_route(params@_) =>
      call { 
        controllers_ProductController_addProduct0_invoker.call(ProductController_3.addProduct)
      }
  
    // @LINE:13
    case controllers_ProductController_getProducts1_route(params@_) =>
      call { 
        controllers_ProductController_getProducts1_invoker.call(ProductController_3.getProducts)
      }
  
    // @LINE:14
    case controllers_ProductController_getProduct2_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_ProductController_getProduct2_invoker.call(ProductController_3.getProduct(id))
      }
  
    // @LINE:16
    case controllers_CartProductController_getProductsInCart3_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_CartProductController_getProductsInCart3_invoker.call(CartProductController_2.getProductsInCart(id))
      }
  
    // @LINE:19
    case controllers_CommentsController_getComments4_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_CommentsController_getComments4_invoker.call(CommentsController_9.getComments(id))
      }
  
    // @LINE:20
    case controllers_CommentsController_addComments5_route(params@_) =>
      call { 
        controllers_CommentsController_addComments5_invoker.call(CommentsController_9.addComments())
      }
  
    // @LINE:23
    case controllers_OrdersController_addOrders6_route(params@_) =>
      call { 
        controllers_OrdersController_addOrders6_invoker.call(OrdersController_1.addOrders())
      }
  
    // @LINE:24
    case controllers_OrdersController_getOrders7_route(params@_) =>
      call { 
        controllers_OrdersController_getOrders7_invoker.call(OrdersController_1.getOrders)
      }
  
    // @LINE:25
    case controllers_OrdersController_getOrdersByUser8_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_OrdersController_getOrdersByUser8_invoker.call(OrdersController_1.getOrdersByUser(id))
      }
  
    // @LINE:31
    case controllers_CategoryController_addCategory9_route(params@_) =>
      call { 
        controllers_CategoryController_addCategory9_invoker.call(CategoryController_5.addCategory)
      }
  
    // @LINE:32
    case controllers_CategoryController_getCategoryByName10_route(params@_) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_CategoryController_getCategoryByName10_invoker.call(CategoryController_5.getCategoryByName(name))
      }
  
    // @LINE:35
    case controllers_CartController_getCartId11_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_CartController_getCartId11_invoker.call(CartController_4.getCartId(id))
      }
  
    // @LINE:36
    case controllers_ApplicationController_addCart12_route(params@_) =>
      call { 
        controllers_ApplicationController_addCart12_invoker.call(ApplicationController_10.addCart())
      }
  
    // @LINE:39
    case controllers_ApplicationController_index13_route(params@_) =>
      call { 
        controllers_ApplicationController_index13_invoker.call(ApplicationController_10.index)
      }
  
    // @LINE:40
    case controllers_ApplicationController_signOut14_route(params@_) =>
      call { 
        controllers_ApplicationController_signOut14_invoker.call(ApplicationController_10.signOut)
      }
  
    // @LINE:41
    case controllers_SocialAuthController_authenticate15_route(params@_) =>
      call(params.fromPath[String]("provider", None)) { (provider) =>
        controllers_SocialAuthController_authenticate15_invoker.call(SocialAuthController_8.authenticate(provider))
      }
  
    // @LINE:43
    case controllers_ApplicationController_getCurrentUser16_route(params@_) =>
      call { 
        controllers_ApplicationController_getCurrentUser16_invoker.call(ApplicationController_10.getCurrentUser)
      }
  
    // @LINE:44
    case controllers_ApplicationController_getUsers17_route(params@_) =>
      call { 
        controllers_ApplicationController_getUsers17_invoker.call(ApplicationController_10.getUsers)
      }
  
    // @LINE:46
    case controllers_SignInController_view18_route(params@_) =>
      call { 
        controllers_SignInController_view18_invoker.call(SignInController_6.view)
      }
  
    // @LINE:47
    case controllers_SignInController_submit19_route(params@_) =>
      call { 
        controllers_SignInController_submit19_invoker.call(SignInController_6.submit)
      }
  
    // @LINE:49
    case controllers_ActivateAccountController_send20_route(params@_) =>
      call(params.fromPath[String]("email", None)) { (email) =>
        controllers_ActivateAccountController_send20_invoker.call(ActivateAccountController_0.send(email))
      }
  
    // @LINE:50
    case controllers_ActivateAccountController_activate21_route(params@_) =>
      call(params.fromPath[java.util.UUID]("token", None)) { (token) =>
        controllers_ActivateAccountController_activate21_invoker.call(ActivateAccountController_0.activate(token))
      }
  
    // @LINE:53
    case controllers_Assets_versioned22_route(params@_) =>
      call(params.fromPath[String]("file", None)) { (file) =>
        controllers_Assets_versioned22_invoker.call(Assets_7.versioned(file))
      }
  
    // @LINE:54
    case prefixed_webjars_Routes_0_23(handler) => handler
  }
}
