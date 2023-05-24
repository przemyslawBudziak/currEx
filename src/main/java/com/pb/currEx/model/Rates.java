package com.pb.currEx.model;

public class Rates {
    private String currency;
    private String code;
    private double mid;

    public void setCurrency(final String currency) {
        this.currency = currency;
    }

    public void setCode(final String code) {
        this.code = code;
    }

    public void setMid(final double mid) {
        this.mid = mid;
    }

    @Override
    public String toString() {
        return "Rates{" +
                "currency='" + currency + '\'' +
                ", code='" + code + '\'' +
                ", mid=" + mid +
                '}';
    }
}
