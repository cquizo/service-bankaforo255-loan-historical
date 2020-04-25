FROM openjdk:13
VOLUME /tmp
EXPOSE 9093
ADD ./target/service-bankaforo255-loan-historical-0.0.1-SNAPSHOT.jar service-loan-historical.jar
ENTRYPOINT  ["java","-jar","/service-loan-historical.jar"]

# docker build -t loan-historical:v1 .
# docker run -p 9093:9093 --name loan-historical-server --network aforo255 -d loan-historical:v1
# docker run -p 1003:9093 --name loan-historical-server -d loan-historical:v1