FROM openjdk:17-jdk-alpine

ENV APP_REFERENCE_JAR=target/shoppers.jar
ENV APP_NAME=shoppers.jar

COPY ${APP_REFERENCE_JAR} ${APP_NAME}
ENTRYPOINT java -jar ${APP_NAME}

EXPOSE 8081