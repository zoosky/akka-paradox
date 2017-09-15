val commonSettings = Seq(
  crossSbtVersions := Seq("0.13.16", "1.0.1"),
  scalaVersion := { (sbtBinaryVersion in pluginCrossBuild).value match {
    case "0.13" => "2.10.6"
    case _ => "2.12.3"
  }},
  // fixed in https://github.com/sbt/sbt/pull/3397 (for sbt 0.13.17)
  sbtBinaryVersion in update := (sbtBinaryVersion in pluginCrossBuild).value
)
lazy val akkaParadox = project
  .in(file("."))
  .enablePlugins(NoPublish)
  .aggregate(akkaTheme, akkaPlugin)
  .settings(commonSettings)

lazy val akkaTheme = project
  .in(file("theme"))
  .enablePlugins(ParadoxThemePlugin)
  .settings(commonSettings)
  .settings(
    organization := "com.lightbend.akka",
    name := "paradox-theme-akka",
    libraryDependencies ++= Seq(
      Library.foundation % "provided",
      Library.prettify % "provided"
    )
  )

lazy val akkaPlugin = project
  .in(file("plugin"))
  .settings(commonSettings)
  .settings(
    sbtPlugin := true,
    organization := "com.lightbend.akka",
    name := "sbt-paradox-akka",
    bintrayRepository := "sbt-plugin-releases",
    addSbtPlugin(Library.sbtParadox),
    resourceGenerators in Compile += Def.task {
      val file = (resourceManaged in Compile).value / "akka-paradox.properties"
      IO.write(file, s"akka.paradox.version=${version.value}")
      Seq(file)
    }
  )
