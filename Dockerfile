FROM openjdk:11
MAINTAINER alexchaos
COPY build\libs\blizzardarmory-0.0.1-SNAPSHOT.jar blizzardarmory-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/blizzardarmory-0.0.1-SNAPSHOT.jar"]