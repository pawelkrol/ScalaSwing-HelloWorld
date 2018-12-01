ScalaSwing-HelloWorld
=====================

`Hello World` is the most minimal Scala Swing project you can probably imagine. It comes up with a minimal set of dependencies required to build and run a standalone application JAR. It does not provide anything besides bringing up an application window with a "Hello World" message displayed within it, and is meant to serve you as an empty template for a quick start to build your own GUI application. Please adapt package and class names as well as build configuration according to the needs of your program.

This `Hello World` application is setup with [sbt 1.2.7](http://www.scala-sbt.org/) as a build tool, [sbt-proguard 0.3.0](https://github.com/sbt/sbt-proguard) as an sbt [plugin](https://www.scala-sbt.org/1.x/docs/Using-Plugins.html) for running [ProGuard 5.3.3](http://proguard.sourceforge.net/), [ScalaTest 3.0.5](http://www.scalatest.org/) as a unit-testing framework, and of course with a [scala-swing 2.0.3](https://www.scala-lang.org/api/2.12.7/scala-swing/scala/swing/) standard library.

VERSION
-------

Version 0.03 (2018-12-01)

INSTALLATION
------------

Add the following automatic export to your `~/.bash_profile`:

    export _JAVA_OPTIONS="-Xms1024m -Xmx2G -Xss256m"

In order to build and run an application JAR type the following:

    $ git clone git://github.com/pawelkrol/ScalaSwing-HelloWorld.git
    $ cd ScalaSwing-HelloWorld
    $ sbt clean update compile test package proguard:proguard run
    $ java -Dfile.encoding=UTF8 -jar target/scala-2.12/proguard/helloworld-0.03.jar

COPYRIGHT AND LICENCE
---------------------

Copyright (C) 2014, 2016-2018 by Pawel Krol.

This library is free open source software; you can redistribute it and/or modify it under [the same terms](https://www.scala-lang.org/license/) as Scala itself, either Scala version 2.12.7 or, at your option, any later version of Scala you may have available.
