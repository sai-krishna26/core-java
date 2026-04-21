package com.toStringTask.belt;

public class Company {
    String name;
    double cost;

    public Company(String name, double cost) {
        this.name = name;
        this.cost = cost;

        System.out.println("company name:"+this.name);
        System.out.println("cost:"+this.cost);
    }
}
