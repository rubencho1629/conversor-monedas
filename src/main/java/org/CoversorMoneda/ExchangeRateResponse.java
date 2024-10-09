package org.CoversorMoneda;

public class ExchangeRateResponse {
    private String base_code;
    private String result;
    private Rates conversion_rates;

    public String getBaseCode() {
        return base_code;
    }

    public String getResult() {
        return result;
    }

    public Rates getConversionRates() {
        return conversion_rates;
    }
}