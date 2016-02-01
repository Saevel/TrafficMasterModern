package prv.zielony.trafficmaster.search.main

import akka.actor.ActorSystem
import prv.zielony.trafficmaster.search.utils.ClasspathProperties
import spray.routing.SimpleRoutingApp

/**
 * Created by zielony on 27.01.16.
 */
object Main extends SimpleRoutingApp{

  val deploymentProperties = ClasspathProperties("deployment.properties")

  val properties = ClasspathProperties("application.properties");

  implicit val actorSystem = ActorSystem(properties.getProperty("default.akka.actor.system.name"))

  def main(args:Array[String]):Unit = {
    //TODO: Move these to the generated deployment.properties

    this.startServer(deploymentProperties.getProperty("microservices.search.server.host"),
      Integer.parseInt(deploymentProperties.getProperty("microservices.search.server.port"))) {
      path("version") {
        complete("1.0")
      }
    }
  }
}