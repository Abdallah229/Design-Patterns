package AdvancedMediaPlayer;

import java.time.Clock;

public class VlcPlayer implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        System.out.println("\nInside Vlc Player :");
        System.out.println("Played Vlc :  " + fileName);
    }

    @Override
    public void playMp4(String  fileName) {
    }
}
