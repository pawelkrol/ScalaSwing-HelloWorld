ScalaSwing-HelloWorld
=====================

`Hello World` is the most minimal Scala Swing project you can probably imagine. It comes up with a minimal set of dependencies required to build and run a standalone application JAR. It does not provide anything besides bringing up an application window with a "Hello World" message displayed within it, and is meant to serve you as an empty template for a quick start to build your own GUI application. Please adapt package and class names as well as build configuration according to the needs of your program.

This `Hello World` application is setup with [sbt 0.13.11](http://www.scala-sbt.org/) as a build tool, [sbt-proguard 0.2.2](https://github.com/sbt/sbt-proguard) as an sbt [plugin](http://www.scala-sbt.org/0.13/docs/Plugins.html) for running [ProGuard 5.2.1](http://proguard.sourceforge.net/), [ScalaTest 2.2.6](http://www.scalatest.org/) as a unit-testing framework, and of course with a [scala.swing](http://www.scala-lang.org/api/current/index.html#scala.swing.package) standard library.

VERSION
-------

Version 0.02 (2016-04-16)

INSTALLATION
------------

Add the following automatic export to your `~/.bash_profile`:

    export _JAVA_OPTIONS="-Xms1024m -Xmx2G -Xss256m"

In order to build and run an application JAR type the following:

    $ git clone git://github.com/pawelkrol/ScalaSwing-HelloWorld.git
    $ cd ScalaSwing-HelloWorld
    $ sbt clean update compile test package proguard:proguard
    $ java -Dfile.encoding=UTF8 -jar target/scala-2.11/proguard/helloworld-0.02.jar

COPYRIGHT AND LICENCE
---------------------

Copyright (C) 2014, 2016 by Pawel Krol.

This library is free open source software; you can redistribute it and/or modify it under the same terms as Scala itself, either Scala version 2.11.8 or, at your option, any later version of Scala you may have available.
