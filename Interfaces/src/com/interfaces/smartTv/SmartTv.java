package com.interfaces.smartTv;

public class SmartTv implements PlayVideo{
    @Override
    public void start() {
        System.out.println("smart tv started video");
    }

    @Override
    public void stop() {
        System.out.println("smart tv stoped video");
    }

    @Override
    public void pause() {
        System.out.println("smart tv paused video");
    }
}
