package linkedlist.pm;

public class Playlist implements Comparable <Playlist> {
    //`songId`, `title`, `artist`, `album`, and `duration
    private int songId;
    private String title;
    private String artist;
    private String album;
    private String duration;

    public Playlist(int songId, String title, String artist, String album, String duration) {
        this.songId = songId;
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.duration = duration;
    }

    public int getSongId() {
        return songId;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getAlbum() {
        return album;
    }

    public String getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "Playlist{" +
                "songId=" + songId +
                ", title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", album='" + album + '\'' +
                ", duration='" + duration + '\'' +
                '}';
    }

    @Override
    public int compareTo(Playlist playlist) {
        return duration.compareTo((playlist).duration);

    }
}
