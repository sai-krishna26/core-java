package com.xworkz.overriding.Bank;

public class Runner {
    public static void main(String[] args) {
        System.out.println("intrest rates:");
        Sbi sbi=new Sbi();
        double intrest =sbi.getInterestRate();
        System.out.println(intrest);

        Bank bank=new Bank();
        double intrest1=bank.getInterestRate();
        System.out.println(intrest1);

        Bank bank1=new Sbi();
        double intrest3=bank1.getInterestRate();
        System.out.println(intrest3);
    }
}
