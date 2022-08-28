ScalaSwing-HelloWorld
=====================

`Hello World` is the most minimal [Scala Swing 3] project you can probably imagine. It comes up bundled with a minimal set of dependencies required to build and run a standalone application JAR. It does not provide anything besides bringing up an application window with a "Hello World" message displayed within it, and is meant to serve as an empty template to bootstrap your own GUI applications. Please adapt package and class names as well as build configuration according to the needs of your program.

This `Hello World` application is set up with [sbt 1.7.1] as a build tool, [sbt-proguard 0.5.0] as an [sbt plugin] for running [ProGuard 7.2.2], [ScalaTest 3.2.13] as a unit-testing framework, and of course [Scala Swing 3] standard library.

VERSION
-------

Version 1.0.0 (2022-08-28)

INSTALLATION
------------

Add the following automatic export to your `~/.bash_profile`:

    export _JAVA_OPTIONS="-Xms1024m -Xmx2G -Xss256m"

Install JMods for OpenJDK 17 to be able to use [ProGuard]:

    $ sudo dnf install java-17-openjdk-jmods

In order to build and run an application JAR type the following:

    $ git clone git://github.com/pawelkrol/ScalaSwing-HelloWorld.git
    $ cd ScalaSwing-HelloWorld
    $ sbt clean update compile test package proguard:proguard run
    $ java -Dfile.encoding=UTF8 -jar target/scala-3.1.3/proguard/helloworld-1.0.0.jar

COPYRIGHT AND LICENCE
---------------------

Copyright (C) 2014-2022 by Pawel Krol.

This library is free open source software; you can redistribute it and/or modify it under [the same terms] as Scala itself, either Scala version 3.1.3 or, at your option, any later version of Scala you may have available.


[ProGuard 7.2.2]: https://github.com/Guardsquare/proguard
[Scala Swing 3]: https://www.javadoc.io/doc/org.scala-lang.modules/scala-swing_3/latest/index.html
[ScalaTest 3.2.13]: http://www.scalatest.org/
[sbt 1.7.1]: http://www.scala-sbt.org/
[sbt plugin]: https://www.scala-sbt.org/1.x/docs/Using-Plugins.html
[sbt-proguard 0.5.0]: https://github.com/sbt/sbt-proguard
[the same terms]: https://github.com/pawelkrol/ScalaSwing-HelloWorld/blob/master/LICENSE.md
