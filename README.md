# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.0.3/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.0.3/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.0.3/reference/htmlsingle/#web)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/3.0.3/reference/htmlsingle/#data.sql.jpa-and-spring-data)
* [Spring Security](https://docs.spring.io/spring-boot/docs/3.0.3/reference/htmlsingle/#web.security)
* [Flyway Migration](https://docs.spring.io/spring-boot/docs/3.0.3/reference/htmlsingle/#howto.data-initialization.migration-tool.flyway)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Securing a Web Application](https://spring.io/guides/gs/securing-web/)
* [Spring Boot and OAuth2](https://spring.io/guides/tutorials/spring-boot-oauth2/)
* [Authenticating a User with LDAP](https://spring.io/guides/gs/authenticating-ldap/)

### Env Vars
- MS_PORT = Any available port.
- POSTGRES_DATABASE_URL = database adress. For local environment use 'localhost'
- POSTGRES_DATABASE_CUSTOM_PORT = For local environment use '5432'
- POSTGRES_DATABASE_NAME = financeManagerForAllDB. Check the docker-compose file
- POSTGRES_DATABASE_SSL = For local environment use 'false'
- POSTGRES_DATABASE_USERNAME = admin. Check the docker-compose file
- POSTGRES_DATABASE_PASSWORD = fmfadb2023. Check the docker-compose file

### Containers
- PostgreSQL: dockerComposeFiles/database/docker-compose.yml
- Jenkins: dockerComposeFiles/jenkins/docker-compose.yml
  - Guide: https://www.jenkins.io/doc/book/installing/docker/