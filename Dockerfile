FROM openjdk:17
EXPOSE 8096
ADD target/order-app.jar order-app.jar
ENTRYPOINT ["java","-jar","/order-app.jar"]