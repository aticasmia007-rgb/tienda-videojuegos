# Descripción breve del proyecto
Aplicación web desarrollada con Spring Boot, para la gestión de una tienda de videojuegos. 
En ella se puede listar los videojuegos y clientes de la tienda recogidos en la base de datos,
al igual que se puede añadir nuevos juegos/clientes a la misma.


# Requisitos previos para ejecutar el proyecto.
[] **Java 21** 
[] **MySQL Server** Versión 8.0 o superior.
[] **Maven** 
[] **Spring Boot 4.0.6** en el `pom.xml`.

# Pasos para ejecutarlo 

1.Clonar y Preparar
- Descarga el código desde tu repositorio de GitHub.
- Abre tu IDE (Eclipse o STS) e importa el proyecto como Existing Maven Project.

2. Preparar la Base de Datos

- Abre tu terminal de MySQL o Workbench.
- Ejecuta el script schema.sql (ubicado en la raíz del proyecto).


3. Configurar Credenciales

- Abre src/main/resources/application.properties.
- Verifica que la conexión sea:

Properties (sin tener en cuenta el despliegue en Railway)
spring.datasource.url=jdbc:mysql://localhost:3306/tiendavideojuegos
spring.datasource.username= tu_usuario
spring.datasource.password= tu_contraseña

*Si fuese en Railway...*

server.port=${PORT:8080}
spring.datasource.url=jdbc:${MYSQL_URL}
spring.datasource.username=${MYSQLUSER}
spring.datasource.password=${MYSQLPASSWORD}
spring.datasource.username= ${MYSQLUSER}
spring.datasource.password= ${MYSQLPASSWORD}

4. Lanzar la Aplicación

- Opción A (IDE): Click derecho en el proyecto → Run As → Spring Boot App.

- Opción B (Terminal): Ejecuta el comando mvn spring-boot:run.

Acceso Web

- Abre tu navegador en: http://localhost:8080/inicio


# Capturas de pantalla de las páginas principales

---- GET /inicio 
<img width="1858" height="1032" alt="opera_CT5FGGI97e" src="https://github.com/user-attachments/assets/a9146156-0aa5-4b78-b929-11e4a065722c" />

---- GET /listadoClientes
<img width="1868" height="1033" alt="w2cRhVM4BI" src="https://github.com/user-attachments/assets/d752a000-f957-4282-a6f7-585e8a213bc3" />

---- GET /listadoJuegos 
<img width="1869" height="1034" alt="mohvMF8bwL" src="https://github.com/user-attachments/assets/88e15056-078c-472d-8bb3-5b1956af348f" />

---- GET/POST /altaClientes 
<img width="1868" height="1034" alt="opera_F8eTVlkyvR" src="https://github.com/user-attachments/assets/d689f7ab-b82e-4c0e-b906-b1e91705bba5" />

---- GET/POST /altaJuegos 
<img width="1868" height="1031" alt="Kf4XmWU0Pv" src="https://github.com/user-attachments/assets/1406b60a-aeaa-4377-afcb-70e9161d4a01" />

---- ERROR PERSONALIZADO
<img width="1869" height="1032" alt="opera_6aIcADPT7M" src="https://github.com/user-attachments/assets/003c35c9-a98e-43a3-a423-21ff1b766c45" />
