# Paradox for Akka documentation

## Paradox theme for Akka

Adding the theme to a Paradox build:

```scala
paradoxTheme := Some("com.lightbend.akka" % "paradox-theme-akka" % "<version>")
```

This theme is expected to be used with auto-expanding navigation:

```scala
paradoxNavigationDepth := 1
paradoxNavigationExpandDepth := Some(1)
paradoxNavigationIncludeHeaders := true
```
