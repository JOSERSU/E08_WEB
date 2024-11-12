FROM openjdk:21
COPY target/equipos_deportivos-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]