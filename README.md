# Conversor de Monedas

Este proyecto es un conversor de monedas que utiliza una API de tasas de cambio para obtener las tasas de conversión actuales. Está implementado en Java y utiliza la biblioteca Gson para analizar las respuestas JSON de la API.

## Requisitos

- Java 11 o superior
- Maven

## Instalación

1. Clona el repositorio:
    ```sh
    git clone https://github.com/tu-usuario/conversor-monedas.git
    ```
2. Navega al directorio del proyecto:
    ```sh
    cd conversor-monedas
    ```
3. Compila el proyecto usando Maven:
    ```sh
    mvn clean install
    ```

## Uso

1. Ejecuta la aplicación:
    ```sh
    mvn exec:java -Dexec.mainClass="org.CoversorMoneda.CurrencyConverter"
    ```
2. Sigue las instrucciones en la consola para convertir entre diferentes monedas.

## Estructura del Proyecto

- `src/main/java/org/CoversorMoneda/ExchangeRateService.java`: Clase que maneja las solicitudes HTTP a la API de tasas de cambio y analiza las respuestas JSON.
- `src/main/java/org/CoversorMoneda/ExchangeRateResponse.java`: Clase que representa la respuesta de la API.
- `src/main/java/org/CoversorMoneda/Rates.java`: Clase que representa las tasas de conversión.
- `src/main/java/org/CoversorMoneda/CurrencyConverter.java`: Clase principal que proporciona una interfaz de consola para convertir monedas.

## Ejemplo de Código

```java
public static double convert(double amount, String fromCurrency, String toCurrency) {
    double conversionRate = getConversionRate(fromCurrency, toCurrency); // Obtener tasa de conversión
    return amount * conversionRate;
}
