package lld.lld2.InterviewBit.Adapter;

//MediaAdapter.java
public class MediaAdapter implements MediaPlayer {
    AdvancedPlayer advancedPlayer;
    public MediaAdapter(String format){
        if(format.equalsIgnoreCase("mp4") ){
            advancedPlayer = new Mp4Player();
        }else if(format.equalsIgnoreCase("wav") ){
            advancedPlayer = new WAVPlayer();
        }
    }
    @Override
    public void play(String format, String file) {

        if(format.equalsIgnoreCase("mp4")){
            advancedPlayer.playMp4(file);
        }
        else if(format.equalsIgnoreCase("wav")){
            advancedPlayer.playWav(file);
        }
    }
}