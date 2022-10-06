package AQA.Record;

import java.util.ArrayList;
import java.util.List;

public class Disk {

    public static void main(String[] args) {

        Pop pop = new Pop(1.23f, "KATE");
        Rock rock = new Rock(4.12f, "Nom");
        Lyrics lyrics = new Lyrics(3.57f, "Amanda");
        Classical classical = new Classical(6.01f, "Bah");

        List<SongInfo> songs = new ArrayList<>();
        songs.add(pop);
        songs.add(rock);
        songs.add(lyrics);
        songs.add(classical);

        CollectionSongs collectionSongs = new CollectionSongs(songs);



        System.out.println(collectionSongs.durationSum());
        System.out.println(collectionSongs.sortedSongs());
    }

}
