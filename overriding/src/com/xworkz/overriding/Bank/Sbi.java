package com.xworkz.overriding.Bank;

public class Sbi extends Bank {
    double getInterestRate()
    {
        System.out.println("intrest at SBI:");
        return 5.00;
    }
}
