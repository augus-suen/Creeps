# Add project specific ProGuard rules here.
# By default, the flags in this file are appended to flags specified
# in /Users/wenba/Library/Android/sdk/tools/proguard/proguard-android.txt
# You can edit the include path and order by changing the proguardFiles
# directive in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# Add any project specific keep options here:

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}

# Uncomment this to preserve the line number information for
# debugging stack traces.
#-keepattributes SourceFile,LineNumberTable

# If you keep the line number information, uncomment this to
# hide the original source file name.
#-renamesourcefileattribute SourceFile
# 不使用大小写混合的类名
-dontusemixedcaseclassnames

# 不忽略类库中非public的类
-dontskipnonpubliclibraryclasses

# 打印处理代码的信息
-verbose

# 关闭优化
-dontoptimize

# 关闭预校验
-dontpreverify

# 保持Annotations属性
-keepattributes *Annotation*

# 保持ILicensingService这个公共类
-keep public class com.google.vending.licensing.ILicensingService

# 保持ILicensingService这个公共类
-keep public class com.android.vending.licensing.ILicensingService

# 所有的native方法不被混淆
-keepclasseswithmembernames class * {
    native <methods>;
}

# 保持继承自View类的set()、get()方法
-keepclassmembers public class * extends android.view.View {
   void set*(***);
   *** get*();
}

# 保持继承自Activity类，参数是view的方法
-keepclassmembers class * extends android.app.Activity {
   public void *(android.view.View);
}

# 保持枚举类values()、valueOf()方法
-keepclassmembers enum * {
    public static **[] values();
    public static ** valueOf(java.lang.String);
}

# 保持实现Serializable的可序列化类字段CREATOR
-keepclassmembers class * implements android.os.Parcelable {
  public static final android.os.Parcelable$Creator CREATOR;
}

# 保持R（资源）下的所有类的静态字段
-keepclassmembers class **.R$* {
    public static <fields>;
}

# 不打印处理support包的警告信息
-dontwarn android.support.**

# 保持Keep类
-keep class android.support.annotation.Keep

# 保持使用@Keep注解的类及其所有成员
-keep @android.support.annotation.Keep class * {*;}

# 保持使用@Keep注解的方法及其类
-keepclasseswithmembers class * {
    @android.support.annotation.Keep <methods>;
}

# 保持@Keep注解的字段及其类
-keepclasseswithmembers class * {
    @android.support.annotation.Keep <fields>;
}

# 保持使用@Keep注解的构造方法及其类
-keepclasseswithmembers class * {
    @android.support.annotation.Keep <init>(...);
}


#retrofit
-dontwarn okio.**
-dontwarn javax.annotation.**

#okhttp
-dontwarn okhttp3.**

#butterKnife
# Retain generated class which implement ViewBinder.
-keep public class * implements butterknife.internal.ViewBinder { public <init>(); }
# Prevent obfuscation of types which use ButterKnife annotations since the simple name
# is used to reflectively look up the generated ViewBinder.
-keep class butterknife.*
-keepclasseswithmembernames class * { @butterknife.* <methods>; }
-keepclasseswithmembernames class * { @butterknife.* <fields>; }