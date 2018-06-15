// @GENERATOR:play-routes-compiler
// @SOURCE:/home/dawid/IdeaProjects/ebusiness/conf/routes
// @DATE:Fri Jun 15 01:38:43 CEST 2018


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
