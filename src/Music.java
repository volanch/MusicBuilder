public class Music {
    private String title;
    private String artist;
    private String album;
    private int year;
    private double duration;
    private String genre;
    private boolean listened;

    void setTitle(String title) { this.title = title; }
    void setArtist(String artist) { this.artist = artist; }
    void setAlbum(String album) { this.album = album; }
    void setYear(int year) { this.year = year; }
    void setDuration(double duration) { this.duration = duration; }
    void setGenre(String genre) { this.genre = genre; }
    void setListened(boolean listened) { this.listened = listened; }

    public String getTitle() { return title; }
    public String getArtist() { return artist; }
    public String getAlbum() { return album; }
    public int getYear() { return year; }
    public double getDuration() { return duration; }
    public String getGenre() { return genre; }
    public boolean isListened() { return listened; }

    @Override
    public String toString() {
        return  "title = " + title +
                "\nartist = " + artist +
                "\nalbum = " + album +
                "\nyear = " + year +
                "\nduration = " + duration +
                "\ngenre = " + genre +
                "\nlistened = " + listened;
    }
}
