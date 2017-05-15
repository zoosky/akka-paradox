package akka

import sbt._
import sbt.Keys._
import com.lightbend.paradox.markdown.{ ContainerBlockDirective, Directive, Writer }
import com.lightbend.paradox.sbt.ParadoxPlugin
import org.pegdown.Printer
import org.pegdown.ast.{ DirectiveNode, Visitor }

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
    paradoxNavigationIncludeHeaders := true,
    paradoxDirectives += SidenoteDirective
  )

  def akkaParadoxSettings(config: Configuration): Seq[Setting[_]] = akkaParadoxGlobalSettings ++ inConfig(config)(Seq(
    // scoped settings here
  ))

  object SidenoteDirective extends ContainerBlockDirective("sidenote") with (Writer.Context => Directive) {
    def apply(context: Writer.Context): Directive = SidenoteDirective

    def render(node: DirectiveNode, visitor: Visitor, printer: Printer): Unit = {
      val classes = node.attributes.classesString
      printer.print(s"""<div class="sidenote $classes">""")
      node.contentsNode.accept(visitor)
      printer.print("""</div>""")
    }
  }

}
