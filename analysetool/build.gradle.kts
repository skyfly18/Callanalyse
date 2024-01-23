plugins {
	scala

}





dependencies {
	implementation("org.scala-lang:scala-library:2.13.12")
	implementation("de.opal-project:hermes_2.13:5.0.0")
	implementation("de.opal-project:framework_2.13:5.0.0")
	implementation("de.opal-project:common_2.13:5.0.0")
	implementation("org.slf4j:slf4j-api:2.0.9")
	implementation("de.voize:semver4k:4.2.1")
	implementation("net.swiftzer.semver:semver:1.3.0")
	testImplementation("org.scalatest:scalatest_2.13:3.2.17")
	testImplementation("org.scalatestplus:junit-4-13_2.13:3.2.2.0")

	testRuntimeOnly("org.scala-lang.modules:scala-xml_2.13:1.2.0")

}


