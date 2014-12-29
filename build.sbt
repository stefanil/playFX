// import play.PlayJava

name := """playFX"""

version := "0.1-SNAPSHOT"

lazy val root = (project in file("."))
//  .enablePlugins(PlayJava)
  .aggregate(play, java)
  .dependsOn(play, java)

lazy val play = (project in file("modules/play"))//.enablePlugins(PlayScala)

lazy val java = (project in file("modules/java"))//.enablePlugins(PlayScala)

scalaVersion := "2.11.1"

//libraryDependencies ++= Seq(
//  javaJdbc,
//  javaEbean,
//  cache,
//  javaWs
//)
