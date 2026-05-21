package com.xworkz.runner;

import com.xworkz.optional.Details;

public class DetailsRunner {
    public static void main(String... args)
    {
        Details details=new Details();
        String email=details.getEmail("Bhanu");
        System.out.println("email:"+email);

        String email1=details.getEmail("siddu");
        System.out.println("email:"+email1);
    }
}
