grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"
grails.project.target.level = 1.6
//grails.project.war.file = "target/${appName}-${appVersion}.war"

grails.project.dependency.resolution = {
    // inherit Grails' default dependencies
    inherits("global") {
        // uncomment to disable ehcache
        // excludes 'ehcache'
    }
    log "warn" // log level of Ivy resolver, either 'error', 'warn', 'info', 'debug' or 'verbose'
    repositories {
        grailsCentral()
        mavenCentral()
        mavenRepo "http://dev.coova.org/mvn/"
    }
    dependencies {
        compile('org.springframework.security:spring-security-core:3.0.5.RELEASE') {
            transitive = false
        }
        compile('net.jradius:jradius-core:1.1.4') {
            transitive = false
        }
        compile('net.jradius:jradius-dictionary:1.1.4') {
            transitive = false
        }
        compile('net.jradius:jradius-extended:1.1.4') {
            transitive = false
        }
    }

    plugins {
        build(":tomcat:$grailsVersion",
              ":release:1.0.0.RC3") {
            export = false
        }
    }
}
