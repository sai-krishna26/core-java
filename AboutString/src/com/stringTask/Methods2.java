package com.stringTask;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Methods2 {
    public static void main(String[] args) {
        String name="RaghuRam";
        String name1="RaghuRox";
        String string=new String("watson");
        boolean eqlRs=name.equals("Ram");
        boolean eqlRs1=name.equals(name1);
        boolean eqlRs2=name==string;

        //Converts the string into a byte array using UTF-8 encoding
        byte[] getBytes=name.getBytes(StandardCharsets.UTF_8);
        //Uses Arrays.toString() to print the human-readable numeric values
//        System.out.println("bytes:"+ Arrays.toString(getBytes));
//        System.out.println(getBytes);
//        System.out.println(eqlRs2);

        String lName=name.toLowerCase();
        String uName=name.toUpperCase();

        //retrives the specific index value of the String
        char indexValue=name.charAt(6);

        //retrives unique code value of that index and it is used over the charAt bcz it gives unique code for special symbols and emojies.
        int unqCode=name1.codePointAt(5);

        //unique code of before index.
        int unqBefore=name1.codePointBefore(5);
        int unqCount=name1.codePointCount(0,6);

        boolean emptyCheck=name.isEmpty();

        /*
            Unicode Subtraction:
            'a' has a Unicode value of 97.
            'o' has a Unicode value of 111.
            Calculation: 97-111=-14

            these are used to sort the array
         */
        int comparison=name.compareTo(name1);

        System.out.println(lName+"\n"+uName);
        System.out.println(indexValue);
        System.out.println(unqCode);

        System.out.println(name1.length());// it treates complex symbols or emojies as a 2 units, so if it is java+emoji it will return 6
        System.out.println(unqCount);//but it will give actual length in unq code

        System.out.println(emptyCheck);//checks the string weather it is empty?

        System.out.println(comparison);
    }
}
