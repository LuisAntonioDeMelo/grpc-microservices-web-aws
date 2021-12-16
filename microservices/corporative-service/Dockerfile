FROM openjdk:8-alpine
ARG JAR_FILE=target/corporative-service-0.1.jar
WORKDIR /opt/app
COPY ${JAR_FILE} app.jar
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]
ENTRYPOINT ["java","-jar","app.jar"]