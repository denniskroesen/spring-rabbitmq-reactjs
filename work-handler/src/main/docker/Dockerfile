FROM java:8
VOLUME /tmp
ADD work-handler-1.0-SNAPSHOT.jar app.jar
ENV SPRING_RABBITMQ_ADDRESSES="amqp://docker_rabbitmq_1:5672"
RUN bash -c 'touch /app.jar'
EXPOSE 8081
EXPOSE 5005
ENTRYPOINT ["java","-Xdebug", "-Xrunjdwp:transport=dt_socket,server=y,suspend=y,address=5005","-jar","/app.jar"]
