package com.pb.currEx.model;

public class Rate {
    private String no;
    private String effectiveDate;
    private double mid;

    public void setNo(final String no) {
        this.no = no;
    }

    public void setEffectiveDate(final String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public void setMid(final double mid) {
        this.mid = mid;
    }

    @Override
    public String toString() {
        return "Rates{" +
                "no='" + no + '\'' +
                ", effectiveDate='" + effectiveDate + '\'' +
                ", mid=" + mid +
                '}';
    }
}
