FROM openjdk:17-jdk
COPY ./target/*.jar DoBuy.jar
RUN sh -c 'touch DoBuy.jar'
ENTRYPOINT ["java","-jar","DoBuy.jar"]