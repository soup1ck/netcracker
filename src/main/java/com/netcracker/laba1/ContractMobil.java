package com.netcracker.laba1;

import java.time.LocalDate;

class ContractMobil extends Contract {
    private String min, sms, gb;

    public ContractMobil(String ID, String num, LocalDate begin, LocalDate end, Person person, String min, String sms, String gb) {
        super(ID, num, begin, end, person);
        this.min = min;
        this.sms = sms;
        this.gb = gb;
    }

    public String getGb() {
        return gb;
    }

    public void setGb(String gb) {
        this.gb = gb;
    }

    public String getSms() {
        return sms;
    }

    public void setSms(String sms) {
        this.sms = sms;
    }

    public String getMin() {
        return min;
    }

    public void setMin(String min) {
        this.min = min;
    }
}
