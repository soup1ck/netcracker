package com.netcracker.laba1;

import java.time.LocalDate;

class ContractTV extends Contract {
    private String packages;

    public ContractTV(String ID, String num, LocalDate begin, LocalDate end, Person person, String packages) {
        super(ID, num, begin, end, person);
        this.packages = packages;
    }

    public String getPackages() {
        return packages;
    }

    public void setPackages(String packages) {
        this.packages = packages;
    }
}
