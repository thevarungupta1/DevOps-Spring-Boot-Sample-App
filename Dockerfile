#FROM openjdk:17-oracle
FROM openjdk:17-jdk-slim
MAINTAINER thevarungupta5
ARG JAR_FILE=target/*
COPY target/${JAR_FILE} app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
