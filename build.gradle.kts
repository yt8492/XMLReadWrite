plugins {
    kotlin("jvm") version "1.3.70"
}

group = "com.yt8492"
version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation("jaxen:jaxen:1.1.6")
    implementation("org.dom4j:dom4j:2.1.1")
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
}