package AQA.Record;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
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
        return songs.stream()
                .sorted(Comparator.comparingDouble(SongInfo::getDuration))
                .map(el -> el.songName())
                .collect(Collectors.toList());
    }

    public List<String> songsWithDiapazon(int firstNumber, int lastNumber) {
        return songs.stream()
                .filter(el -> el.getDuration() > firstNumber && el.getDuration() < lastNumber)
                .map(el->el.songName())
                .collect(Collectors.toList());
    }

    public Set<String> songsNames() {
        return songs.stream()
                .map(el->el.songName())
                .collect(Collectors.toSet());
    }

}
