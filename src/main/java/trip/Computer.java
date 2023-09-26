package trip;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    private int id;
    private DigitalMusicPlayer digitalMusicPlayer;

    @Autowired
    public Computer(DigitalMusicPlayer digitalMusicPlayer) {
        this.id = 1;
        this.digitalMusicPlayer = digitalMusicPlayer;
    }

    @Override
    public String toString() {
        return "Computer: " + id + " " + digitalMusicPlayer.playComputerMusic();
    }
}
