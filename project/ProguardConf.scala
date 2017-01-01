object ProguardConf {

  val helloWorld =
"""
-dontnote
-dontwarn
-optimizations "code/allocation/*,code/merging,code/removal/*,code/simplification/*,class/marking/*,class/merging/*,class/unboxing/*,field/*,method/inlining/*,method/marking/*,method/propagation/*,method/removal/*"

-keepclassmembers class * {
  ** MODULE$;
}

-keep public class ij.plugin.ClassChecker {
}
"""
}
