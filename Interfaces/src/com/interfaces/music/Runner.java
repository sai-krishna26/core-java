package com.interfaces.music;

public class Runner {
    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();

        System.out.println("Source: " + PlayMusic.SOURCE);
        System.out.println("Has bass: " + PlayMusic.HASBASS);

        player.play();
        player.stop();
        player.pause();
    }
}
