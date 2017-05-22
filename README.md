# Paradox for Akka documentation

Use the sbt plugin for Akka Paradox:

```scala
addSbtPlugin("com.lightbend.akka" % "sbt-paradox-akka" % "<version>")
```

This plugin extends the Paradox sbt plugin with some default settings and sets the Akka Paradox theme.

## Releasing

- Tag the commit you want to release
- Travis should automatically release to https://bintray.com/akka
- Go to https://bintray.com/akka/sbt-plugin-releases/sbt-paradox-akka and 'publish' the released files (they should automatically become available at https://bintray.com/sbt/sbt-plugin-releases)
- Go to https://bintray.com/akka/maven/paradox-theme-akka and 'publish' the released files (they should automatically become available through jcenter)
