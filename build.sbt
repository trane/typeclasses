scalaVersion := "2.12.4"

scalacOptions ++= Seq(
  "-encoding", "UTF-8", // 2 args
  "-feature",
  "-language:existentials",
  "-language:higherKinds",
  "-language:implicitConversions",
  "-unchecked",
  "-Yno-adapted-args",
  "-Ywarn-dead-code",
  "-Ywarn-value-discard"
)

addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.0" cross CrossVersion.full)
libraryDependencies += "com.github.mpilquist" %% "simulacrum" % "0.11.0"

enablePlugins(TutPlugin)
tutSourceDirectory := baseDirectory.value / "tut"
tutTargetDirectory := baseDirectory.value / "tut-out"
