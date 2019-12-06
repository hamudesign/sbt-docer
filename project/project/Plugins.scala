import sbt._

object Plugins {
  object ScalaFmt {
    private val version = "2.0.4"
    val core: ModuleID = "org.scalameta" % "sbt-scalafmt" % version
  }
  object SCoverage {
    private val version = "0.6.29"
    val core: ModuleID = "org.scalameta" % "sbt-scalafmt" % version
  }
  object ScalaJs {
    private val version = "0.6.29"
    val core: ModuleID = "org.scala-js" % "sbt-scalajs" % version
  }
}