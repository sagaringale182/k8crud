FROM openjdk:17
EXPOSE 8080
ADD target/k8crud.jar k8crud.jar
ENTRYPOINT ["java","-jar","/k8crud.jar"]