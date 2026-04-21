package com.java.equalsTask.toothPaste;

public class ToothPasteRunner {
    public static void main(String[] args) {
        ToothPaste toothPaste=new ToothPaste("Colgate","chemical",20.99);
        ToothPaste toothPaste1=new ToothPaste("Oral-B","natural+chemical",14.99);
        ToothPaste toothPaste2=new ToothPaste("patanjali","natural",50.99);
        ToothPaste toothPaste3=new ToothPaste("patanjali","natural",50.99);

        boolean check=toothPaste2.equals(toothPaste3);
        System.out.println("toothPaste2==toothPaste3:"+check);
    }
}
