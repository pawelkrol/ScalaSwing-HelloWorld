object ProguardConf {

  val helloWorld =
"""
-dontnote
-dontwarn
-keepattributes Signature
-optimizations "code/allocation/*,code/merging,code/removal/*,code/simplification/*,class/marking/*,class/merging/*,class/unboxing/*,field/*,method/inlining/*,method/marking/*,method/propagation/*,method/removal/*"

-keepclassmembers class * {
  ** MODULE$;
}

-keep public class scala.swing.Label {
  *;
}

-keep public class scala.swing.MainFrame {
  *;
}
"""
}
