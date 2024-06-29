plugins {
    id("java")
}

allprojects {
    group = "com.seoin.account"
    version = "1.0-SNAPSHOT"

    repositories {
        mavenCentral()
    }
}

subprojects {
    apply(plugin = "java")
}