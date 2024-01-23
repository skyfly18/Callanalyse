plugins {
	scala

}





dependencies {
	implementation("org.scala-lang:scala-library:2.13.12")
	implementation("org.apache.maven.indexer:indexer-reader:7.0.4")
	implementation("com.typesafe.akka:akka-http_2.13:10.5.3")
	implementation("com.typesafe.akka:akka-stream_2.13:2.8.5")
	implementation("org.slf4j:slf4j-api:2.0.9")

}

tasks.withType<Test> {
	useJUnitPlatform()
}
