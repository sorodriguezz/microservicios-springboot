
<p align="center">
  <a href="https://spring.io/projects/spring-boot/" target="blank"><img src="https://user-images.githubusercontent.com/33158051/103466606-760a4000-4d14-11eb-9941-2f3d00371471.png" width="500" alt="SpringBoot Logo" /></a>
</p>

# Descripción de microservicios
- product-microservice: Servicio que se conecta a MongoDB, inserta un producto y trae una lista de productos. Además tiene Eureka Client.
- booking-microservice: Servicio que se conecta a MySql. Además tiene Eureka Client.
- discovery-service: Servicio que funciona con Spring Cloud Eureka, el cual es el servidor. Detalla los servicios disponibles.
- config-server: Se comunica con los archivos de ```service-configuration``` para traer propiedades de GitHub.
