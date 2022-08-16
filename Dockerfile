FROM eclipse-temurin:17-jre-alpine
COPY /target/*.jar  /opt/app/*.jar
EXPOSE 8080
WORKDIR /opt/app
ENTRYPOINT ["java","-Dspring.profiles.active=docker" ,"-jar","/opt/app/*.jar"]