package com.xworkz.optional;

import java.util.Optional;

public class DetailsOptional {
    public Optional<Long> getMobileNo(String name)
    {
        if (name!=null)
        {
            if("krishna".equalsIgnoreCase(name))
            {
                return Optional.of(6363326263L);
            }
            else if("Bhanu".equalsIgnoreCase(name))
            {
                return Optional.of(6305248328L);
            }
        }
        else
        {
            System.err.println("name should not be null");
        }
        return Optional.empty();
    }
}
