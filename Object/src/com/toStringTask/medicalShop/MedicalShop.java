package com.toStringTask.medicalShop;

public class MedicalShop {
    String[] medicineName;
    Owner owner;
    String location;
    ShopType type;
    boolean hasDoctor;

    public void open() {
        System.out.println("Medical shop is open");
    }

    public void close() {
        System.out.println("Medical shop is closed");
    }

    @Override
    public String toString() {
        return "location:"+location+ "; type:"+type+ "; hasDoctor:"+hasDoctor+ "; owner:"+owner;
    }
}
