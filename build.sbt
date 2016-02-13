organization  := "com.example"

version       := "0.1"

scalaVersion := "2.11.7"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")


resolvers ++= Seq(
  "spray repo" at "http://repo.spray.io/"
)

libraryDependencies ++= {
  val akkaV = "2.3.9"
  val sprayV = "1.3.3"

  Seq(
    "io.spray"            %%  "spray-can"     % sprayV,
    "io.spray"            %%  "spray-routing" % sprayV,
    "io.spray"            %%  "spray-client"  % sprayV,
    "io.spray"            %   "spray-json_2.11"    % "1.3.2",
    "io.spray"            %%  "spray-testkit" % sprayV  % "test",
    "com.typesafe.akka"   %%  "akka-actor"    % akkaV,
    "com.typesafe.akka"   %%  "akka-testkit"  % akkaV   % "test",
    "com.typesafe.akka"   %%  "akka-slf4j" % akkaV,
    "ch.qos.logback"      %   "logback-classic" % "1.0.12",
    "org.specs2"          %%  "specs2-core"   % "2.3.11" % "test",
    "org.scalatest"       %   "scalatest_2.11" % "2.2.4" % "test"
  )
}

Revolver.settings


