package Assignment6;

import java.util.Scanner;

public class TestPlaylist {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many songs you want to add");
        SongsQueue playList=new SongsQueue(sc.nextInt());

        playList.enqueSong(new PlayList("song1"));
        playList.enqueSong(new PlayList("song2"));
        playList.enqueSong(new PlayList("song3"));
        playList.enqueSong(new PlayList("song4"));
        playList.enqueSong(new PlayList("song5"));

        playList.playSong("song123");
        playList.playSong("song1");
        playList.allSongs();
        playList.dequeueSong();
        playList.allSongs();
        playList.totalSongs();
    }
}
