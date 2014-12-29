import play.PlayJava
//import play.PlayScala

name := """playFX"""

version := "0.1-SNAPSHOT"

lazy val server = (project in file("modules/server")).enablePlugins(PlayJava)

lazy val clientfx = project in file("modules/clientfx")//.enablePlugins(PlayJava)

lazy val playfx = (project in file("."))
  .aggregate(server, clientfx)
  //.dependsOn(server, client)
