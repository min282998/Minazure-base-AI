plugins {
    id("fabric-loom") version "1.7-SNAPSHOT"
}

version = "1.0.0"
group = "com.example"

repositories {
    mavenCentral()
    maven("https://jitpack.io")
    maven("https://maven.fabricmc.net/")
}

dependencies {
    minecraft("com.mojang:minecraft:1.21.4")
    mappings("net.fabricmc:yarn:1.21.4+build.2:v2")
    modImplementation("net.fabricmc:fabric-loader:0.16.9")
    // Dùng JitPack để né server Meteor đang sập
    modImplementation("com.github.MeteorDevelopment:meteor-client:0.6.0-SNAPSHOT")
}

tasks.withType<JavaCompile>().configureEach {
    options.release.set(21)
}
