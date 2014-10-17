name := "TenGoodReasonsToInvestYourTimeInFP"

version := "1.0"

libraryDependencies ++= Seq(
  "org.specs2" %% "specs2" % "2.4.6",
  "org.scalaz.stream" %% "scalaz-stream" % "0.5a"
)

scalacOptions in Test ++= Seq("-Yrangepos")

// Read here for optional dependencies:
// http://etorreborre.github.io/specs2/guide/org.specs2.guide.Runners.html#Dependencies
resolvers ++= Seq("snapshots", "releases").map(Resolver.sonatypeRepo)
