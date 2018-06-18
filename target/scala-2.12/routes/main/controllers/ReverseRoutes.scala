// @GENERATOR:play-routes-compiler
// @SOURCE:/home/dawid/IdeaProjects/ebusiness/conf/routes
// @DATE:Sat Jun 16 03:44:54 CEST 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.utils.route.Binders._

// @LINE:12
package controllers {

  // @LINE:53
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:53
    def versioned(file:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[String]].unbind("file", file))
    }
  
  }

  // @LINE:46
  class ReverseSignInController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:46
    def view(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "signIn")
    }
  
    // @LINE:47
    def submit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "signIn")
    }
  
  }

  // @LINE:19
  class ReverseCommentsController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:20
    def addComments(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addcomment")
    }
  
    // @LINE:19
    def getComments(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "comments/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
  }

  // @LINE:41
  class ReverseSocialAuthController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:41
    def authenticate(provider:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "authenticate/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("provider", provider)))
    }
  
  }

  // @LINE:36
  class ReverseApplicationController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:43
    def getCurrentUser(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "current_user")
    }
  
    // @LINE:40
    def signOut(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "signOut")
    }
  
    // @LINE:44
    def getUsers(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "users")
    }
  
    // @LINE:36
    def addCart(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addcart")
    }
  
    // @LINE:39
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:49
  class ReverseActivateAccountController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:50
    def activate(token:java.util.UUID): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "account/activate/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[java.util.UUID]].unbind("token", token)))
    }
  
    // @LINE:49
    def send(email:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "account/email/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("email", email)))
    }
  
  }

  // @LINE:35
  class ReverseCartController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:35
    def getCartId(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "usercart/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
  }

  // @LINE:31
  class ReverseCategoryController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:32
    def getCategoryByName(name:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "category/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("name", name)))
    }
  
    // @LINE:31
    def addCategory(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addcategory")
    }
  
  }

  // @LINE:23
  class ReverseOrdersController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:23
    def addOrders(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addorders")
    }
  
    // @LINE:25
    def getOrdersByUser(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "getorders/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:24
    def getOrders(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "getorders")
    }
  
  }

  // @LINE:12
  class ReverseProductController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def addProduct(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addproduct")
    }
  
    // @LINE:14
    def getProduct(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "product/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:13
    def getProducts(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "products")
    }
  
  }

  // @LINE:16
  class ReverseCartProductController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def getProductsInCart(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "products_in_cart/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
  }


}
