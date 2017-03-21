FROM java:8
VOLUME /tmp
ADD work-handler-1.0-SNAPSHOT.jar app.jar
ENV SPRING_RABBITMQ_ADDRESSES="amqp://docker_rabbitmq_1:5672"
RUN bash -c 'touch /app.jar'
EXPOSE 8081
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
