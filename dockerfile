# Używamy obrazu z OpenJDK 17 (lub innej wersji, której używa Twój projekt)
FROM openjdk:17-jdk-slim

# Ustawiamy katalog roboczy w kontenerze
WORKDIR /app

# Kopiujemy pliki projektu
COPY . .

# Kompilujemy aplikację przy użyciu Gradle/Maven
RUN ./gradlew build -x test

# Przechodzimy do katalogu z gotowym artefaktem (np. plik JAR)
WORKDIR /app/build/libs

# Uruchamiamy aplikację
CMD ["java", "-jar", "eduplanner-server.jar"]
