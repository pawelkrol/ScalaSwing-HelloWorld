object ProguardConf {

  val helloWorld =
"""
-keepattributes Signature
-optimizations "code/allocation/*,code/merging,code/removal/*,code/simplification/*,class/marking/*,class/merging/*,class/unboxing/*,field/*,method/inlining/*,method/marking/*,method/propagation/*,method/removal/*"
-printmapping mapping.log
-printseeds seeds.log
-printusage usage.log
-verbose

-keepclassmembers class * {
  ** MODULE$;
}
"""
}
