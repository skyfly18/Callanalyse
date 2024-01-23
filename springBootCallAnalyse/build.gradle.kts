plugins {
	java
	scala
	id("org.springframework.boot") version "3.1.8"
	id("io.spring.dependency-management") version "1.1.3"
}

group = "de.skyfly"
version = "0.0.1-SNAPSHOT"

java {
	sourceCompatibility = JavaVersion.VERSION_17
	sourceSets{
		val main by getting {
			dependencies {
				implementation("org.springframework.boot:spring-boot-starter-data-jpa")
				runtimeOnly("org.postgresql:postgresql")
				implementation("org.scala-lang:scala-library:2.13.12")
				implementation("commons-io:commons-io:2.14.0")

				testImplementation("org.springframework.boot:spring-boot-starter-test")
				implementation(project(":indexreader"))
				implementation(project(":analysetool"))
			}
		}
	}
}
springBoot {
	mainClass.set("de.skyfly.callanalyse.CallanalyseApplication")
}




tasks.withType<Test> {
	useJUnitPlatform()
}
