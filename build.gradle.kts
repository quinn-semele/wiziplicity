import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("java-library")
    kotlin("jvm") version "1.9.24"
    kotlin("plugin.serialization") version "1.9.24"
    id("dev.architectury.loom") version "1.6-SNAPSHOT"
}

group = "dev.compasses"
version = "${properties["mod_version"]}+${properties["minecraft_version"]}"

base.archivesName = "wiziplicity"

loom {
    silentMojangMappingsLicense()
    clientOnlyMinecraftJar()
}

repositories {
    mavenCentral()

    maven {
        name = "ParchmentMC Maven"
        url = uri("https://maven.parchmentmc.org/")
    }

    maven {
        name = "TerraformersMC Maven"
        url = uri("https://maven.terraformersmc.com/")
    }
}

dependencies {
    minecraft("net.minecraft:minecraft:${properties["minecraft_version"]}")

    @Suppress("UnstableApiUsage")
    mappings(loom.layered {
        officialMojangMappings()
        parchment("org.parchmentmc.data:parchment-${properties["parchment_version"]}")
    })

    modImplementation("net.fabricmc:fabric-loader:${properties["fabric_loader_version"]}")
    modImplementation("net.fabricmc.fabric-api:fabric-api:${properties["fabric_api_version"]}")
    modImplementation("net.fabricmc:fabric-language-kotlin:${properties["fabric_kotlin_version"]}")

    modImplementation("com.terraformersmc:modmenu:${properties["modmenu_version"]}")
}

val javaVersion = JavaVersion.VERSION_21
val javaOrdinal = javaVersion.ordinal + 1

java {
    sourceCompatibility = javaVersion
    targetCompatibility = javaVersion
}

tasks {
    withType<JavaCompile>().configureEach {
        options.encoding = "UTF-8"
        options.release = javaOrdinal
    }

    withType<KotlinCompile>().configureEach {
        kotlinOptions.jvmTarget = javaVersion.toString()
    }

    named<ProcessResources>("processResources") {
        inputs.properties(mutableMapOf(
            "version" to project.properties["mod_version"]
        ))

        filesMatching("fabric.mod.json") {
            expand(inputs.properties)
        }
    }
}