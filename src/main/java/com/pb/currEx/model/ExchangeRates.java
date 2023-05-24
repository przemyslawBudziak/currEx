package com.pb.currEx.model;

import java.util.List;

public class ExchangeRates {
    private String table;
    private String no;
    private String effectiveDate;
    private List<Rates> rates;

    public void setTable(final String table) {
        this.table = table;
    }

    public void setNo(final String no) {
        this.no = no;
    }

    public void setEffectiveDate(final String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public void setRates(final List<Rates> rates) {
        this.rates = rates;
    }

    @Override
    public String toString() {
        return "ExchangeRates{" +
                "table='" + table + '\'' +
                ", no='" + no + '\'' +
                ", effectiveDate='" + effectiveDate + '\'' +
                ", rates=" + rates +
                '}';
    }
}
