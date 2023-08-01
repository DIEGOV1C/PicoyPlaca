# PicoyPlaca

Este documento proporciona instrucciones sobre cómo ejecutar el Frontend en Angular y el Backend en Spring Boot.

Requisitos previos

Antes de comenzar, asegúrate de tener instalado lo siguiente:

1. Node.js y npm (Node Package Manager): Visita https://nodejs.org/ y sigue las instrucciones para instalar Node.js en tu sistema.

2. Angular CLI: Abre una terminal y ejecuta el siguiente comando para instalar Angular CLI globalmente:

npm install -g @angular/cli

3. Java Development Kit (JDK): Asegúrate de tener JDK 8 o superior instalado en tu máquina. Puedes obtenerlo en el sitio web de Oracle o utilizar un distribuidor como OpenJDK.

4. Spring Boot CLI (opcional): Si deseas usar la línea de comandos de Spring Boot, instálala siguiendo las instrucciones en https://docs.spring.io/spring-boot/docs/current/reference/html/getting-started.html#getting-started-installing-the-cli.

Ejecutar el Backend en Spring Boot

Sigue los siguientes pasos para ejecutar el backend:

1. Clona este repositorio: Si aún no lo has hecho, clona este repositorio a tu máquina local utilizando Git:

git clone https://github.com/tu-usuario/tu-repositorio.git

2. Navega al directorio del backend: Accede a la carpeta del backend:

cd tu-repositorio/ejercicio

3. Compila y ejecuta la aplicación: Utiliza Spring Boot CLI o una herramienta de construcción (Maven) para compilar y ejecutar la aplicación

mvn spring-boot:run

4. El backend debería estar ahora en funcionamiento en http://localhost:8080. Puedes probar la API accediendo a esta URL desde un cliente HTTP, como Postman.


Ejecutar el Frontend en Angular

Sigue los siguientes pasos para ejecutar el frontend:

1. Navega al directorio del frontend: Abre una nueva terminal y accede a la carpeta del frontend:

cd tu-repositorio/pico-placa-front

2. Instala las dependencias: Ejecuta el siguiente comando para instalar todas las dependencias necesarias para el proyecto de Angular:

npm install

3. Compila y ejecuta la aplicación: Utiliza Angular CLI para compilar y ejecutar el frontend. Ejecuta el siguiente comando:

ng serve

4. El frontend debería estar ahora en funcionamiento en http://localhost:4200. Abre tu navegador y accede a esa URL para interactuar con la aplicación.

Listo!

