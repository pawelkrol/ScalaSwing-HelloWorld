name := "helloworld"

version := "0.01"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "org.scala-lang" % "scala-swing" % "2.11.0-M7",
  "org.scalatest" %% "scalatest" % "2.2.6" % "test"
)

artifactName := { (sv: ScalaVersion, module: ModuleID, artifact: Artifact) =>
    artifact.name + "-" + module.revision + "." + artifact.extension
}

proguardSettings

ProguardKeys.filteredInputs in Proguard <++= (packageBin in Compile) map ProguardOptions.noFilter

ProguardKeys.inputs in Proguard <<= (dependencyClasspath in Compile) map { _.files }

ProguardKeys.options in Proguard ++= Seq("-dontnote", "-dontwarn", "-ignorewarnings")

ProguardKeys.options in Proguard += ProguardOptions.keepMain("org.domain.your.HelloWorld.Main")

ProguardKeys.proguardVersion in Proguard := "5.2.1"
