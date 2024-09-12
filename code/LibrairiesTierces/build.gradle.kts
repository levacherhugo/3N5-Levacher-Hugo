plugins {
    kotlin("jvm") version "2.0.10"
}

group = "org.levacher"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    // https://mvnrepository.com/artifact/org.jsoup/jsoup
    implementation("org.jsoup:jsoup:1.18.1")
    // https://mvnrepository.com/artifact/commons-validator/commons-validator
    implementation("commons-validator:commons-validator:1.9.0")
    implementation("org.magicwerk.brownies:brownies-collections:0.9.23")

}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}