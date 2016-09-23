First, run mvn install on the testtools project. This bundles JUnit and EqualsVerifier together to a bundle due to not being OSGi enabled bundles.

Then you can run mvn install on the top pom to see the problem arise. When you remove the annotation from the Bar field of Foo the error disappears.

