# Universidad Politecnica Salesiana
## PRACTICA: LISTAS ENLAZADAS

Una lista enlazada es una estructura de datos dinámica compuesta por nodos, donde cada nodo contiene un valor y una referencia al siguiente, lo que permite insertar o eliminar elementos fácilmente sin necesidad de reorganizar toda la estructura, a diferencia de los arreglos tradicionales que requieren espacio contiguo en memoria.

## 👨‍💻 Autores

- Thalia Sagbay  
- Steve Brito

## Mater

## 🛠️ Tecnologías utilizadas

- Java 17+
- Programación Genérica (`<T, U>`)
- Estructuras de Datos: Lista Enlazada (`LinkedList`)


## 🧩 Estructura del proyecto

src/ ├── App.java // Clase principal ├── controller/ │ ├── MenuController.java // Maneja el menú y operaciones │ └── ContactManager.java // Controla la lógica de contactos ├── models/ │ ├── Contact.java // Modelo del contacto (nombre y teléfono) │ ├── Node.java // Nodo de la lista enlazada │ └── LinkedListGeneric.java // Lista enlazada genérica └── view/ └── ConsoleView.java // Entrada/salida por consola


## 📋 Funcionalidades

- Agregar contacto con nombre y teléfono.
- Buscar contacto por nombre.
- Eliminar contacto por nombre.
- Imprimir la lista de contactos.
- Menú de usuario con navegación interactiva en consola.

## ▶️ Ejecución

Compila y ejecuta desde la línea de comandos o tu entorno Java favorito:

```bash
javac App.java
java App
