FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 8085
ADD icomteq.erp.company.administrationt-0.0.1-SNAPSHOT.jar icomteq.erp.company.administration.jar
ENV JAVA_OPTS=""
ENTRYPOINT ["java", "-jar", "icomteq.erp.company.administration.jar"]