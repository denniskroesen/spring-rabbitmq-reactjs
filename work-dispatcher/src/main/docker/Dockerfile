FROM java:8
VOLUME /tmp
ADD work-dispatcher-1.0-SNAPSHOT.jar app.jar
ENV SPRING_RABBITMQ_ADDRESSES="amqp://docker_rabbitmq_1:5672"
RUN bash -c 'touch /app.jar'
EXPOSE 8080
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom -Xdebug -Xrunjdwp:transport=dt_socket,server=y,suspend=y,address=5005","-jar","/app.jar"]
