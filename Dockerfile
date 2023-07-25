FROM eclipse-temurin:17-jre-ubi9-minimal
VOLUME /tmp
EXPOSE 8080
ADD target/hello-world-rest-api.jar app.jar
ENTRYPOINT [ "sh", "-c", "java -jar /app.jar" ]