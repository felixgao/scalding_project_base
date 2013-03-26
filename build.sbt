name := "scalding-collision-fragmentation"

version := "1.0"

scalaVersion := "2.9.2"

resolvers += "Concurrent Maven Repo" at "http://conjars.org/repo"

libraryDependencies += "cascading" % "cascading-core" % "2.1.5"

libraryDependencies += "cascading" % "cascading-local" % "2.1.5"

libraryDependencies += "cascading" % "cascading-hadoop" % "2.1.5"

libraryDependencies += "cascading.kryo" % "cascading.kryo" % "0.4.4"

libraryDependencies += "com.twitter" % "meat-locker" % "0.3.0"

libraryDependencies += "com.twitter" % "maple" % "0.2.2"

libraryDependencies += "commons-lang" % "commons-lang" % "2.4"

libraryDependencies += "org.specs2" % "specs2_2.9.2" % "1.12.1"

libraryDependencies ++= Seq(
"com.twitter" %% "scalding" % "0.8.3" // check the scalding wiki for updates
)
 
initialCommands in console := """
    | import com.twitter.scalding._
    | import com.twitter.scalding.mathematics._
 """.stripMargin

// Invocation exception if we try to run the tests in parallel
parallelExecution in Test := false
