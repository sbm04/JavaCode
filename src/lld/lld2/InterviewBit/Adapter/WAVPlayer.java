package lld.lld2.InterviewBit.Adapter;

//WAVPlayer.java
public class WAVPlayer implements AdvancedPlayer{
    @Override
    public void playMp4(String file) {
        //do nothing
    }

    @Override
    public void playWav(String file) {
        System.out.println("WAV File "+ file + " Playing....");
    }
}