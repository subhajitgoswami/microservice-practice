# Tomcat based container with Java and Tomcat
FROM tomcat:8.5
MAINTAINER aiml-team
ADD target/asn-ecl-microservice-server.jar /opt
CMD ["java","-jar", "/opt/asn-ecl-microservice-server.jar"]