object ProguardConf {

  val helloWorld =
"""
-dontnote
-dontwarn
-ignorewarnings
-keepattributes Signature
-libraryjars <java.home>/jmods
-optimizations "code/allocation/*,code/merging,code/removal/*,code/simplification/*,class/marking/*,class/merging/*,class/unboxing/*,field/*,method/inlining/*,method/marking/*,method/propagation/*,method/removal/*"

-keepclassmembers class * {
  ** MODULE$;
}
"""
}
