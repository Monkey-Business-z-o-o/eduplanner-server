# Użyj obrazu z JDK 17 jako podstawy
FROM openjdk:17-jdk-slim

# Ustaw katalog roboczy
WORKDIR /app

# Skopiuj pliki projektu
COPY . .

# Zbuduj aplikację
RUN ./gradlew build --no-daemon

# Ustaw port, na którym działa aplikacja
EXPOSE 8080

# Uruchom aplikację
CMD ["java", "-jar", "build/libs/eduplanner.jar"]
