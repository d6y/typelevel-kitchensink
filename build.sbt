name := "Type Level Kitchen Sink"

scalaVersion := "2.11.1"

scalacOptions ++= Seq(
  "-deprecation", 
  "-encoding", "UTF-8",
  "-feature"
)

resolvers += "Scalaz Bintray Repo" at "http://dl.bintray.com/scalaz/releases"

resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/"


val scalazVersion = "7.0.6"

libraryDependencies ++= Seq(
  "org.scalaz" %% "scalaz-core"               % scalazVersion,
  "org.scalaz" %% "scalaz-concurrent"         % scalazVersion,
  "org.scalaz" %% "scalaz-xml"                % scalazVersion,
  "org.scalaz" %% "scalaz-iteratee"           % scalazVersion,
  "org.scalaz" %% "scalaz-typelevel"          % scalazVersion,
  "org.scalaz" %% "scalaz-effect"             % scalazVersion,
  "org.scalaz" %% "scalaz-scalacheck-binding" % scalazVersion,
  "org.scalaz" %% "scalaz-iterv"              % scalazVersion
)

libraryDependencies += "org.scalaz.stream" %% "scalaz-stream" % "0.4.1"


libraryDependencies ++= Seq(
  "com.chuusai" %% "shapeless" % "2.0.0"
)

libraryDependencies += "org.spire-math" %% "spire" % "0.7.5"

libraryDependencies +=  "io.argonaut" %% "argonaut" % "6.0.4"

val monocleVersion = "0.4.0"

libraryDependencies ++= Seq(
  "com.github.julien-truffaut"  %%  "monocle-core"    % monocleVersion,
  "com.github.julien-truffaut"  %%  "monocle-generic" % monocleVersion,
  "com.github.julien-truffaut"  %%  "monocle-macro"   % monocleVersion,
  "com.github.julien-truffaut"  %%  "monocle-law"     % monocleVersion % "test"
)


libraryDependencies ++= Seq(
  "org.scalacheck" %% "scalacheck" % "1.11.4" % "test"
)

libraryDependencies ++= Seq(
  "org.specs2" %% "specs2" % "2.3.12" % "test"
)

scalacOptions in Test ++= Seq("-Yrangepos")



// Compatible with Scalaz 7.0.* and Shapeless 1.2.4
// libraryDependencies += "org.typelevel" %% "scodec-core" % "1.0.0"

// Compatible with Scalaz 7.1.* and Shapeless 2.0:
// libraryDependencies += "org.typelevel" %% "scodec-core" % "1.1.0-SNAPSHOT"



