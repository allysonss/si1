name := "lab2"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache
)

val appDependencies = Seq(
  javaJdbc
)     

play.Project.playJavaSettings
