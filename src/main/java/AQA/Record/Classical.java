package AQA.Record;

public class Classical extends SongInfo {

    public Classical (float duration, String author) {
        super.duration = duration;
        super.author = author;
    }

    @Override
    public String songName() {
        String songName = "Winter";
        return songName;
    }

}
