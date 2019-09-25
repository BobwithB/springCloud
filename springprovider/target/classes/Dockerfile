# Pull base image  
FROM  java:8  
  

VOLUME /tmp

# 添加 
ADD spring-provider-1.0-SNAPSHOT.jar app.jar
RUN bash -c 'touch /app.jar'
  

# Define default command. 
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]

#docker run --name demo8 -e server.port=1234 -p 1234:1234 micro-provider:v1.0&