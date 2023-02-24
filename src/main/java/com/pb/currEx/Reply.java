package com.pb.currEx;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Reply {
    private String table;
    private String currency;
    private String code;
    private Rates rates;
    private static int num = 0;

    public Reply() {
        num++;
    }

    @Override
    public String toString() {
        return "Reply{" +
                "table='" + table + '\'' +
                ", currency='" + currency + '\'' +
                ", code='" + code + '\'' +
                ", rates=" + rates +
                ", num=" + num +
                '}';
    }
}
/*
{"table":"A",
"currency":"dolar amerykański",
"code":"USD",
"rates":[{"no":"039/A/NBP/2023","effectiveDate":"2023-02-24","mid":4.4630}]}

{"type":"success","value":{"id":5,"quote":"Spring Boot solves this problem. It gets rid of XML and wires up common components for me, so I don't have to spend hours scratching my head just to figure out how it's all pieced together."}}

 */