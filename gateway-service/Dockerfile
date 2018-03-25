FROM java:8-jre-alpine
MAINTAINER igor_usachev
# ENV JAVA_HOME /usr/lib/jvm/java-8-openjdk-amd64

COPY target/gateway-service-1.0-SNAPSHOT.jar /home/gateway-service-1.0-SNAPSHOT.jar

CMD ["java","-jar","/home/gateway-service-1.0-SNAPSHOT.jar"]

