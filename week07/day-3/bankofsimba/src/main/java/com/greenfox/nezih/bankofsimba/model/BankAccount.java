package com.greenfox.nezih.bankofsimba.model;
import java.text.DecimalFormat;

public class BankAccount {

    public String name;
    public double balance;
    public String animalType;
    public boolean isKing;
    public String type;

    public BankAccount(String name, double balance, String animalType, boolean isKing, String type) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        this.isKing= isKing;
        this.type= type;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public boolean isKing() {
        return isKing;
    }

    public String getType() {
        return type;
    }
}
