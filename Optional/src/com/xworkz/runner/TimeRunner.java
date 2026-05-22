package com.xworkz.runner;

import com.xworkz.anonymous.Time;

import java.time.LocalTime;
import java.util.Optional;

public class TimeRunner {
    public static void main(String[] args) {
     Time time=new Time()
     {
         @Override
         public Optional<String> getGreeting(LocalTime time) {
             LocalTime noon=LocalTime.of(12,0);
             LocalTime noon1=LocalTime.of(20,0);
             if (time.isBefore(noon) || time.equals(noon))
             {
                 System.out.println("GoodMorning");
             }
             else if(time.isAfter(noon) || time.isBefore(noon1))
             {
                 System.out.println("GoodEvening");
             }
             else
             {
                 System.out.println("GoodNight");
             }
             return Optional.empty();
         }
     };

     Optional <String> greet=time.getGreeting(LocalTime.now());
    }
}
