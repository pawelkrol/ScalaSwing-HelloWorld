jarName in assembly := { s"${name.value}-${version.value}.jar" }

test in assembly := {}

mainClass in assembly := Some("org.domain.your.HelloWorld.Main")
