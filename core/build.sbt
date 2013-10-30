organization := "tv.cntt"

name         := "monitrum-core"

version      := "1.0-SNAPSHOT"

scalaVersion := "2.10.3"

scalacOptions ++= Seq("-deprecation", "-feature", "-unchecked")

// Most Scala projects are published to Sonatype, but Sonatype is not default
// and it takes several hours to sync from Sonatype to Maven Central
resolvers += "SonatypeReleases" at "http://oss.sonatype.org/content/repositories/releases/"

// Monitrum uses SLF4J, an implementation of SLF4J is needed
libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.0.13"

// For clustering; Glokka is included here
libraryDependencies += "tv.cntt" %% "glokka" % "1.3"

// Redirect Akka log to SLF4J
libraryDependencies += "com.typesafe.akka" %% "akka-slf4j" % "2.2.1"


// By default, version 2.10.0 of the libs below is used!!! ---------------------

libraryDependencies <+= scalaVersion { sv =>
  "org.scala-lang" % "scala-compiler" % sv
}

libraryDependencies <+= scalaVersion { sv =>
  "org.scala-lang" % "scala-reflect" % sv
}

libraryDependencies <+= scalaVersion { sv =>
  "org.scala-lang" % "scalap" % sv
}

scalacOptions += "-P:continuations:enable"

autoCompilerPlugins := true

// https://groups.google.com/forum/?fromgroups#!topic/simple-build-tool/ReZvT14noxU
libraryDependencies <+= scalaVersion { sv =>
  compilerPlugin("org.scala-lang.plugins" % "continuations" % sv)
}

scalacOptions += "-P:continuations:enable"

//------------------------------------------------------------------------------

// Skip API doc generation to speedup "publish-local" while developing.
// Comment out this line when publishing to Sonatype.
publishArtifact in (Compile, packageDoc) := false