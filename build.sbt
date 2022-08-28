lazy val root = (project in file(".")).settings(
  javaOptions += "-Xmx1G",
  name := "helloworld",
  organization := "com.github.pawelkrol",
  scalaVersion := "3.1.3",
  scalacOptions ++= Seq(
    "-deprecation",
    "-encoding", "UTF-8",
    "-feature",
    "-language:implicitConversions",
    "-unchecked",
    "-Xfatal-warnings"),
  version := "1.0.0-SNAPSHOT")

run / fork := true

maxErrors := 1

libraryDependencies ++= Seq(
  "org.scala-lang.modules" %% "scala-swing" % "3.0.0",
  "org.scalatest" %% "scalatest" % "3.2.13" % "test")

artifactName := { (sv: ScalaVersion, module: ModuleID, artifact: Artifact) =>
  artifact.name + "-" + module.revision + "." + artifact.extension
}

enablePlugins(SbtProguard)

Proguard / proguardFilteredInputs ++= ProguardOptions.noFilter((Compile / packageBin).value)

Proguard / proguardInputs := (Compile / dependencyClasspath).value.files

Proguard / proguardOptions += ProguardOptions.keepMain("com.github.pawelkrol.HelloWorld.Main")

Proguard / proguardOptions += ProguardConf.helloWorld

Proguard / proguardVersion := "7.2.2"
