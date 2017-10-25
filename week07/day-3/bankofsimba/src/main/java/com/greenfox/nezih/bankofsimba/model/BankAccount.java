package com.greenfox.nezih.bankofsimba.model;
import java.text.DecimalFormat;

public class BankAccount {
    //Add the fields name, balance, animalType in it

    public String name;
    public double balance;
    public String animalType;
    public boolean isKing;
    public boolean isGood;

    public BankAccount(String name, double balance, String animalType, boolean isKing, boolean isGood) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        this.isKing= isKing;
        this.isGood = isGood;

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

    //    @Override
//    public String toString() {
//        return  name + balance + animalType;
//    }
}
