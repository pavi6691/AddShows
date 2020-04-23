FROM openjdk:8
CMD mvn clean install -DskipTests
ADD target/add-show-service.jar add-show-service.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "add-show-service.jar"]