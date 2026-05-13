package com.xworkz.looseCoupling.hospital;

public class ManipalHospital implements Hospital{
    @Override
    public void treatment() {
        System.out.println("executing treatment in ManipalHospital");
    }

    @Override
    public void checkup() {
        System.out.println("executing checkup in ManipalHospital");
    }
}
