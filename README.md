Aquí tienes la estructura en formato Markdown lista para el `README.md` de este código de **Simulación de Jerarquía de Empleados y Cálculo Salarial (Herencia, Polimorfismo y Sobreescritura en Java)**, manteniendo el enfoque exclusivo de **Programación Orientada a Objetos en memoria** (sin bases de datos):

---

# 👥 Simulación de Jerarquía de Empleados y Salarios (Herencia y Polimorfismo en Java)

Este proyecto es una aplicación en Java que modela una jerarquía de personal dentro de una organización, permitiendo gestionar diferentes modalidades de contratación (empleados asalariados y empleados por hora) mediante el uso de herencia y polimorfismo. Pone en práctica conceptos fundamentales de la **Programación Orientada a Objetos (POO)** como la **generalización de atributos con `protected**`, la reutilización de constructores mediante `super`, la sobrescritura de métodos (`@Override`) y el cálculo dinámico de salarios en memoria.

---

## 🧩 Clases y Estructura del Sistema

El diseño del software se organiza a través de una clase base abstracta/general y sus respectivas especializaciones, acompañadas por un punto de ejecución:

* **`Empleado`**: Clase base que centraliza los atributos y comportamientos comunes de todo el personal de la empresa.
* **Atributos protegidos (`protected`)**: `nombre`, `dni` y `legajo`, permitiendo que las clases hijas accedan directamente a su identidad básica.
* **Constructor**: Inicializa los datos comunes del empleado.
* **Métodos operativos**:
* `calcularSalario()`: Método base que retorna un valor predeterminado, diseñado para ser sobrescrito por las clases derivadas.
* `mostrarInformacion()`: Imprime por consola los datos personales y de identificación del empleado.




* **`EmpleadoAsalariado`**: Extiende de `Empleado` para modelar a un trabajador con remuneración fija mensual.
* **Atributo privado (`private`)**: `sueldoMensual`.
* **Constructor**: Invoca a `super(...)` para inicializar los datos heredados y configura el sueldo mensual.
* **Sobrescritura (`@Override`)**: Implementa `calcularSalario()` retornando directamente el sueldo fijo establecido.


* **`EmpleadoPorHora`**: Extiende de `Empleado` para modelar a un trabajador cuya remuneración depende de las horas laboradas y una tarifa horaria.
* **Atributos privados (`private`)**: `tarifaPorHora` y `horasTrabajadas`.
* **Constructor**: Utiliza `super(...)` y asigna la tarifa y las horas registradas.
* **Sobrescritura (`@Override`)**: Implementa `calcularSalario()` multiplicando la tarifa por las horas trabajadas.


* **`Main`**: Punto de entrada del programa. Instancia un empleado asalariado y un empleado por hora con datos específicos, invoca los métodos de visualización de información y calcula el salario correspondiente para cada caso, imprimiendo los resultados por consola.

---

## ⚙️ Reglas de Negocio y Control de Validación

1. **Reutilización de Código por Herencia:** La lógica de identificación común (`nombre`, `dni`, `legajo`) se centraliza en la superclase `Empleado`, evitando duplicación de código en las subclases.
2. **Polimorfismo en el Cálculo Salarial:** Cada tipo de empleado implementa su propia regla de negocio para calcular las remuneraciones (sueldo fijo vs. producto de horas por tarifa), permitiendo un diseño extensible.
3. **Encapsulamiento y Ocultamiento:** Los detalles específicos de pago (`sueldoMensual`, `tarifaPorHora`) se protegen en cada subclase mediante modificadores privados, manteniendo la cohesión del modelo.

---

## 💻 Salida por Consola

Al ejecutar la clase `Main`, el programa genera el siguiente resultado:

```text
=== EMPLEADO ASALARIADO ===
Nombre: Juan
DNI: 40111222
Legajo: 1001
Salario: $850000.0

=== EMPLEADO POR HORA ===
Nombre: Pedro
DNI: 42123456
Legajo: 1002
Salario: $600000.0

```

---

## 🚀 Conceptos de Programación Aplicados

* **Herencia de Clases:** Creación de una jerarquía limpia donde las clases derivadas (`EmpleadoAsalariado` y `EmpleadoPorHora`) heredan atributos y comportamientos de `Empleado`.
* **Sobrescritura de Métodos (`@Override`):** Adaptación del comportamiento del método `calcularSalario()` según las necesidades particulares de cada modalidad de contratación.
* **Diseño Extensible y Modular:** Separación clara entre la estructura general del personal y la ejecución de casos de prueba específicos en el cliente (`Main`).
