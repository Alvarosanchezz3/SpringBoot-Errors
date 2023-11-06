# README del Proyecto de Manejo de Errores en Spring ⚠️

Este proyecto de muestra demuestra cómo manejar errores en una aplicación basada en el framework Spring. El proyecto incluye un controlador, servicios y excepciones personalizadas para mostrar cómo se pueden gestionar diferentes tipos de errores.

## Estructura del Proyecto 📄

El proyecto consta de varias partes, cada una con un propósito específico:

- **Controladores**: Se encargan de manejar las solicitudes HTTP y gestionar el flujo de la aplicación.

  - `AppController`: Controlador principal de la aplicación que maneja las solicitudes para mostrar la página de inicio (`/index`) y detalles de usuarios (`/ver/{id}`).

  - `ErrorHandlerController`: Controlador que maneja excepciones a nivel global en la aplicación y muestra páginas de error personalizadas para diferentes tipos de excepciones.

- **Modelos**: Definen las estructuras de datos utilizadas en la aplicación.

  - `Usuario`: Modelo de usuario que contiene información sobre los usuarios.

- **Servicios**: Proporcionan lógica de negocio y acceso a datos.

  - `UsuarioService`: Interfaz que define métodos para listar usuarios y buscar usuarios por ID.

  - `UsuarioServiceImpl`: Implementación con datos de muestra para `UsuarioService`. Gestiona una lista estática de usuarios.

- **Errores**: Contiene excepciones personalizadas utilizadas para manejar errores específicos.

  - `UsuarioNoEncontradoException`: Excepción personalizada lanzada cuando un usuario no se encuentra en la aplicación.

## Uso 🧐

Puedes utilizar este proyecto como ejemplo para aprender sobre el manejo de errores en aplicaciones Spring. Explora el código fuente y observa cómo se gestionan las excepciones y se proporciona información detallada sobre su funcionamiento en los comentarios.

