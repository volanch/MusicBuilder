public class MusicDirector {
    public Music construct(MusicBuilder builder) {
        builder.setTitle("Not Gonna Get Us");
        builder.setArtist("t.A.T.u");
        builder.setAlbum("200 km/h In The Wrong Lane");
        builder.setYear(2002);
        builder.setDuration(4.21);
        builder.setGenre("Pop");
        builder.setListened(true);
        return builder.build();
    }
}