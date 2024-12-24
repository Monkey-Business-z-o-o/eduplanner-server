FROM openjdk:17-jdk-slim
ENV GRADLE_OPTS="-Dorg.gradle.daemon=false"
WORKDIR /app
COPY gradlew gradlew.bat build.gradle settings.gradle ./
COPY gradle ./gradle
COPY src ./src
RUN chmod +x ./gradlew && \
    apt-get update && apt-get install -y curl unzip && \
    rm -rf /var/lib/apt/lists/* && \
    ./gradlew build --no-daemon
CMD ["java", "-jar", "build/libs/EduPlanner-0.0.1-SNAPSHOT.jar"]