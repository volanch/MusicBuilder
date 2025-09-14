public class PopMusicBuilder implements MusicBuilder {
    private Music music = new Music();

    @Override public void setTitle(String title) { music.setTitle(title); }
    @Override public void setArtist(String artist) { music.setArtist(artist); }
    @Override public void setAlbum(String album) { music.setAlbum(album); }
    @Override public void setYear(int year) { music.setYear(year); }
    @Override public void setDuration(double duration) { music.setDuration(duration); }
    @Override public void setGenre(String genre) { music.setGenre(genre); }
    @Override public void setListened(boolean listened) { music.setListened(listened); }

    @Override public Music build() { return music; }
}
