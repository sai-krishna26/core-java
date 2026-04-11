package com.xworkz.overriding.Browser;

public class ChromeBrowser extends Browser {
    @Override
   public void browse() {
        System.out.println("Fast browsing");
    }
}
