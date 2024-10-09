package org.CoversorMoneda;

import java.util.Map;
import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double amount;
        String fromCurrency, toCurrency;

        while (true) {
            System.out.println("=== Conversor de Monedas ===");
            System.out.println("1. Convertir USD a ARS");
            System.out.println("2. Convertir USD a BOB");
            System.out.println("3. Convertir USD a BRL");
            System.out.println("4. Convertir USD a CLP");
            System.out.println("5. Convertir USD a COP");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");

            int option = scanner.nextInt();

            if (option == 6) {
                System.out.println("Saliendo del programa...");
                break;
            }

            System.out.print("Introduce la cantidad en USD: ");
            amount = scanner.nextDouble();

            switch (option) {
                case 1:
                    fromCurrency = "USD";
                    toCurrency = "ARS";
                    System.out.println("Resultado: " + convert(amount, fromCurrency, toCurrency) + " ARS");
                    break;
                case 2:
                    fromCurrency = "USD";
                    toCurrency = "BOB";
                    System.out.println("Resultado: " + convert(amount, fromCurrency, toCurrency) + " BOB");
                    break;
                case 3:
                    fromCurrency = "USD";
                    toCurrency = "BRL";
                    System.out.println("Resultado: " + convert(amount, fromCurrency, toCurrency) + " BRL");
                    break;
                case 4:
                    fromCurrency = "USD";
                    toCurrency = "CLP";
                    System.out.println("Resultado: " + convert(amount, fromCurrency, toCurrency) + " CLP");
                    break;
                case 5:
                    fromCurrency = "USD";
                    toCurrency = "COP";
                    System.out.println("Resultado: " + convert(amount, fromCurrency, toCurrency) + " COP");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }

        scanner.close();
    }

    public static double convert(double amount, String fromCurrency, String toCurrency) {
        double conversionRate = getConversionRate(fromCurrency, toCurrency); // Obtener tasa de conversión
        return amount * conversionRate;
    }

    public static double getConversionRate(String fromCurrency, String toCurrency) {
        // Aquí puedes implementar la lógica para devolver las tasas de conversión.
        switch (toCurrency) {
            case "ARS":
                return 975.9200;
            case "BOB":
                return 6.9325;
            case "BRL":
                return 5.4997;
            case "CLP":
                return 925.1883;
            case "COP":
                return 4232.2537;
            default:
                return 1.0; // Si no se encuentra la tasa de conversión, retorna 1.0
        }
    }
}
