package AQA.Record;

public class Pop extends SongInfo {

    public Pop (float duration, String author) {
        super.duration = duration;
        super.author = author;
    }

    @Override
    public String songName() {
        String songName = "Sky";
        return songName;
    }

}
