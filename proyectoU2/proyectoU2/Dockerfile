# Utiliza una imagen base de Java
FROM openjdk:17-jre-alpine

# Establece el directorio de trabajo en /app
COPY  target/proyectoU2-0.0.1-SNAPSHOT.jar java-app.jar
# Copia el jar de tu aplicación Spring Boot al contenedor
ENTRYPOINT ["java","-jar","/java-app.jar"]
