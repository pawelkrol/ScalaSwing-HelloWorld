lazy val root = (project in file(".")).settings(
  javaOptions += "-Xmx1G",
  name := "helloworld",
  scalaVersion := "2.13.0",
  version := "0.04"
)

fork in run := true

maxErrors := 1

libraryDependencies ++= Seq(
  "org.scala-lang.modules" %% "scala-swing" % "2.1.1",
  "org.scalatest" %% "scalatest" % "3.0.8" % "test"
)

artifactName := { (sv: ScalaVersion, module: ModuleID, artifact: Artifact) =>
    artifact.name + "-" + module.revision + "." + artifact.extension
}

enablePlugins(SbtProguard)

proguardFilteredInputs in Proguard ++= ProguardOptions.noFilter((packageBin in Compile).value)

proguardInputs in Proguard := (dependencyClasspath in Compile).value.files

proguardOptions in Proguard += ProguardOptions.keepMain("org.domain.your.HelloWorld.Main")

proguardOptions in Proguard += ProguardConf.helloWorld

proguardVersion in Proguard := "5.3.3"
