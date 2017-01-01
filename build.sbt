lazy val root = (project in file(".")).settings(
  javaOptions += "-Xmx1G",
  name := "helloworld",
  scalaVersion := "2.12.1",
  version := "0.03-SNAPSHOT"
)

fork in run := true

maxErrors := 1

libraryDependencies ++= Seq(
  "org.scala-lang.modules" % "scala-swing_2.12" % "2.0.0-M2",
  "org.scalatest" %% "scalatest" % "3.0.1" % "test"
)

artifactName := { (sv: ScalaVersion, module: ModuleID, artifact: Artifact) =>
    artifact.name + "-" + module.revision + "." + artifact.extension
}

proguardSettings

ProguardKeys.filteredInputs in Proguard <++= (packageBin in Compile) map ProguardOptions.noFilter

ProguardKeys.inputs in Proguard := { (dependencyClasspath in Compile).value.files }

ProguardKeys.options in Proguard += ProguardOptions.keepMain("org.domain.your.HelloWorld.Main")

ProguardKeys.options in Proguard += ProguardConf.helloWorld

ProguardKeys.proguardVersion in Proguard := "5.3.2"
