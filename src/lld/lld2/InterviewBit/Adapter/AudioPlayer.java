package lld.lld2.InterviewBit.Adapter;

//AudioPlayer.java
public class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;
    @Override
    public void play(String format, String file) {
        //inbuilt support to play mp3 music files
        if(format.equalsIgnoreCase("mp3")){
            System.out.println("MP3 file " + file +" Playing...");
        }
        //Make use of Adapter to support different formats
        else if(format.equalsIgnoreCase("wav") || format.equalsIgnoreCase("mp4")){
            mediaAdapter = new MediaAdapter(format);
            mediaAdapter.play(format, file);
        }
        else{
            System.out.println("Format not supported");
        }
    }
}