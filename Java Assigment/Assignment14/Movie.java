package arraylists.mcm;

public class Movie {
    //movieID, title, director, genre, and yearReleased
    private  int movieID;
    private  String title;
    private  String director_name;
    private String genre;
    private int yearReleased;

    public Movie(int movieID, String title, String director_name, String genre, int yearReleased) {
        this.movieID = movieID;
        this.title = title;
        this.director_name = director_name;
        this.genre = genre;
        this.yearReleased = yearReleased;
    }

    public int getMovieID() {
        return movieID;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector_name() {
        return director_name;
    }

    public String getGenre() {
        return genre;
    }

    public int getYearReleased() {
        return yearReleased;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieID=" + movieID +
                ", title='" + title + '\'' +
                ", director_name='" + director_name + '\'' +
                ", genre='" + genre + '\'' +
                ", yearReleased=" + yearReleased +
                '}';
    }
}
