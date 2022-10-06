package AQA.Record;

public abstract class SongInfo {

    protected double duration;
    protected String author;

    public double getDuration() {
        return duration;
    }

    public String getAuthor() {
        return author;
    }

    public abstract String songName();

}
