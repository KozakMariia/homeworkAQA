package AQA.Record;

public class Rock extends SongInfo {

    private final String songName;

    public Rock (double duration, String autho, String songName) {
        super.duration = duration;
        super.author = author;
        this.songName = songName;
    }

    @Override
    public String songName() {
        return songName;
    }

}
