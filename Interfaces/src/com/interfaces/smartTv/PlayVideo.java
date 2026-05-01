package com.interfaces.smartTv;

public interface PlayVideo {
    public static final String REF="YouTube";
    boolean HASAUDIO=true;

     public abstract void start();
     void stop();
     public void pause();
}
