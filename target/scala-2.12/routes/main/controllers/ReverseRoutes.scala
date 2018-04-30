// @GENERATOR:play-routes-compiler
// @SOURCE:/home/dawid/IdeaProjects/Ebusiness/conf/routes
// @DATE:Mon Apr 30 22:54:41 CEST 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers {

  // @LINE:18
  class ReverseOpinionController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "opinion")
    }
  
    // @LINE:18
    def getOpinions(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "opinions")
    }
  
    // @LINE:20
    def addOpinion(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addopinion")
    }
  
  }

  // @LINE:34
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:34
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:12
  class ReverseBasketIdsController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def getBasketIds(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "basket_ids")
    }
  
    // @LINE:13
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "basketid")
    }
  
    // @LINE:14
    def addBasketId(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addbasketid")
    }
  
  }

  // @LINE:15
  class ReverseBasketProductController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def addBasketProduct(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addbasketproduct")
    }
  
    // @LINE:16
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "basketproduct")
    }
  
    // @LINE:15
    def getBasketProducts(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "basket_product")
    }
  
  }

  // @LINE:21
  class ReversePaymentController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:23
    def addPayment(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addpayment")
    }
  
    // @LINE:21
    def getPayments(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "payments")
    }
  
    // @LINE:22
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "payment")
    }
  
  }

  // @LINE:9
  class ReverseCategoryController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def addCategory(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addcategory")
    }
  
    // @LINE:10
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "category")
    }
  
    // @LINE:9
    def getCategories(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "categories")
    }
  
  }

  // @LINE:6
  class ReverseProductController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def addProduct(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addproduct")
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:8
    def getProducts(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "products")
    }
  
  }

  // @LINE:27
  class ReverseOrderController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:29
    def addOrder(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addorder")
    }
  
    // @LINE:28
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "order")
    }
  
    // @LINE:27
    def getOrders(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "orders")
    }
  
  }

  // @LINE:24
  class ReverseKeywordController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:24
    def getKeywords(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "keywords")
    }
  
    // @LINE:25
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "keyword")
    }
  
    // @LINE:26
    def addKeyword(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addkeyword")
    }
  
  }


}
