FROM openjdk:19
EXPOSE 8090
MAINTAINER Victor Gramolini <victorluiz_soares@yahoo.com.br>

ENTRYPOINT ["java", "-jar", "finance-manager-for-all-backend.jar"]

# Add the service itself
ARG JAR_FILE
ADD target/${JAR_FILE} /finance-manager-for-all-backend.jar