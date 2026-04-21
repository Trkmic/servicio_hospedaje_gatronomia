# 🏨 Sistema de Gestión de Hospedaje y Gastronomía (Java OOP)

### 📋 Descripción
Este proyecto es una aplicación de consola desarrollada en **Java** diseñada para gestionar servicios en el sector turístico. El sistema utiliza principios avanzados de **Programación Orientada a Objetos** para administrar de manera eficiente dos tipos de servicios principales: hospedaje en cabañas y servicios gastronómicos.

La aplicación permite calcular costos finales aplicando reglas de negocio complejas, como descuentos por días específicos o promociones por temporada.

---

### ✨ Características Principales
* **Modelo Jerárquico:** Implementación de una arquitectura de clases basada en herencia, con una clase abstracta base (`Servicio`) y especializaciones (`Hospedaje` y `Gastronomia`).
* **Reglas de Negocio Automatizadas:**
    * **Gastronomía:** Cálculo de precios basado en el día de la semana (descuentos especiales).
    * **Hospedaje:** Lógica diferenciada para temporada alta/baja y aplicación de descuentos por estadías prolongadas.
* **Sistema de Búsqueda y Filtrado:** Capacidad para filtrar servicios por tipo (solo hospedajes o solo gastronomía) y por estado (habilitados/deshabilitados).
* **Validaciones Robustas:** Manejo de excepciones personalizadas para asegurar que los datos ingresados (como códigos de servicio o días de la semana) sean correctos.
* **Persistencia en Memoria:** Gestión de una lista maestra de servicios mediante la clase `Sistema`.

---

### 🛠️ Tecnologías Utilizadas
* **Lenguaje:** Java (JDK 17 o superior)
* **Paradigma:** Programación Orientada a Objetos (Herencia, Polimorfismo, Encapsulamiento)
* **Herramientas:** Estructuras de datos (`ArrayList`), Manejo de Excepciones.

---

### 📂 Estructura del Proyecto
* **`src/Model/`**:
    * `Servicio.java`: Clase abstracta que define la estructura base y el método obligatorio `calcularPrecioFinal()`.
    * `Gastronomia.java`: Subclase para servicios de comida con lógica de descuentos semanales.
    * `Hospedaje.java`: Subclase para alojamiento con gestión de temporadas.
    * `Sistema.java`: Clase controladora que gestiona la lista de servicios y la lógica de búsqueda.
* **`src/Test/`**:
    * `Main.java`: Clase principal con casos de prueba para verificar el correcto funcionamiento del sistema y sus cálculos.

---

### 🚀 Cómo Ejecutar
1. Clona este repositorio.
2. Abre el proyecto en tu IDE favorito (IntelliJ, Eclipse o VS Code).
3. Localiza el archivo `Main.java` en la carpeta `src/Test/`.
4. Ejecuta el archivo para ver los resultados de las pruebas de cálculo en la consola.

---

### 💡 Conceptos Técnicos Aplicados
* **Polimorfismo:** Uso de una única interfaz de método (`calcularPrecioFinal`) que se comporta de manera distinta según el tipo de objeto.
* **Abstracción:** Definición de contratos claros en la clase base que deben cumplir todas las subclases.
* **Clean Code:** Organización de responsabilidades separando la lógica del modelo de los casos de prueba.
