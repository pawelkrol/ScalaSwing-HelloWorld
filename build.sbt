lazy val root = (project in file(".")).settings(
  javaOptions += "-Xmx1G",
  name := "helloworld",
  scalaVersion := "2.12.7",
  version := "0.03-SNAPSHOT"
)

fork in run := true

maxErrors := 1

libraryDependencies ++= Seq(
  "org.scala-lang.modules" % "scala-swing_2.12" % "2.0.3",
  "org.scalatest" %% "scalatest" % "3.0.5" % "test"
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
