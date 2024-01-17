FROM openjdk:17
WORKDIR /App
VOLUME /tmp
COPY /target/gate-0.0.1-SNAPSHOT.jar .


ENTRYPOINT ["java", "-jar" , "gate-0.0.1-SNAPSHOT.jar"]