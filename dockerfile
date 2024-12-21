# Użyj obrazu OpenJDK 17 w wersji slim jako bazowego
FROM openjdk:17-jdk-slim

# Ustaw zmienną środowiskową dla pracy z Gradle w trybie bez daemonów
ENV GRADLE_OPTS="-Dorg.gradle.daemon=false"

# Ustaw katalog roboczy
WORKDIR /app

# Skopiuj pliki Gradle i konfigurację projektu
COPY gradlew gradlew.bat build.gradle settings.gradle ./
COPY gradle ./gradle

# Skopiuj kod źródłowy
COPY src ./src

# Ustaw uprawnienia do pliku gradlew
RUN chmod +x ./gradlew

# Wykonaj budowanie projektu
RUN ./gradlew build --no-daemon

# Ustaw komendę uruchomienia
CMD ["java", "-jar", "build/libs/*.jar"]
