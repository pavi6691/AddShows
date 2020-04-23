FROM openjdk:8
ADD web/target/docker-AddShows-service.jar docker-AddShows-service.jar
EXPOSE 8080
CMD mvn clean install
ENTRYPOINT ["java", "-jar", "docker-AddShows-service.jar"]