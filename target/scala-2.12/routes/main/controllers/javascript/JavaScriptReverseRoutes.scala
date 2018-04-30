// @GENERATOR:play-routes-compiler
// @SOURCE:/home/dawid/IdeaProjects/Ebusiness/conf/routes
// @DATE:Mon Apr 30 22:54:41 CEST 2018

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers.javascript {

  // @LINE:18
  class ReverseOpinionController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OpinionController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "opinion"})
        }
      """
    )
  
    // @LINE:18
    def getOpinions: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OpinionController.getOpinions",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "opinions"})
        }
      """
    )
  
    // @LINE:20
    def addOpinion: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OpinionController.addOpinion",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addopinion"})
        }
      """
    )
  
  }

  // @LINE:34
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:34
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:12
  class ReverseBasketIdsController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def getBasketIds: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BasketIdsController.getBasketIds",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "basket_ids"})
        }
      """
    )
  
    // @LINE:13
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BasketIdsController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "basketid"})
        }
      """
    )
  
    // @LINE:14
    def addBasketId: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BasketIdsController.addBasketId",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addbasketid"})
        }
      """
    )
  
  }

  // @LINE:15
  class ReverseBasketProductController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def addBasketProduct: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BasketProductController.addBasketProduct",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addbasketproduct"})
        }
      """
    )
  
    // @LINE:16
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BasketProductController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "basketproduct"})
        }
      """
    )
  
    // @LINE:15
    def getBasketProducts: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BasketProductController.getBasketProducts",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "basket_product"})
        }
      """
    )
  
  }

  // @LINE:21
  class ReversePaymentController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:23
    def addPayment: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PaymentController.addPayment",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addpayment"})
        }
      """
    )
  
    // @LINE:21
    def getPayments: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PaymentController.getPayments",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "payments"})
        }
      """
    )
  
    // @LINE:22
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PaymentController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "payment"})
        }
      """
    )
  
  }

  // @LINE:9
  class ReverseCategoryController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def addCategory: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CategoryController.addCategory",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addcategory"})
        }
      """
    )
  
    // @LINE:10
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CategoryController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "category"})
        }
      """
    )
  
    // @LINE:9
    def getCategories: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CategoryController.getCategories",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "categories"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseProductController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def addProduct: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductController.addProduct",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addproduct"})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:8
    def getProducts: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductController.getProducts",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "products"})
        }
      """
    )
  
  }

  // @LINE:27
  class ReverseOrderController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:29
    def addOrder: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrderController.addOrder",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addorder"})
        }
      """
    )
  
    // @LINE:28
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrderController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "order"})
        }
      """
    )
  
    // @LINE:27
    def getOrders: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrderController.getOrders",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "orders"})
        }
      """
    )
  
  }

  // @LINE:24
  class ReverseKeywordController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:24
    def getKeywords: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.KeywordController.getKeywords",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "keywords"})
        }
      """
    )
  
    // @LINE:25
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.KeywordController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "keyword"})
        }
      """
    )
  
    // @LINE:26
    def addKeyword: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.KeywordController.addKeyword",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addkeyword"})
        }
      """
    )
  
  }


}
