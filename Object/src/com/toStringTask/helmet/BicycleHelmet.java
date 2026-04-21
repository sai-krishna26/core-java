package com.toStringTask.helmet;

public class BicycleHelmet extends Helmet {
    String companyName;
    double price;

    @Override
    public void wear() {
        super.wear();
    }

    @Override
    public void remove() {
        super.remove();
    }

    @Override
    public String toString() {
        return "company name:"+companyName+"; price:"+price;
    }
}
