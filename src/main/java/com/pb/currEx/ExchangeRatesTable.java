package com.pb.currEx;

import java.util.List;

public class ExchangeRatesTable {
    private String table;
    private String no;
    private String effectiveDate;
    private List<Rates> rates;

    private void setTable(String table) {
        this.table = table;
    }

    private void setNo(String no) {
        this.no = no;
    }

    private void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    private void setRates(List<Rates> rates) {
        this.rates = rates;
    }

    public List<Rates> getRates() {
        return rates;
    }

    @Override
    public String toString() {
        return "ExchangeRatesTable{" +
                "rates=" + rates.toString() +
                '}';
    }
}
