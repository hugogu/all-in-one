FROM openjdk:8-jre-alpine

ENV TZ UTC

COPY build/libs/postres-demo-0.0.1-SNAPSHOT.jar /var/apps/postgres/app.jar

ENTRYPOINT java -jar /var/apps/postgres/app.jar