<p align="center">
  <a href="https://spring.io/projects/spring-boot/" target="blank"><img src="https://user-images.githubusercontent.com/33158051/103925017-e7673b80-50e4-11eb-9379-ceb82e3f382c.png" width="200" alt="SpringBoot Logo" /></a>
</p>

# Microservicio con Spring Cloud Reactive Gateway

## Descripción
Microservicio que sirve como gateway entre el cliente y nuestros microservicios. Donde se conecta a Eureka Server.

## Versiones
- Spring Boot 3.2.1
- Java v17
- Maven v4
- Spring Reactive Gateway
- NettyWebServer
- Spring Cloud Starter Security 2.2.5
- Spring Boot Starter OAuth2 Client 3.2.1

## URL
- GET: http://localhost:8080/api/products
- GET: http://localhost:8080/api/categories

En estas rutas se derivan al microservicio que corresponde.