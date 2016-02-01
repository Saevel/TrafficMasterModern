package prv.zielony.trafficmaster.planner.utils

import java.util.Properties

/**
  * Created by zielony on 28.01.16.
  */
object ClasspathProperties extends (String => Properties) {

   override def apply(path: String): Properties = {
     val properties = new Properties();
     properties.load(this.getClass.getClassLoader.getResourceAsStream(path))

     return properties;
   }
 }
