package lld.lld2.InterviewBit.Adapter;

//Driver.java
public class Driver {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "music1.mp3");
        audioPlayer.play("wav", "music2.wav");
        audioPlayer.play("mp4", "music3.mp4");
        audioPlayer.play("avi", "music4.avi");
    }
}