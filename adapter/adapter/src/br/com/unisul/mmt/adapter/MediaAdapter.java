package br.com.unisul.mmt.adapter;

public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType) {
        switch (audioType.toLowerCase()) {
            case "vlc" -> advancedMediaPlayer = new VlcPlayer();
            case "mp4" -> advancedMediaPlayer = new Mp4Adapter();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        switch (audioType.toLowerCase()) {
            case "vlc" -> advancedMediaPlayer.playVlc(fileName);
            case "mp4" -> advancedMediaPlayer.playMp4(fileName);
        }
    }
}
