buildscript{


    dependencies{
        classpath("com.google.gms:google-services:4.4.0")
        classpath("com.android.tools.build:gradle:4.2.0")
    }
}

plugins {
    id("com.android.application") version "8.2.2" apply false
    id ("com.android.library") version "8.2.0" apply false
    id("org.jetbrains.kotlin.android") version "1.9.0" apply false

}