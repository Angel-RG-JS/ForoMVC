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

---

## Español
El ForoMVC Alura es una aplicación web construida con el patrón Modelo-Vista-Controlador (MVC) usando Spring Boot y Maven. Es la respuesta a un reto de desarrollo de backend propuesto por la plataforma Alura de un foro para interacción social.

---

### 🛠️ Tecnologías Utilizadas

- [MySql](https://www.mysql.com/)
- [Java](https://www.java.com/en/)

- [Spring Security](https://start.spring.io/)
- [Token JWT](https://jwt.io/)

---

### 📦 Estructura del Proyecto

```plaintext
src/
├── main/
│   ├── java/com/foro_inicial/
│   │   ├── controller/                 # Controladores web
│   │   ├── infra/                      # Entidades JPA
│   │   │   ├── errores/                # Manejo de errores y excepciones
│   │   │   ├── security/               # Seguridad manejada con BCrypt y JWT
│   │   │   └── springdoc               # Documentación generada con Springdoc
│   │   ├── modelo/                     # Lógica de negocio
│   │   │   ├── curso/                  # Modelo del objeto curso
│   │   │   ├── respuesta/              # Modelo de las respuestas del foro
│   │   │   ├── topico/                 # Modelo de los temas a tratar
│   │   │   │   └── validaciones/       # Establece los requisitos para subirc
│   │   │   └── usuario/                # Establece credenciales y perfil de usuario
│   │   └── repository/                 # Interfaces de acceso a datos
│   └── resources/
│       ├── db.migration/               # Query sql para establecer DB
│       ├── application.properties      # Configuración
│       ├── application-prod.yml        # Configuración para producción
│       └── application-test.properties # Configuración para pruebas
└── test/                   # Pruebas unitarias


