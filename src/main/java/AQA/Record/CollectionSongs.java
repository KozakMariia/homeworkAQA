package AQA.Record;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionSongs {

    private List<SongInfo> songs;

    public CollectionSongs(SongInfo... songs) {
        this.songs = List.of(songs);
    }

    public double durationSum() {
        return songs.stream()
                .mapToInt(el -> (int) el.getDuration())
                .sum();
    }

    public List<String> sortedSongs() {
        List<String> collect = songs.stream()
                .sorted(Comparator.comparingDouble(SongInfo::getDuration))
                .map(el -> el.songName())
                .collect(Collectors.toList());
        return collect;
    }

    public List<String> songsWithD() {
        List<String> songD = songs.stream()
                .filter(el -> el.getDuration() > 2 && el.getDuration() < 4)
                .map(el->el.songName())
                .collect(Collectors.toList());
        return songD;
    }

    public List<String> songsNames() {
        List<String> songName = songs.stream()
                .map(el->el.songName())
                .collect(Collectors.toList());
        return songName;
    }

}
