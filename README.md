# 🌡️ Ejercicio — Termómetro IoT

---

## 📝 Descripción

El sistema implementa la clase TermometroIoT para registrar las lecturas de un sensor de temperatura expresadas en grados Celsius, calculando de manera dinámica su equivalente en grados Fahrenheit para su monitorización.

---

## 🚀 Funcionalidades e Implementación

### 📦 Clase TermometroIoT

* **Atributos:**
* **temperaturaCelsius** (private double): Valor de la temperatura registrada por el dispositivo en grados Celsius.


* **Métodos Implementados:**
* **Constructor TermometroIoT:** Inicializa el sensor registrando el valor inicial de la temperatura en Celsius.
* **obtenerFahrenheit():** Convierte y retorna el valor de la temperatura de grados Celsius a Fahrenheit utilizando la fórmula de conversión correspondiente.
* **mostrarDetalle():** Imprime en consola la lectura registrada en grados Celsius y su equivalente calculado en grados Fahrenheit.



---

## 💻 Programa Principal (main)

El flujo principal ejecuta la siguiente simulación de lectura:

1. Instancia el sensor con una lectura inicial de 20 °C.
2. Invoca el cálculo de conversión de unidades térmicas.
3. Muestra en pantalla el desglose con la temperatura en Celsius y en Fahrenheit resultantes.
