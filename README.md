# Proyecto Canchas - Sistema de Microservicios

Actividad práctica: Nuevo Microservicio de Usuarios  
Duoc UC - Escuela de Informática y Telecomunicaciones

---

## Descripción

Sistema de gestión de canchas y reservas desarrollado con arquitectura de microservicios en Spring Boot. Incluye un API Gateway que centraliza el acceso a todos los servicios.

---

## Microservicios

| Servicio | Puerto | Descripción |
|---|---|---|
| `apireservas` (API Gateway) | 9090 | Punto de entrada único, enruta las peticiones |
| `serviciocanchas` | 8081 | Gestión de canchas deportivas |
| `servicioreservas` | 8082 | Gestión de reservas |
| `serviciousuarios_corregido` | 8083 | Gestión de usuarios (**nuevo**) |

---

## Microservicio de Usuarios (nuevo)

Creado desde cero como parte de la actividad práctica.

### Entidad Usuario
- `id` — Long, auto incrementable
- `nombre` — String
- `email` — String
- `telefono` — String

### Endpoints disponibles

| Método | Ruta | Descripción |
|---|---|---|
| GET | `/api/users` | Listar todos los usuarios |
| GET | `/api/users/{id}` | Obtener usuario por ID |
| POST | `/api/users` | Crear nuevo usuario |
| DELETE | `/api/users/{id}` | Eliminar usuario |

### Ejemplo de uso (POST)
```json
{
  "nombre": "Jean Flores",
  "email": "jean@correo.com",
  "telefono": "912345678"
}
```

---

## Tecnologías

- Java 21
- Spring Boot 4.0.x
- Spring Cloud Gateway (MVC)
- Spring Data JPA
- MySQL
- Lombok
- Maven

---

## Base de datos

Cada microservicio usa su propia base de datos MySQL:

| Servicio | Base de datos |
|---|---|
| serviciocanchas | `basecancha` |
| servicioreservas | `basereserva` |
| serviciousuarios | `baseusuario` |

---

## Cómo ejecutar

1. Iniciar MySQL y crear las bases de datos requeridas
2. Ejecutar los microservicios en este orden:
   - `serviciocanchas` (puerto 8081)
   - `servicioreservas` (puerto 8082)
   - `serviciousuarios_corregido` (puerto 8083)
   - `apireservas` — API Gateway (puerto 9090)
3. Todas las peticiones se pueden hacer a través del Gateway en `http://localhost:9090`
