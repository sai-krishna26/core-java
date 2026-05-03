package com.interfaces.music;

public interface PlayMusic {
    String SOURCE = "Spotify";
    boolean HASBASS = true;

    void play();
    void stop();
    void pause();
}
