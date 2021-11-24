#FROM maven:3.6.1-jdk-8-slim AS build
#RUN mkdir -p /workspace
#WORKDIR /workspace
#COPY pom.xml /workspace
#COPY src /workspace/src
#RUN mkdir -p /root/.m2 \
#    && mkdir /root/.m2/repository
## Copy maven settings, containing repository configurations
#COPY settings.xml /root/.m2
#RUN mvn -f pom.xml clean install
#
#FROM openjdk:8-alpine
#COPY --from=build /workspace/target/*.jar app.jar
#EXPOSE 8099
#ENTRYPOINT ["java","-jar","app.jar"]

FROM openjdk:8-alpine
ARG JAR_FILE=target/api-gateway-0.1.jar
WORKDIR /opt/app
COPY ${JAR_FILE} app.jar
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]
ENTRYPOINT ["java","-jar","app.jar"]