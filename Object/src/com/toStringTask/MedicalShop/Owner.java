package com.toStringTask.MedicalShop;

public class Owner {
    String name;
    double income;

    public Owner(String name, double income) {
        this.name = name;
        this.income = income;

        System.out.println("owner name:"+this.name);
        System.out.println("income:"+this.income);
    }
}
