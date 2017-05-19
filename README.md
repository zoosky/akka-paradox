# Paradox for Akka documentation

Use the sbt plugin for Akka Paradox:

```scala
addSbtPlugin("com.lightbend.akka" % "sbt-paradox-akka" % "<version>")
```

This plugin extends the Paradox sbt plugin with some default settings and sets the Akka Paradox theme.

## Releasing

When adding a tag, travis should automatically release to
https://bintray.com/akka. From there the files must be published in 'maven' and
'sbt-plugin-releases' to make them available on jcenter and sbt, respectively.
