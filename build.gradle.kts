plugins {
    id("java")
}

group = "com.daniel.apps"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
//    testImplementation(platform("org.junit:junit-bom:5.10.0"))
//    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("org.testng:testng:7.10.2")
    implementation("org.seleniumhq.selenium:selenium-java:4.26.0")

}

tasks.test {
//    useJUnitPlatform()
    useTestNG()
}