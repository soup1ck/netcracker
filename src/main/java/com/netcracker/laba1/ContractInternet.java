package com.netcracker.laba1;

import java.time.LocalDate;

/**
 * Класс наследник от абстрактного класса Contract - ContractInternet.
 */
class ContractInternet extends Contract {
    /**
     * Поле скорость интернета.
     */
    private String speed;

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public ContractInternet() {
    }

    /**
     * Конструктор класса ContractInternet с определенными значениями.
     * @param ID
     * @param num
     * @param begin
     * @param end
     * @param person
     * @param speed
     */
    public ContractInternet(String ID, String num, LocalDate begin, LocalDate end, Person person, String speed) {
        super(ID, num, begin, end, person);
        this.speed = speed;
    }
}
