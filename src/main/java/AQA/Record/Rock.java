package AQA.Record;

public class Rock extends SongInfo {

    public Rock (double duration, String author) {
        super.duration = duration;
        super.author = author;
    }

    @Override
    public String songName() {
        return "Whisky";
    }

}
