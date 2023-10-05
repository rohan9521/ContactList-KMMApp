buildscript {
    dependencies {
        classpath("com.android.tools.build:gradle:7.2.0")
    }
}
plugins {
    //trick: for the same plugin versions in all sub-modules
    id("com.android.application").version("7.2.0").apply(false)
    id("com.android.library").version("7.2.0").apply(false)
    kotlin("android").version("1.8.21").apply(false)
    kotlin("multiplatform").version("1.8.21").apply(false)
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
