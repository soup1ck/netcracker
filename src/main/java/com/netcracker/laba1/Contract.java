package com.netcracker.laba1;

import java.time.LocalDate;
import java.util.Date;
/**
* Абстрактный класс контрактов.
 * @autor Vladimir Grakov
 */

public abstract class Contract {
    /**
     * Поля ID,номер контракта;
     * Поляначало и конец контракта
     * Поле сущность Person
     */
    private String ID, num;
    private LocalDate begin, end;
    private Person person;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public LocalDate getBegin() {
        return begin;
    }

    public void setBegin(LocalDate begin) {
        this.begin = begin;
    }

    public LocalDate getEnd() {
        return end;
    }

    public void setEnd(LocalDate end) {
        this.end = end;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public Contract() {
    }

    /**
     * Конструктор создания объекта Contract с определенными значениями.
     * @param ID
     * @param num
     * @param begin
     * @param end
     * @param person
     */
    public Contract(String ID, String num, LocalDate begin, LocalDate end, Person person) {
        this.ID = ID;
        this.num = num;
        this.begin = begin;
        this.end = end;
        this.person = person;
    }
}