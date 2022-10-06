package AQA.Record;

import java.util.List;
import java.util.stream.Collectors;

public class CollectionSongs {

    private List<SongInfo> songs;

    public CollectionSongs(List<SongInfo> songs) {
        this.songs = songs;
    }

    public float durationSum() {
        return songs.stream()
                .mapToInt(el -> (int) el.getDuration())
                .sum();
    }

    public List<String> sortedSongs() {
        return songs.stream()
                .filter(el-> Boolean.parseBoolean((el.getAuthor())))
                .map(el->el.songName())
                .collect(Collectors.toList());
    }

}
