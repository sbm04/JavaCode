package lld.lld2.InterviewBit.Adapter;

//Mp4Player.java
public class Mp4Player implements AdvancedPlayer{
    @Override
    public void playMp4(String file) {
        System.out.println("MP4 File "+ file + " Playing....");
    }

    @Override
    public void playWav(String file) {
        //do nothing
    }
}