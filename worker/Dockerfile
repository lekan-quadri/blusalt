FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD target/worker.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]