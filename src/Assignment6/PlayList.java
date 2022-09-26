package Assignment6;

public class PlayList {
    private String song;

    public PlayList(String song) {
        this.song = song;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    @Override
    public String toString() {
        return "PlayList{" +
                "song='" + song + '\'' +
                '}';
    }
}
