name := "hello-world"

version := "1.0"

scalaVersion := "2.11.7"

val sparkVersion = "1.3.1"

val spark = Seq( "org.apache.spark" % "spark-core_2.11" % sparkVersion)

libraryDependencies ++= spark
