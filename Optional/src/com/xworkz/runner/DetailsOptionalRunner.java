package com.xworkz.runner;

import com.xworkz.optional.DetailsOptional;

import java.util.Optional;

public class DetailsOptionalRunner {
    public static void main(String... args) {

        DetailsOptional detailsOptional = new DetailsOptional();
        Optional<Long> number = detailsOptional.getMobileNo("bhanu");

        if (number.isPresent())
        {
            System.out.println("mob nor:" + number);
        }
        else
        {
            System.err.println("number should not be null");
        }
    }
}
