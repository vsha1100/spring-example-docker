# Spring Boot example with Docker
[![Build Status](https://travis-ci.org/Slashgear/spring-example-docker.svg?branch=master)](https://travis-ci.org/Slashgear/spring-example-docker)

## Install

```
git clone https://github.com/Slashgear/spring-example-docker
```

Open Java IDE (IntelliJ, NetBeans, Eclipse)


## Build

Use maven command:

```
mvn package
```

Or use maven plugin of your IDE for building project.

## Goal

File content : 

```
FROM frolvlad/alpine-oraclejdk8:slim
ADD target/spring-example-docker-0.0.1-SNAPSHOT.jar app.jar
RUN sh -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
```


Building Docker image:

```
docker build -t spring-app .
```

Run image:

```
docker run -d -p 8080:8080 spring-app
```