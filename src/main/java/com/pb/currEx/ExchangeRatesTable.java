package com.pb.currEx;

import java.util.List;

public class ExchangeRatesTable {
    private String table;
    private String no;
    private String effectiveDate;
    private List<Rates> rates;

    public void setTable(String table) {
        this.table = table;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public void setRates(List<Rates> rates) {
        this.rates = rates;
    }
}
