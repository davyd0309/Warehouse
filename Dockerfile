FROM 11.0.2-jdk-windowsservercore-1809
ADD target/Warehouse-0.0.1-SNAPSHOT.jar .
EXPOSE 8082
CMD java -jar Warehouse-0.0.1-SNAPSHOT.jar