package AQA.Record;

public class Lyrics extends SongInfo {

    public Lyrics (double duration, String author) {
        super.duration = duration;
        super.author = author;
    }

    @Override
    public String songName() {
        String songName = "Not me";
        return songName;
    }

}