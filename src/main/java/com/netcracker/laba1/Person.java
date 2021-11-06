package com.netcracker.laba1;

import javax.xml.datatype.DatatypeConfigurationException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class Person {
    private String id, fio, gender, passport;
    private LocalDate bd;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public LocalDate getBd() {
        return bd;
    }

    public void setBd(LocalDate bd) {
        this.bd = bd;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public Person(String id, String fio, String gender, String passport, LocalDate bd) {
        this.id = id;
        this.fio = fio;
        this.gender = gender;
        this.passport = passport;
        this.bd = bd;
    }

public int getAge(LocalDate date1){
    return Period.between(LocalDate.now(),date1).getYears();
    }
}
