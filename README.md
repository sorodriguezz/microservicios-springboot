
<p align="center">
  <a href="https://spring.io/projects/spring-boot/" target="blank"><img src="https://user-images.githubusercontent.com/33158051/103466606-760a4000-4d14-11eb-9941-2f3d00371471.png" width="500" alt="SpringBoot Logo" /></a>
</p>

# Intensivo de herramientas Spring

## Implemtaciones
- Spring Boot
- MongoDB
- MySQL
- Discovery Server
- Config Server
- Secrets en Vault (HashiCrop Vault)
- Actuator @RefreshScope
- Spring Cloud Config
- Spring Cloud Bus
- RabbitMQ
- Spring Reactive Gateway

## Descripción de microservicios
- **product-microservice**: Servicio que se conecta a MongoDB, inserta un producto y trae una lista de productos. Además tiene Eureka Client.
- **booking-microservice**: Servicio que se conecta a MySql. Además tiene Eureka Client.
- **discovery-service**: Servicio que funciona con Spring Cloud Eureka, el cual es el servidor. Detalla los servicios disponibles.
- **config-server**: Se comunica con los archivos de ```service-configuration``` para traer propiedades de GitHub.
- **api-gateway**: Servicio que se encarga de orquestar las consultas, toma los endpoints desde Eureka Server y envia la petición donde corresponde.

## Uso de HashiCorp Vault
Para usar esta herramientas necesitamos descargar el software desde: [HashiCorp Vault](https://developer.hashicorp.com/vault/install?product_intent=vault)

- Posterior a esto, descomprimimos en una ruta que no debamos moverlo (En C: como recomendación).
- Abrir variables de entorno del sistema y en ```Path``` de variables del sistema agregar la ruta donde se encuentra nuestro ```.exe```.
- Abrimos una consolta donde este el ```.exe``` del archivo descomprimido.
- Ejecutamos ```vault```, si arroja la informacion de Vault esta perfecto.
- Luego vamos al sitio de [Spring Vault Config](https://spring.io/guides/gs/vault-config/).
- Dentro de la consola anteriormente abierta ejecutamos (Si no especificamos un token id asignará uno por defecto):
```=bash
$ vault server --dev --dev-root-token-id="00000000-0000-0000-0000-000000000000"
```
- Volvemos abrir las variables de entorno y agregamos una nueva variable que se llame ```VAULT_ADDR``` con el valor del servidor levantado por vault, por defecto es ```http://127.0.0.1:8200```
- Luego visitamos el sitio ```http://127.0.0.1:8200``` y se nos abrira un login para vault, en este caso nuestro token id para entrar es ```00000000-0000-0000-0000-000000000000``` que es con el cual arracamos el servidor.
- Para agregar un nuevo archivo de secretos a nuestro vault agregamos con el comando:
```=bash
$ vault kv put secret/booking-microservice @booking-microservice.json
```
El ```@booking-microservice.json``` es nuestro archivo de configuraciones.

## RabbitMQ
Para instalar Rabbit en local, usaremos docker. Donde usamos el comando:
```=bash
$ docker run -it --rm --name rabbitmq -p 5672:5672 -p 15672:15672 rabbitmq:3.12-management
```
