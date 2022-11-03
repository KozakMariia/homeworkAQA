package AQA.Record;

public class Pop extends SongInfo {

    private final String songName;

    public Pop (double duration, String author, String songName) {
        super.duration = duration;
        super.author = author;
        this.songName = songName;
    }

    @Override
    public String songName() {
        return songName;
    }

}
