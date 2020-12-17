lazy val root = (project in file(".")).settings(
  javaOptions += "-Xmx1G",
  name := "helloworld",
  scalaVersion := "2.13.4",
  version := "0.05"
)

fork in run := true

maxErrors := 1

libraryDependencies ++= Seq(
  "org.scala-lang.modules" %% "scala-swing" % "3.0.0",
  "org.scalatest" %% "scalatest" % "3.2.3" % "test"
)

artifactName := { (sv: ScalaVersion, module: ModuleID, artifact: Artifact) =>
    artifact.name + "-" + module.revision + "." + artifact.extension
}

enablePlugins(SbtProguard)

Proguard / proguardFilteredInputs ++= ProguardOptions.noFilter((Compile / packageBin).value)

Proguard / proguardInputs := (Compile / dependencyClasspath).value.files

Proguard / proguardOptions += ProguardOptions.keepMain("org.domain.your.HelloWorld.Main")

Proguard / proguardOptions += ProguardConf.helloWorld

Proguard / proguardVersion := "7.0.0"
