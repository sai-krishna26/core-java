package com.toStringTask.medicalShop;

public class runner {
    public static void main(String[] args) {
        String[] medicines = {"Dolo","Paracetamol"};
        MedicalShop shop = new MedicalShop();
        shop.medicineName = medicines;
        shop.type = ShopType.GENERAL;

        shop.open();
        shop.close();
        System.out.println(shop);

        System.out.println("---------------------------------");
        Owner owner = new Owner("Ramesh",50000);
        System.out.println("---------------------------------");

        Clinic clinic = new Clinic();
        clinic.revenue = 100000;
        clinic.open();
        clinic.close();
        System.out.println(clinic);
    }
}
