import sbt._

object Dependencies {
  lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.0.5"
  lazy val antlr4Runtime = "org.antlr" % "antlr4-runtime" % "4.7"
  lazy val stringTemplate = "org.antlr" % "stringtemplate" % "3.2"

  val projectDeps = Seq(antlr4Runtime, stringTemplate, scalaTest % Test)
}
