package com.xworkz.optional;

public class Details {
    public String getEmail(String name)
    {
        if(name!=null)
        {
            if("bhanu".equalsIgnoreCase(name))
            {
                return "bhanu@gmail.com";
            }
            else if("siddu".equalsIgnoreCase(name))
            {
                return "siddu@gmail.com";
            }
        }
        else
        {
            System.err.println("name should not be null");
        }
        return null;
    }
}
