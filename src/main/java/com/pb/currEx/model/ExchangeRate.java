package com.pb.currEx.model;

import java.util.List;

public class ExchangeRate {
    private String table;
    private String currency;
    private String code;
    private List<Rate> rates;

    public void setTable(final String table) {
        this.table = table;
    }

    public void setCurrency(final String currency) {
        this.currency = currency;
    }

    public void setCode(final String code) {
        this.code = code;
    }

    public void setRates(final List<Rate> rates) {
        this.rates = rates;
    }

    @Override
    public String toString() {
        return "ExchangeRates{" +
                "table='" + table + '\'' +
                ", currency='" + currency + '\'' +
                ", code='" + code + '\'' +
                ", rates=" + rates +
                '}';
    }
}
