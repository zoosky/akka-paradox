import sbt._

object Version {
  val foundation = "6.3.1"
  val prettify   = "4-Mar-2013-1"
  // Needs https://github.com/lightbend/paradox/pull/147
  val sbtParadox = "0.3.0"
}

object Library {
  val foundation = "org.webjars"           % "foundation"  % Version.foundation
  val prettify   = "org.webjars"           % "prettify"    % Version.prettify
  val sbtParadox = "com.lightbend.paradox" % "sbt-paradox" % Version.sbtParadox
}
