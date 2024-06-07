# GESTOR DE VIAJES - MICROSERVICIOS (HOTELES/RESERVAS/VUELOS/FRONTEND)
Este repositorio contiene un conjunto de microservicios (4) desarrollados en Spring Boot para gestionar diferentes aspectos relacionados con viajes: hoteles, vuelos y reservas. Además, incluye un microservicio dedicado a proporcionar una interfaz de usuario intuitiva para interactuar con estos servicios. La aplicación utiliza una base de datos MySQL de la cual se adjuntan los scripts en el repositorio.

#### CARACTERÍSTICAS PRINCIPALES
* Arquitectura basada en microservicios
* Uso de una base de datos MySQL
* Microservio frontend que actúa como una interfaz de usuario para los usuarios finales, consumiendo las API REST proporcionadas por los otros microservicios

#### TECNOLOGÍAS UTILIZADAS
* **Spring Boot**: Infraestructura para microservicios eficiente.
* **Thymeleaf**: Motor de plantillas para vistas HTML.
* **Swagger**: Documentación y visualización de API RESTful.
* **JUnit:** Marco para pruebas unitarias en Java.
* **MockMvc:** Pruebas de integración para aplicaciones web Spring.
* **HTML y CSS:** Para la construcción de insterfaces web.


### Inicio Rápido
1. **Clonar el repositorio:**
   ```git clone https://github.com/xxx.git```
3. **Acceder al directorio del proyecto**
  ```cd xxx```

# Entidades

1. **Hotel**: Representa a un hotel junto a las propiedades del mismo.
2. **Vuelo**: Representa un vuelo específico con sus caraterísticas, tales como la fecha de salida.
3. **Reserva**: Representa una reserva con sus características, la cual debe ir asociada a una entidad Hotel y a una entidad vuelo


## **MICROSERVICIO HOTELES**
Este microservicio proporciona funcionalidades para la gestión de hoteles.

### FUNCIONALIDADES
#### 1. Consulta de todos los hoteles
Con esta función podemos obtener una lista completa de todos los hoteles disponibles en nuestra base de datos.
#### 2. Búsqueda de un hotel por nombre
Con esta función podemos obtener toda la información sobre un hotel en específico que busquemos por su nombre

### ENDPOINTS
###### Puerto 7000
1. **Listar todos los hoteles**
   - **URL**: `/hoteles`
   - **Método**: `GET`

2. **Buscar hotel por nombre**
   - **URL**: `/hoteles/{nombre}`
   - **Método**: `GET`

## **MICROSERVICIO VUELOS**
###### Puerto 8000
Este microservicio proporciona funcionalidades para la gestión de vuelos

### FUNCIONALIDADES
#### 1. Consulta de vuelos con plazas disponibles
Con esta función podemos obtener la lista de vuelos disponibles según las plazas que queramos reservas.
#### 2. Actualizar datos de vuelo
Con esta función podremos actualizar las plazas disponibles de un vuelo en función del número de plazas que vayamos a reservar pasadas por parámetro

### ENDPOINTS

1. **Consultar vuelos con plazas disponibles**
   - **URL**: `/vuelos/disponibilidad/{numPlazasAReservar}`
   - **Método**: `GET`

2. **Actualizar datos de un vuelo**
   - **URL**: `/vuelos/actuzalizar?x=id&y=plazasAReservar`
   - **Método**: `PUT`


## **MICROSERVICIO RESERVAS**
Este microservicio proporciona funcionalidades para la gestión de reservas de hoteles y vuelos

### FUNCIONALIDADES
#### 1. Registro de una nueva reserva
Con esta función podremos registrar una nueva reserva, añadiendo a mayores el número de personas que se incluyen en la reserva
#### 2. Obtener reservas según hotel
Con esta función podremos obtener todas las reservas asociadas a un hotel

### ENDPOINTS
###### Puerto 6000

1. **Registrar una nueva reserva en el sistema**
   - **URL**: `/reservas/{numPersonas}`
   - **Método**: `POST`

2. **Buscar reservas asociadas al nombre de un hotel**
   - **URL**: `/reservas/buscar?nombre=nombreHotel`
   - **Método**: `GET`

