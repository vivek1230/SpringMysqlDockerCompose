FROM openjdk:17
ADD target/spring-mysql-docker-compose.jar spring-mysql-docker-compose.jar
ENTRYPOINT ["java", "-jar", "/spring-mysql-docker-compose.jar"]