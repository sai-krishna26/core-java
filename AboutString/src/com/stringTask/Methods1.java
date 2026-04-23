package com.stringTask;

public class Methods1 {
    public static void main(String[] args)
    {
        char[] line={'J','a','v','a',' ','p'};

        String color="NavyBlue";
        //coverts the only char array into combined string.
        String newList=String.copyValueOf(line);

        //converts to string with specific length.
        String newLine=String.copyValueOf(line,0,3);

        String newInt=String.valueOf(42);//valueof(int i) this converts into  string as "42"

        String newChar=String.valueOf('A');

        String newLong=String.valueOf(560987654L);
        String newDouble=String.valueOf(98.83);
        String newBoolean=String.valueOf(true);
        String newFloat=String.valueOf(77.4);//float to string
        String newCharArray=String.valueOf(line);// by this method we can convert any array in to String type
        String newCharRange=String.valueOf(line,1,4);
        System.out.println(newCharArray);


    }
}
