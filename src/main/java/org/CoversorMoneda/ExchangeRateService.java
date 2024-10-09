package org.CoversorMoneda;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class ExchangeRateService {

    // Usa tu API Key real
    private static final String API_URL = "https://v6.exchangerate-api.com/v6/3aa22624caf39306a28f5fd6/latest/USD";

    public static void main(String[] args) {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(API_URL))
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String responseBody = response.body();

            if (response.statusCode() == 200) {
                // Usar Gson para mapear la respuesta JSON a un objeto Java
                Gson gson = new Gson();
                ExchangeRateResponse exchangeRateResponse = gson.fromJson(responseBody, ExchangeRateResponse.class);

                // Obtener las tasas de cambio filtradas
                Rates rates = exchangeRateResponse.getConversionRates();
                System.out.println("Tasa ARS: " + rates.getARS());
                System.out.println("Tasa BOB: " + rates.getBOB());
                System.out.println("Tasa BRL: " + rates.getBRL());
                System.out.println("Tasa CLP: " + rates.getCLP());
                System.out.println("Tasa COP: " + rates.getCOP());
                System.out.println("Tasa USD: " + rates.getUSD());
            } else {
                System.err.println("Error: HTTP " + response.statusCode());
            }
        } catch (IOException | InterruptedException e) {
            System.err.println("Error al realizar la solicitud HTTP: " + e.getMessage());
        }
    }
}