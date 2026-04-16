package com.toStringTask.Belt;

public class runner {

    public static void main(String[] args) {

        String[] brands = {"Puma","Nike"};

        Belt belt = new Belt();
        belt.brand = brands;
        belt.size = BeltSize.MEDIUM;
        belt.wear();
        belt.remove();
        System.out.println(belt);

        System.out.println("---------------------------------");
        Company company = new Company("Puma",1200);
        System.out.println("---------------------------------");

        LeatherBelt leatherBelt = new LeatherBelt();
        leatherBelt.price = 1500;
        leatherBelt.wear();
        leatherBelt.remove();
        System.out.println(leatherBelt);
    }
}
