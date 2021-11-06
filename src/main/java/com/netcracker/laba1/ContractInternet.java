package com.netcracker.laba1;

import java.time.LocalDate;

class ContractInternet extends Contract {
    private String speed;

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public ContractInternet(String ID, String num, LocalDate begin, LocalDate end, Person person, String speed) {
        super(ID, num, begin, end, person);
        this.speed = speed;
    }
}
