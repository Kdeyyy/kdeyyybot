# Use Java 21
FROM eclipse-temurin:21-jdk

# Set workdir
WORKDIR /app

# Copy Gradle wrapper and build files
COPY gradlew .
COPY gradle gradle
COPY build.gradle settings.gradle ./

# Copy source code
COPY src src

# Make Gradle wrapper executable
RUN chmod +x ./gradlew

# Build the project (skip tests)
RUN ./gradlew build -x test

# Copy built JAR to app.jar
RUN cp build/libs/coffee-shop-telegram-bot-0.0.1-SNAPSHOT.jar app.jar

# Expose port
EXPOSE 8080

# Run the app
CMD ["sh", "-c", "java -jar app.jar --server.port=$PORT"]
