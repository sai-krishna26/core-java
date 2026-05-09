package com.xworkz.methods;

import java.time.*;

public class Task1 {
    public static void main(String[] args) {
        LocalDate local=LocalDate.now();
        System.out.println("date by LocalDate.now():"+local);
        System.out.println("-------------------");

        LocalDateTime local1=LocalDateTime.now();
        System.out.println("date time by LocalDateTime.now():"+local1);
        System.out.println("-------------------");

        LocalTime local2= LocalTime.now();
        System.out.println("time by LocalTime.now():"+local2);
        System.out.println("-------------------");

        ZonedDateTime india=ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        LocalDateTime local3=LocalDateTime.from(india);
        System.out.println("date/time by ZonedDateTime.now(ZoneId.of(Asia/Kolkata)):"+local3);
        System.out.println("-------------------");

        LocalDateTime local4=LocalDateTime.MAX;
        System.out.println("result of LocalDateTime.MAX:"+local4);
        System.out.println("-------------------");

        //creates custom date and time(exam schedule)
        LocalDateTime local5=LocalDateTime.of(2004,2,26,9,5);
        System.out.println("result of LocalDateTime.of(2004,2,26,9,5):"+local5);

    }
}
