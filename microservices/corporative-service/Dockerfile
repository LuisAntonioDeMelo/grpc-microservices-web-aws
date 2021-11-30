#FROM maven:3.6.1-jdk-8-slim AS build
#RUN mkdir -p /workspace
#WORKDIR /workspace
#COPY pom.xml /workspace
#COPY src /workspace/src
#COPY libs /workspace/libs
#RUN mvn -f pom.xml clean package
#
#FROM openjdk:8-alpine
#COPY --from=build /workspace/target/*.jar app.jar
#EXPOSE 8081
#ENTRYPOINT ["java","-jar","app.jar"]

FROM openjdk:8-alpine
ARG JAR_FILE=target/corporative-service-0.1.jar
WORKDIR /opt/app
COPY ${JAR_FILE} app.jar
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]
ENTRYPOINT ["java","-jar","app.jar"]