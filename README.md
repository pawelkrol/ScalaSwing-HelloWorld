ScalaSwing-HelloWorld
=====================

`Hello World` is the most minimal Scala Swing project you can probably imagine. It comes up with a minimal set of dependencies required to build and run a standalone application JAR. It does not provide anything besides bringing up an application window with a "Hello World" message displayed within it, and is meant to serve you as an empty template for a quick start to build your own GUI application. Please adapt package and class names as well as build configuration according to the needs of your program.

This `Hello World` application is setup with [sbt 0.13.1](http://www.scala-sbt.org/) as a build tool, [sbt-assembly 0.10.2](https://github.com/sbt/sbt-assembly) as a packaging plugin, [ScalaTest 2.0](http://www.scalatest.org/) as a unit-testing framework, and of course with a [scala.swing](http://www.scala-lang.org/api/current/index.html#scala.swing.package) standard library.

VERSION
-------

Version 0.01 (2014-01-15)

INSTALLATION
------------

In order to build and run an application JAR type the following:

    $ git clone git://github.com/pawelkrol/ScalaSwing-HelloWorld.git
    $ cd ScalaSwing-HelloWorld
    $ sbt clean update compile test assembly
    $ java -Dfile.encoding=UTF8 -jar target/scala-2.10/hello-world-0.01.jar

COPYRIGHT AND LICENCE
---------------------

Copyright (C) 2014 by Pawel Krol.

This library is free open source software; you can redistribute it and/or modify it under the same terms as Scala itself, either Scala version 2.10.3 or, at your option, any later version of Scala you may have available.

