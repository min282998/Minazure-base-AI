plugins {
    id("fabric-loom") version "1.7-SNAPSHOT"
}

repositories {
    mavenCentral()
    maven("https://maven.meteorclient.com/snapshots")
    maven("https://maven.meteorclient.com/releases")
    maven("https://maven.fabricmc.net/")
    maven("https://jitpack.io")
}

dependencies {
    minecraft("com.mojang:minecraft:1.21.4")
    mappings("net.fabricmc:yarn:1.21.4+build.2:v2")
    modImplementation("net.fabricmc:fabric-loader:0.16.9")
    
    // Quay lại dùng link chuẩn của Meteor, vì link com.github kia bị lỗi đường dẫn
    modImplementation("meteordevelopment:meteor-client:0.6.0-SNAPSHOT")
}

tasks.withType<JavaCompile>().configureEach {
    options.release.set(21)
}
