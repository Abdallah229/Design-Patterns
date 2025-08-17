package MediaPlayer;

public class AudioPlayer  implements  MediaPlayer{
    private  MediaAdapter mediaAdapter  ;



    @Override
    public void play(String audioType , String fileName) {
        if (audioType == "mp3") {
            System.out .println("Playing mp3 for the file : " + fileName );
        }
        else if (audioType == "vlc" || audioType == "mp4") {
            mediaAdapter = new MediaAdapter(audioType) ;
            mediaAdapter.play(audioType,fileName);
        }
        else {
            System.out.println("Invalid audio type for file :  " + fileName);
        }
    }
}
