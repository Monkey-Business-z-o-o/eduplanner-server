FROM openjdk:17-jdk-slim

WORKDIR /app
COPY gradlew gradlew.bat build.gradle settings.gradle ./
COPY gradle ./gradle
COPY src ./src

RUN chmod +x ./gradlew
RUN ./gradlew build --no-daemon

CMD ["java", "-jar", "CMD ["sh", "-c", "java -jar build/libs/*.jar"]

