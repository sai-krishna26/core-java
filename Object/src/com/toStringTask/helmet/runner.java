package com.toStringTask.helmet;

public class runner {
    public static void main(String[] args) {

        Helmet helmet=new Helmet();
        helmet.wear();
        helmet.remove();
        System.out.println(helmet);

        Company company=new Company("ATLAS",1000.99);

        BicycleHelmet bicycleHelmet=new BicycleHelmet();
        bicycleHelmet.wear();
        bicycleHelmet.remove();
        System.out.println(bicycleHelmet);
    }
}
