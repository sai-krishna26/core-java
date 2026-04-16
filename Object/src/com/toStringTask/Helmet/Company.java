package com.toStringTask.Helmet;

public class Company {
    String CompanyName;
    double cost;

    public Company(String companyName, double cost) {
        CompanyName = companyName;
        this.cost = cost;

        System.out.println("company name:"+companyName);
        System.out.println("cost:"+cost);
    }
}
