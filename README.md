# api-logado-jwt
 
API para el logado en un sistema con Spring Security.
Utilizamos Spring Boot para arrancar el servicio.

## Configuración del servicio
Para configurar los parámetros del servidor hay que editar el archivo:
```application.properties```
Donde entre otro aspectos se configura el puerto y el contexto de la aplicación

## Inicio del servicio
Para arrancar el servicio solo hay que ejecutar el método _main_ de la clase:
```com.saga.demo.jwt.Application```

## Algoritmo de 
HS512 firma

## Probar el API
Los datos para realizar un logado correcto son:
- **usuario**: *admin*
- **contraseña**: *password*

Para realizar una prueba de logado en el servicio hay que realizar una del tipo:
```
curl --request POST \
  --url http://localhost:666/api/v1/login \
  --header 'Accept: */*' \
  --header 'Accept-Encoding: gzip, deflate' \
  --header 'Cache-Control: no-cache' \
  --header 'Connection: keep-alive' \
  --header 'Content-Type: application/json' \
  --header 'Host: localhost:666' \
  --header 'cache-control: no-cache' \
  --data '{"username":"admin","password":"password"}'
```
**NOTA**: para realizar esto se recomienda el uso de aplicaciones de testeo de APIs como por ejemplo *Postman*. 

##Personas
Existe un paquete de *persona* con la clases necesarias para el acceso y modificación de entidades Personas sobre una base de datos MySQL.
En esta base de datos ha de existir un esuqema llamado ```prototipo``` y un usuario con los permisos pertinentes para este esquema con los datos:
- **usuario**: prototipo
- **contraseña**: prototipo

Si no existe esta base de datos el sistema de logado funciona pero no tendríamos acceso a las llamas sobre las **personas**:

___
