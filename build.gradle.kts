plugins {
    id("fabric-loom") version "1.7-SNAPSHOT"
}

repositories {
    mavenCentral()
    maven("https://jitpack.io") // Link dự phòng khi server Meteor sập
    maven("https://maven.fabricmc.net/")
}

dependencies {
    minecraft("com.mojang:minecraft:1.21.4")
    mappings("net.fabricmc:yarn:1.21.4+build.2:v2")
    modImplementation("net.fabricmc:fabric-loader:0.16.9")
    // Tải Meteor trực tiếp từ GitHub cho chắc chắn
    modImplementation("com.github.MeteorDevelopment:meteor-client:0.6.0-SNAPSHOT")
}
