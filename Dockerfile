FROM openjdk:17-jdk-slim

ENV GRADLE_OPTS="-Dorg.gradle.daemon=false"

WORKDIR /app

COPY gradlew gradlew.bat build.gradle settings.gradle ./
COPY gradle ./gradle
COPY src ./src

RUN chmod +x ./gradlew

RUN apt-get update && apt-get install -y \
    curl \
    unzip \
    && rm -rf /var/lib/apt/lists/*

RUN ./gradlew build --no-daemon

CMD ["java", "-jar", "build/libs/*.jar"]

