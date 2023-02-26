package com.pb.currEx;

public class NbpRate {
    private String no;
    private String effectiveDate;
    private Double mid;

    @Override
    public String toString() {
        return "" + mid;
    }

    private void setNo(String no) {
        this.no = no;
    }

    private void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    private void setMid(Double mid) {
        this.mid = mid;
    }
}