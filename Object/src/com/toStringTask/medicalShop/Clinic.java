package com.toStringTask.medicalShop;

public class Clinic extends MedicalShop {
    double revenue;
    @Override
    public void open() {
        System.out.println("Clinic shop is open");
    }

    @Override
    public void close() {
        System.out.println("Clinic shop is closed");
    }

    @Override
    public String toString() {
        return "revenue:"+revenue;
    }
}
