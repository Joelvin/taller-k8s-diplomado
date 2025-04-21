FROM eclipse-temurin:17-jdk

WORKDIR /app

# Copia el jar ya construido
COPY target/*.jar app.jar

EXPOSE 9090

ENTRYPOINT ["java", "-jar", "app.jar"]