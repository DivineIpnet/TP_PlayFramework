name := """gestionVente"""
organization := "com.grace"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

scalaVersion := "2.13.3"

libraryDependencies += guice
libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.18"
