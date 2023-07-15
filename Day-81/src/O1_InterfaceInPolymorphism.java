//Interface in polymorphism
interface Playable {
    void play();
}

class MusicPlayer implements Playable {
    @Override
    public void play() {
        System.out.println("Playing music...");
    }
}

class VideoPlayer implements Playable {
    @Override
    public void play() {
        System.out.println("Playing video...");
    }
}

public class O1_InterfaceInPolymorphism {
    public static void main(String[] args) {
        Playable[] players = new Playable[2];
        players[0] = new MusicPlayer();
        players[1] = new VideoPlayer();

        for (Playable player : players) {
            player.play();
        }
    }
}
