package MediaPlayer;

import AdvancedMediaPlayer.*;

public class MediaAdapter implements MediaPlayer{
    private AdvancedMediaPlayer advancedMediaPlayer ;

    MediaAdapter (String audioType  ) {
        if (audioType == "vlc") {
            advancedMediaPlayer = new VlcPlayer() ;
        }
        else if (audioType == "mp4") {
            advancedMediaPlayer = new Mp4Player() ; }
    }
    @Override
    public void play(String audioType , String fileName) {
        if (audioType == "vlc") {
            advancedMediaPlayer.playVlc(fileName);
        }
        else if (audioType == "mp4") {
            advancedMediaPlayer.playMp4(fileName);
        }
    }
}
