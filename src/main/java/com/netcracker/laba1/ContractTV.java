package com.netcracker.laba1;

import java.time.LocalDate;

/**
 * Класс наследник от абстрактного класса Contract-ContractTV.
 */
class ContractTV extends Contract {
    private String packages;

    public ContractTV() {
    }

    /**
     * Конструктор с определенными значениями для ContractTV.
     * @param ID
     * @param num
     * @param begin
     * @param end
     * @param person
     * @param packages
     */
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
