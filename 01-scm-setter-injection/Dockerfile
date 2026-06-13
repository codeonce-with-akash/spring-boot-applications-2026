FROM eclipse-temurin:17-jre

WORKDIR /app

COPY target/01-scm-setter-injection-0.0.1-SNAPSHOT.jar setter-injection.jar

ENTRYPOINT ["java","-jar","setter-injection.jar"]