import sbt._

object Version {
  val foundation = "6.3.1"
  val prettify   = "4-Mar-2013-1"
}

object Library {
  val foundation = "org.webjars" % "foundation" % Version.foundation
  val prettify   = "org.webjars" % "prettify"   % Version.prettify
}
