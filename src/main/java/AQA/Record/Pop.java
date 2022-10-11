package AQA.Record;

public class Pop extends SongInfo {

    public Pop (double duration, String author) {
        super.duration = duration;
        super.author = author;
    }

    @Override
    public String songName() {
        return "Sky";
    }

}
