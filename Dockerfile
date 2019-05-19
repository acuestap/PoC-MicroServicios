FROM openjdk:8-jre-alpine
MAINTAINER Everis <thaddeus.jerde994@mailbox87.de>
ADD target/*.jar vacaciones-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "vacaciones-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080
