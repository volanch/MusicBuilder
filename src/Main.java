public class Main {
    public static void main(String[] args) {
        MusicDirector director = new MusicDirector();
        MusicBuilder builder = new PopMusicBuilder();
        Music music = director.construct(builder);
        System.out.println(music);
    }
}