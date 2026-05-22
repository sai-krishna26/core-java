package com.xworkz.anonymous;

import java.time.LocalTime;
import java.util.Optional;

public class Time {
    public Optional<String> getGreeting(LocalTime time)
    {
        LocalTime noon=LocalTime.of(12,0);
        LocalTime noon1=LocalTime.of(20,0);
        if (time.isBefore(noon) || time.equals(noon))
        {
            System.out.println("GoodMorning Boss");
        }
        else if(time.isAfter(noon) || time.isBefore(noon1))
        {
            System.out.println("GoodEvening Boss");
        }
        else
        {
            System.out.println("GoodNight Boss");
        }
        return Optional.empty();
    }
}
