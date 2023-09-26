package trip;

public class HipHopMusic implements Music {
    private HipHopMusic() {
    }

    public static HipHopMusic getHipHopMusic() {
        return new HipHopMusic();
    }

    public void doMyInit() {
        System.out.println("go dance - Hip-Hop!");
    }

    public void doMyDestroy() {
        System.out.println("Stop Hip-Hop!");
    }

    @Override
    public String getSong() {
        return "Im On My Way Up";
    }
}
