
FROM eclipse-temurin:17-jdk-jammy
COPY target/*.jar app.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "/app.jar"]