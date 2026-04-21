package com.java.equalsTask.oil;

public class OilRunner {
    public static void main(String[] args) {
        Oil oil=new Oil("Refined","Sunflower",180);
        Oil oil1=new Oil("palmOil","palm",120);
        Oil oil2=new Oil("palmOil","palm",120);

        boolean check=oil.equals(oil1);
        boolean chek1=oil1.equals(oil2);
        System.out.println("oil==oil1:"+check+"\n"+"oil1==oil2:"+chek1);
    }
}
