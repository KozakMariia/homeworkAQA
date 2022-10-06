package AQA.Record;

public class Rock extends SongInfo {

    public Rock (float duration, String author) {
        super.duration = duration;
        super.author = author;
    }

    @Override
    public String songName() {
        String songName = "Whisky";
        return songName;
    }

}
