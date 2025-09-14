public interface MusicBuilder {
    void setTitle(String title);
    void setArtist(String artist);
    void setAlbum(String album);
    void setYear(int year);
    void setDuration(double duration);
    void setGenre(String genre);
    void setListened(boolean listened);
    Music build();
}