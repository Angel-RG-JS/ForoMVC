# 🧵 ForoMVC

> 🇺🇸 English version follows.
> 🇲🇽 Este README está disponible en español más abajo.  

## English

The Forum MVC Alura is a backend built using the Model-View-Controller (MVC) pattern with Spring Boot and Maven. It was developed as a backend challenge proposed by the Alura platform, simulating a social interaction forum with secure user authentication and modular domain logic.

---

### 🛠️ Technologíes Used

- [MySql](https://www.mysql.com/)
- [Java](https://www.java.com/en/)

- [Spring Security](https://start.spring.io/)
- [Token JWT](https://jwt.io/)
- [Springdoc](https://springdoc.org/)

---

### 📦 Project Structure

```plaintext
src/
├── main/
│   ├── java/com/foro_inicial/
│   │   ├── controller/                 # Web controllers (REST endpoints)
│   │   ├── infra/                      # Infrastructure layer
│   │   │   ├── errores/                # Custom error handling and exceptions
│   │   │   ├── security/               # Security config (BCrypt, JWT)
│   │   │   └── springdoc/             # OpenAPI documentation setup
│   │   ├── modelo/                     # Domain logic
│   │   │   ├── curso/                  # Course entity and logic
│   │   │   ├── respuesta/              # Forum reply model
│   │   │   ├── topico/                 # Forum topic model
│   │   │   │   └── validaciones/       # Topic validation rules
│   │   │   └── usuario/                # User credentials and profile
│   │   └── repository/                 # Data access interfaces (JPA repositories)
│   └── resources/
│       ├── db.migration/               # SQL scripts for DB initialization
│       ├── application.properties      # Default configuration
│       ├── application-prod.yml        # Production environment config
│       └── application-test.properties # Test environment config
└── test/                               # Unit and integration tests
```

---

## Español

El ForoMVC Alura es una aplicación web construida con el patrón Modelo-Vista-Controlador (MVC), utilizando Spring Boot y Maven. Fue desarrollada como respuesta a un reto de backend propuesto por la plataforma Alura, simulando un foro de interacción social con autenticación segura y lógica de dominio modular.

---

### 🛠️ Tecnologías Utilizadas

- [MySql](https://www.mysql.com/) — Base de datos relacional  
- [Java](https://www.java.com/en/) — Lenguaje principal  
- [Spring Security](https://start.spring.io/) — Autenticación y autorización  
- [Token JWT](https://jwt.io/) — Autenticación sin estado  
- [Springdoc](https://springdoc.org/) — Generación de documentación API

---

### 📦 Estructura del Proyecto

```plaintext
src/
├── main/
│   ├── java/com/foro_inicial/
│   │   ├── controller/                 # Controladores REST
│   │   ├── infra/                      # Capa de infraestructura
│   │   │   ├── errores/                # Manejo de errores y excepciones
│   │   │   ├── security/               # Configuración de seguridad (BCrypt, JWT)
│   │   │   └── springdoc/              # Configuración de documentación OpenAPI
│   │   ├── modelo/                     # Lógica de negocio
│   │   │   ├── curso/                  # Entidad y lógica de cursos
│   │   │   ├── respuesta/              # Modelo de respuestas del foro
│   │   │   ├── topico/                 # Modelo de temas del foro
│   │   │   │   └── validaciones/       # Reglas de validación para temas
│   │   │   └── usuario/                # Credenciales y perfil de usuario
│   │   └── repository/                 # Interfaces de acceso a datos (JPA)
│   └── resources/
│       ├── db.migration/               # Scripts SQL para inicializar la base de datos
│       ├── application.properties      # Configuración por defecto
│       ├── application-prod.yml        # Configuración para producción
│       └── application-test.properties # Configuración para pruebas
└── test/                               # Pruebas unitarias e integración


