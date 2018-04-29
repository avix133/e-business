// @GENERATOR:play-routes-compiler
// @SOURCE:/home/dawid/IdeaProjects/Ebusiness/conf/routes
// @DATE:Sun Apr 29 21:01:29 CEST 2018

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseProductController ProductController = new controllers.ReverseProductController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseBasketIdsController BasketIdsController = new controllers.ReverseBasketIdsController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseCategoryController CategoryController = new controllers.ReverseCategoryController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseProductController ProductController = new controllers.javascript.ReverseProductController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseBasketIdsController BasketIdsController = new controllers.javascript.ReverseBasketIdsController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseCategoryController CategoryController = new controllers.javascript.ReverseCategoryController(RoutesPrefix.byNamePrefix());
  }

}
