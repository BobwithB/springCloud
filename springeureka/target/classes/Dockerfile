# Pull base image  
FROM  java:8  
  

VOLUME /tmp

# 添加 
ADD spring-eureka-1.0-SNAPSHOT.jar app.jar
RUN bash -c 'touch /app.jar'
  

# Define default command. 
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]


# how to build?
#docker build -t micro-eureka:v1.0 .
# how to run?
#docker run --name demo1 -e server.port=1234 -p 1234:1234 micro-eureka:v1.0&
