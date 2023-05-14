buildscript {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:8.0.1")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.7.20")
        classpath("dev.testify:plugin:2.0.0-beta01")
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}
