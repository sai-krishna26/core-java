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
        System.out.println("convertion string-->byte array (address):"+getBytes);
        System.out.println("result by using Arrays.toString():"+ Arrays.toString(getBytes));
        System.out.println("name==strirng:"+eqlRs2);

        String lName=name.toLowerCase();
        String uName=name.toUpperCase();
        System.out.println("result of lowercase and UPPERCASSE of "+name+" : "+lName+"\n"+uName);

        //retrives the specific index value of the String
        char indexValue=name.charAt(6);
        System.out.println("charAt specific index of "+name+" : "+indexValue);

        //retrives unique code value of that index and it is used over the charAt bcz it gives unique code for special symbols and emojies.
        int unqCode=name1.codePointAt(5);
        System.out.println("codePoint of specific index of"+name+" : "+unqCode);

        //unique code of before index.
        int unqBefore=name1.codePointBefore(5);
        int unqCount=name1.codePointCount(0,6);
        System.out.println("lenght(): "+name1.length());// it treates complex symbols or emojies as a 2 units, so if it is java+emoji it will return 6
        System.out.println("actual length by unqcode: "+unqCount);      //but it will give actual length in unq code.


        boolean emptyCheck=name.isEmpty();
        System.out.println("empty check by isEmpty: "+emptyCheck);//checks the string weather it is empty?
        /*
            Unicode Subtraction:
            'a' has a Unicode value of 97.
            'o' has a Unicode value of 111.
            Calculation: 97-111=-14

            these are used to sort the array
         */
        int comparison=name.compareTo(name1);
        System.out.println("camparison result by compareTo(if -ve the string1 is smaller than string2):"+comparison);

        String bottle="bottle";
        String bottle1="Plastic";
        String bottle2="Steel";
        int ignoredComparison=bottle1.compareToIgnoreCase(bottle2);
        System.out.println( "ignoredComparison of "+bottle1+" and "+bottle2+" by compareToIgnoreCase() is :"+ignoredComparison);

        String concat=bottle1.concat(bottle);
        System.out.println("concatenation:"+concat);

        boolean contains=bottle.contains("ttt");
        System.out.println("conatins result(ttt in bottle):"+contains);

        boolean contenEquals=bottle.contentEquals("bottle");
        boolean contenEquals1=bottle.contentEquals("bottl");
        System.out.println("contenEquals result:"+contenEquals);
        System.out.println("contenEquals result2:"+contenEquals1);

        boolean result=bottle.endsWith("le");
        System.out.println("endsWith result:"+result);

        int hashcode=bottle.hashCode();
        System.out.println("hascode of variable "+bottle+" : "+hashcode);

        //it checks the characters by unicode of thier and if it presents it will print index of that character, if not found returns -1.
        //if character repeating multiple times it stops at first occurance, and retutns index.
        int indexOf=bottle.indexOf(116);//indexOf(charCode)
        int indexOf2=bottle.indexOf(116,3);//indexOf(charCode, findingStartIndex)
        int indexOf3=bottle.indexOf("ot");//indexOf('char' or "string" or "subString")
        int indexOf4=bottle.indexOf("e",4);//indexOf('c' or "str", findingStartIndex)
        System.out.println("indexOf:"+indexOf);
        System.out.println("indexOf:"+indexOf2);
        System.out.println("indexOf:"+indexOf3);
        System.out.println("indexOf:"+indexOf4);


        String s1=new String("bottle");        // Created in Heap memory
        String s2=new String ("bottle");                           // Created in instance Pool
        System.out.println(s1 == s2);                   // false (different memory locations)
        String s3=s1.intern();                           // Moves "bottle" to the instance pool
        System.out.println(s1.equals(s2));                   // true (now they point to the same object!)

        int lastIndex=s1.lastIndexOf("le");
        System.out.println(lastIndex);
    }
}
