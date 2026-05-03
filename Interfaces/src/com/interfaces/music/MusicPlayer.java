package com.interfaces.music;

public class MusicPlayer implements PlayMusic {
    @Override
    public void play() {
        System.out.println("Music player started playing");
    }

    @Override
    public void stop() {
        System.out.println("Music player stopped");
    }

    @Override
    public void pause() {
        System.out.println("Music player paused");
    }
}
