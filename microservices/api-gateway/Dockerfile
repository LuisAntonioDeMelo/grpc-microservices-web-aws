FROM maven:3.6.1-jdk-8-slim AS build
RUN mkdir -p /workspace
WORKDIR /workspace
COPY pom.xml /workspace
COPY src /workspace/src
COPY libs /workspace/libs
RUN mvn -f pom.xml clean install

FROM openjdk:8-alpine
COPY --from=build /workspace/target/*.jar app.jar
COPY --from=build /workspace/libs/*.jar /libs
EXPOSE 8099
ENTRYPOINT ["java","-jar","app.jar"]