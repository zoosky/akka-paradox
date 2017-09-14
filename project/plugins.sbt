addSbtPlugin("com.github.gseitz"     % "sbt-release"             % "1.0.4")

addSbtPlugin("com.lightbend.paradox" % "sbt-paradox-theme"       % "0.2.12")
addSbtPlugin("com.dwijnand"          % "sbt-dynver"              % "1.2.0")
addSbtPlugin("me.lessis"             % "bintray-sbt"             % "0.3.0-8-g6d0c3f8")

addSbtPlugin("net.bzzt"              % "sbt-reproducible-builds" % "0.3")

resolvers += Resolver.url("2m-sbt-plugin-releases", url("https://dl.bintray.com/2m/sbt-plugin-releases/"))(Resolver.ivyStylePatterns)
