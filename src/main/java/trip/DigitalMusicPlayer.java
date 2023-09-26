package trip;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DigitalMusicPlayer {
//    @Qualifier("jazzMusic")
    private Music music;
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;
    @Autowired
    public DigitalMusicPlayer(@Qualifier("jazzMusic")Music music) {
        this.music = music;
    }
    public void playMusic() {
        System.out.println("Digital playing: " + music.getSong());
    }
    public String playComputerMusic() {
        return "Digital playing: " + music.getSong();
    }
    public String getName() {
        return this.name;
    }
    public int getVolume() {
        return this.volume;
    }
}
