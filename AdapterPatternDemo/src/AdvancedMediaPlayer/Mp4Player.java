package AdvancedMediaPlayer;

public class Mp4Player implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("\n Inside the Mp4 Player ");
        System.out.println("Played Mp4 : " + fileName  );
    }
}
