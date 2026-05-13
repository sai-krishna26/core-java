package com.xworkz.looseCoupling.hospital;

public class ApolloHospital implements Hospital{
    @Override
    public void treatment() {
        System.out.println("executing treatment in ApolloHospital");
    }

    @Override
    public void checkup() {
        System.out.println("executing checkup in ApolloHospital");
    }
}
