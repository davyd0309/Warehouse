FROM 11.0.3-jdk-stretch
ADD target/Warehouse-0.0.1-SNAPSHOT.jar .
EXPOSE 8082
CMD java -jar Warehouse-0.0.1-SNAPSHOT.jar