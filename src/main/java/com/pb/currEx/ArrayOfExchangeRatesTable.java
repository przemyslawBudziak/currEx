package com.pb.currEx;

import java.util.List;

public class ArrayOfExchangeRatesTable {
    private List<ExchangeRatesTable> tables;

    public void setTables(List<ExchangeRatesTable> tables) {
        this.tables = tables;
    }

    public List<ExchangeRatesTable> getTables() {
        return tables;
    }

    @Override
    public String toString() {
        return "ArrayOfExchangeRatesTable{" +
                "tables=" + tables.toString() +
                '}';
    }
}
