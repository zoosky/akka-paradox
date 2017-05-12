package akka

import sbt._
import sbt.Keys._
import com.lightbend.paradox.sbt.ParadoxPlugin

object AkkaParadoxPlugin extends AutoPlugin {

  import ParadoxPlugin.autoImport._

  val version = ParadoxPlugin.readProperty("akka-paradox.properties", "akka.paradox.version")

  override def requires = ParadoxPlugin

  override def trigger = noTrigger

  override def projectSettings: Seq[Setting[_]] = akkaParadoxSettings(Compile)

  def akkaParadoxGlobalSettings: Seq[Setting[_]] = Seq(
    paradoxTheme := Some("com.lightbend.akka" % "paradox-theme-akka" % version),
    paradoxNavigationDepth := 1,
    paradoxNavigationExpandDepth := Some(1),
    paradoxNavigationIncludeHeaders := true
  )

  def akkaParadoxSettings(config: Configuration): Seq[Setting[_]] = akkaParadoxGlobalSettings ++ inConfig(config)(Seq(
    // scoped settings here
  ))

}
