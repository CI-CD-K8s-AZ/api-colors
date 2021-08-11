FROM openjdk:11

COPY ./target/colors-0.0.1.jar /usr/
WORKDIR /usr/

EXPOSE 8080

CMD ["java", "-jar", "colors-0.0.1.jar"]