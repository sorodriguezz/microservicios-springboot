<p align="center">
  <a href="https://spring.io/projects/spring-boot/" target="blank"><img src="https://user-images.githubusercontent.com/33158051/103466606-760a4000-4d14-11eb-9941-2f3d00371471.png" width="500" alt="SpringBoot Logo" /></a>
</p>

# Microservicio con Spring Boot a MongoDB

## Descripción
Microservicio que sirve conectar con MongoDB para poder insertar y listar registros.

## Versiones
- Spring Boot 3.2.1
- Java v17
- Maven v4
- Netflix Eureka Client 4.1.0
- Lombok
- Spring Cloud Config Client 4.1.0
- Spring Cloud Starter Bootstrap 4.1.0
- Spring Boot Starter Actuator 3.2.1

## URL
- GET: http://localhost:8080/api/products
- POST: http://localhost:8080/api/products
- POST: http://localhost:54306/actuator/refresh (Actualiza properties)
- GET: http://localhost:54306/api/categories/test-prop