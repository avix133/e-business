// @GENERATOR:play-routes-compiler
// @SOURCE:/home/dawid/IdeaProjects/Ebusiness/conf/routes
// @DATE:Sat Apr 28 14:50:53 CEST 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
