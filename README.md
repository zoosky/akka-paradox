# Paradox for Akka documentation

Use the sbt plugin for Akka Paradox:

```scala
addSbtPlugin("com.lightbend.akka" % "sbt-paradox-akka" % "<version>")
```

This plugin extends the Paradox sbt plugin with some default settings and sets the Akka Paradox theme.

## Releasing

- Tag the commit you want to release
- Travis should automatically release to https://bintray.com/akka
