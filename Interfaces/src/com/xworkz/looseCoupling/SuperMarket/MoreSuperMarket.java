package com.xworkz.looseCoupling.SuperMarket;

public class MoreSuperMarket implements SuperMarket{

    @Override
    public void purchase() {
        System.out.println(" executing purchase in MoreSuperMarket");
    }

    @Override
    public void discount() {
        System.out.println("executing discount in MoreSuperMarket");
    }
}
