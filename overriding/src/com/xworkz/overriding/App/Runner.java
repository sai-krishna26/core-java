package com.xworkz.overriding.App;

public class Runner {

    public static void main(String[] args) {
        Instagram instagram = new Instagram();
        instagram.sendMsg();

        App app = new Instagram();
        app.sendMsg();

        App app1 = new App();
        app1.sendMsg();
    }
}
