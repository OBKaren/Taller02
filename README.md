# 🚀 Proyecto de Automatización Web con Selenium, Java y Gradle

Este proyecto implementa pruebas automatizadas para la aplicación Todo.ly utilizando Selenium WebDriver con Java y Gradle como gestor de dependencias.

## 📋 Requisitos Previos

- Java JDK 17 o superior
- Gradle 8.0+
- Chrome/Firefox (según configuración)
- Conexión a internet

## 🛠️ Configuración

1. Clonar el repositorio:
   ```bash
   git clone [URL_DEL_REPOSITORIO]

## Estructura del proyecto

El proyecto sigue una estructura modular para facilitar la escalabilidad y el mantenimiento:

```text
Taller02/
├── gradle/ # Configuración de Gradle wrapper
├── .gradle/ # Cache de Gradle (generado automáticamente)
├── build/ # Archivos compilados (generado)
├── src/
│ ├── main/
│ │ ├── java/
│ │ │ ├── models/
│ │ │ │ └── User.java # Modelo de datos de usuario
│ │ │ ├── pages/
│ │ │ │ ├── BasePage.java # Clase base para Page Objects
│ │ │ │ ├── LoginPage.java # Página de inicio de sesión
│ │ │ │ ├── MainPage.java # Página principal
│ │ │ │ └── SignUpPage.java # Página de registro
│ │ │ └── utils/
│ │ │ ├── ConfigLoader.java # Cargador de configuración
│ │ │ ├── TestDataGenerator.java # Generador de datos de prueba
│ │ │ └── WebDriverFactory.java # Factory para WebDriver
│ │ └── resources/
│ │ ├── config.properties # Configuración de entorno
│ │ └── log4j2.xml # Configuración de logging
│ └── test/
│ ├── java/
│ │ └── SignUpTest.java # Pruebas de registro
│ └── resources/ # Recursos para tests
├── .gitignore # Archivos ignorados por Git
├── build.gradle # Configuración de dependencias
├── gradlew # Wrapper script Gradle (Unix)
├── gradlew.bat # Wrapper script Gradle (Windows)
├── settings.gradle # Configuración de proyecto Gradle
└── README.md # Documentación del proyecto

