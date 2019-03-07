version = "1.0-SNAPSHOT"

plugins {
    groovy
    java
    kotlin("jvm") version "1.2.71"
}

repositories {
    mavenCentral()
}

dependencies {
    compile(kotlin("stdlib"))
    testCompile("org.spockframework", "spock-core", "1.1-groovy-2.4-rc-2")
    testCompile("junit", "junit", "4.12")
}
