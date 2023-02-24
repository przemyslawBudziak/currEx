package com.pb.currEx;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class Rates {
    private String no;
    private String effectiveDate;
    private String mid;

}
// "rates":[{"no":"039/A/NBP/2023","effectiveDate":"2023-02-24","mid":4.4630}]}