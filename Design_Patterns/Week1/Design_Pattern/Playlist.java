import java.util.ArrayList;

public class Playlist implements IComponent {

    public String playlistName;
    public ArrayList<IComponent> playlist = new ArrayList<IComponent>();

    public Playlist(String playlistName) {
        this.playlistName = playlistName;
    }

    public void play() {
        // play songs recursively
        for (IComponent i : playlist) {
            i.play();
        }
    }

    public void setPlaybackSpeed(float speed) {
        // recursively
        for (IComponent i : playlist) {
            i.setPlaybackSpeed(speed);
        }
    }

    public String getName() {
        return this.playlistName;
    }

    public void add(IComponent component) {
        this.playlist.add(component);
    }

    public void remove(IComponent component) {
        this.playlist.remove(component);
    }
}