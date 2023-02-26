package com.pb.currEx;

import java.util.List;

public class NbpExchangeRate {
    private String table;
    private String currency;
    private String code;
    private List<NbpRate> rates;

    private void setTable(String table) {
        this.table = table;
    }

    private void setCurrency(String currency) {
        this.currency = currency;
    }

    private void setCode(String code) {
        this.code = code;
    }

    private void setRates(List<NbpRate> rates) {
        this.rates = rates;
    }

    @Override
    public String toString() {
        return code + ": " + rates.toString();
    }
}