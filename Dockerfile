# Użyj obrazu OpenJDK 17 w wersji slim jako bazowego
FROM openjdk:17-jdk-slim

# Ustaw katalog roboczy
WORKDIR /app

# Skopiuj pliki Gradle i konfigurację projektu
COPY gradlew gradlew.bat build.gradle settings.gradle ./
COPY gradle ./gradle

# Skopiuj kod źródłowy
COPY src ./src

# Ustaw uprawnienia do pliku gradlew
RUN chmod +x ./gradlew

# Wykonaj budowanie projektu bez testów
RUN ./gradlew build -x test --no-daemon

# Wystaw port aplikacji (domyślnie Spring Boot działa na 8081)
EXPOSE 8081

# Uruchom aplikację
CMD ["java", "-jar", "build/libs/EduPlanner-0.0.1-SNAPSHOT.jar"]
