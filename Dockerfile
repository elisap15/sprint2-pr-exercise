FROM eclipse-temurin:21-jre-alpha
WORKDIR /app
COPY target/team-skeleton.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]

roar
