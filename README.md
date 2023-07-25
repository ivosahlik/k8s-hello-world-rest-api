# Hello World Rest API

### Build App - jar
``` local build to docker
mvn build
```

### Dockerfile - Create image
``` local build to docker
docker build --tag 'hello-world-rest-api' .
docker images
```

### Build - Create image
``` local build to docker
mvn jib:dockerBuild
```

### Run via docker-compose.yaml
``` local build to docker
docker-compose up
docker-compose down
```

### Run with K8S/K3S
```
kubectl apply -f deployment.yaml
kubectl delete -f deployment.yaml
```

### Running the Application

- http://localhost:8080/hello-world

```txt
Hello World V1 abcde
```

- http://localhost:8081/hello-world-bean

```json
{"message":"Hello World"}
```

- http://localhost:8080/hello-world/path-variable/test

```json
{"message":"Hello World, test"}
```