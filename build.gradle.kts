plugins {
	java
	scala

}

group = "de.skyfly"
version = "0.0.1"

java {
	sourceCompatibility = JavaVersion.VERSION_17
}

allprojects {
	repositories {
		mavenCentral()

	}
}

dependencies {
	implementation("org.scala-lang:scala-library:2.13.12")

}

tasks.withType<Test> {
	useJUnitPlatform()
}
