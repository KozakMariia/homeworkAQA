package AQA.Record;

public class Pop extends SongInfo {

    public Pop (double duration, String author, String songName) {
        super.duration = duration;
        super.author = author;
    }

    @Override
    public String songName() {
        return "Sky";
    }

}
