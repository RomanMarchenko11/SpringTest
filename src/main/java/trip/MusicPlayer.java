package trip;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private Music music;
    private String name;
    private int volume;
    private List<Music> musicList;
//   IoC
    public MusicPlayer(Music music) {
       this.music = music;
   }
   public MusicPlayer(){}
   public void setMusic(Music music) {
        this.music = music;
   }
    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }

    public void setName (String name) {
        this.name = name;
    }

    public void setVolume (int volume) {
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public void setMusicList(List list) {
        this.musicList = list;
    }

    public List getMusicList() {
        return musicList;
    }

    public void playMusicList() {
        System.out.println("Playing music: ");
        for (int i = 0; i < musicList.size(); i++) {
            System.out.println( (i+1) + " - " + musicList.get(i).getSong());
        }
    }
}
