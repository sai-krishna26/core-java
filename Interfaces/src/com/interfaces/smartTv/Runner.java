package com.interfaces.smartTv;

public class Runner {
    public static void main(String[] args) {
        SmartTv smartTv=new SmartTv();
        System.out.println("REF:"+PlayVideo.REF);
        System.out.println("Has sound:"+PlayVideo.HASAUDIO);

        smartTv.start();
        smartTv.stop();
        smartTv.pause();
    }
}
