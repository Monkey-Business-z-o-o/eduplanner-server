# Użycie obrazu z JDK
FROM openjdk:17-jdk-slim

# Ustawienie katalogu roboczego
WORKDIR /app

# Kopiowanie wszystkich plików z repozytorium
COPY . .

# Nadanie uprawnień do wykonania dla Gradle Wrapper
RUN chmod +x ./gradlew

# Budowanie projektu
RUN ./gradlew build --no-daemon

# Komenda startowa (przykład - dostosuj w razie potrzeby)
CMD ["java", "-jar", "docker.io/library/spring-boot-school-timetabling:1.0-SNAPSHOT"]
