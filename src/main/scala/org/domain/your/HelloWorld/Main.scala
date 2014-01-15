package org.domain.your.HelloWorld

import swing.{Dimension, Label, MainFrame, SimpleSwingApplication}

object Main extends SimpleSwingApplication {
  def top = new MainFrame {
    title = "Scala Swing"
    preferredSize = new Dimension(640, 400)
    contents = new Label {
      text = "Hello World!"
    }
  }
}

