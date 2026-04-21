package com.toStringTask.language;

public class runner {
    public static void main(String[] args) {
        Language language=new Language();
        language.communicate();
        language.write();
        System.out.println(language);

        About about=new About("Karnataka",true);

        Kannada kannada=new Kannada();
        kannada.firstName="Mysuru Rajya";
        kannada.community=3.06;
        kannada.communicate();
        kannada.write();
        System.out.println(kannada);
    }
}
