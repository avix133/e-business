// @GENERATOR:play-routes-compiler
// @SOURCE:/home/dawid/IdeaProjects/Ebusiness/conf/routes
// @DATE:Sun Apr 29 21:01:29 CEST 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers {

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

  // @LINE:10
  class ReverseBasketIdsController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def getBasketIds(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "basket_ids")
    }
  
  }

  // @LINE:13
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:9
  class ReverseCategoryController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def getCategories(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "categories")
    }
  
  }


}
