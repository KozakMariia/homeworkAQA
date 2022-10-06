package AQA.Record;

public abstract class SongInfo {

    protected float duration;
    protected String author;

    public float getDuration() {
        return duration;
    }

    public String getAuthor() {
        return author;
    }

    public abstract String songName();

}
