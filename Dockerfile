FROM maven:3.9.6-amazoncorretto-21 AS build
RUN mkdir -p /api_combat
COPY src /api_combat/src
COPY pom.xml /api_combat
WORKDIR /api_combat
RUN mvn clean package

FROM amazoncorretto:21.0.2-alpine3.19
COPY --from=build /api_combat/target/*.jar /app.jar
EXPOSE 8080/tcp
ENTRYPOINT ["java", "-Dspring.profiles.active=docker", "-jar", "/app.jar"]
