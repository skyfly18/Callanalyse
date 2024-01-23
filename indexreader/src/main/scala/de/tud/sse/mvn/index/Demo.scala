package de.tud.sse.mvn.index

import akka.actor.ActorSystem
import akka.stream.Materializer
import akka.stream.scaladsl.Sink

import java.net.URI
import scala.util.{Failure, Success, Try}

object Demo extends App {

  def usePlainReader(): Unit = {
    val indexReader = new MavenIndexReader()

    var result = Try(indexReader.read())
    var cnt = 0

    while(result.isSuccess && result.get.isDefined){
      val identifier = result.get.get

      //TODO: Do something with identifier

      if(cnt % 100000 == 0)
        println(s"Got $cnt artifacts so far.")

      result = Try(indexReader.read())
      cnt += 1
    }

    indexReader.close()

    result match {
      case Failure(ex) =>
        println(s"Ended index iteration after $cnt artifacts because of exception: ${ex.getMessage}")
      case Success(None) =>
        println(s"Ended index iteration after $cnt artifacts.")
      case _ =>
        println(s"This should not happen")
    }
  }

  def useSource(): Unit = {
    val system = ActorSystem("example-system")
    val materializer = Materializer(system)
    val source = IndexProcessing.createSource(new URI(MavenIdentifier.DefaultRepository))

    var cnt = 0

    def handleIdentifier(identifier: MavenIdentifier) = {
      //TODO: Do something with identifier


      if (cnt % 100000 == 0)
        println(s"Got $cnt artifacts so far.")

      cnt += 1
    }

    source
      .runWith(Sink.foreach( identifier => handleIdentifier(identifier) ))(materializer)
      .andThen(_ => println(s"Ended index iteration after $cnt artifacts."))(materializer.executionContext)


  }


  if(Math.random() > 0.5){
    println("Using traditional index iteration:")
    usePlainReader()
  } else {
    println("Using Akka streams for index iteration:")
    useSource()
  }

}

