package arraylists.mcm;

import java.util.ArrayList;

public class MovieCollectionManager {
    ArrayList <Movie> movies = new ArrayList<>();

    public void addMovies (Movie movie) {
        movies.add(movie);
        System.out.println("Movies Added: " +movie);
    }

    public void searchMovieByTitle (String title) {
        for (Movie movie: movies) {
            if (movie.getTitle() == title) {
                System.out.println("Movie Found: "+movie);
                return;
            }
        }
        System.out.println("Movie with Title" +title+ "Not Found");
    }

    public void removeMovies (int movieID) {
        movies.removeIf(movie -> movie.getMovieID()==(movieID));
    }

    public void displayMovie() {
        if (movies.isEmpty()){
            System.out.println("No Movies in the Collection");
        } else {
            for (Movie movie : movies) {
                System.out.println(movie);
            }
        }
    }



    //Main Method-----------------------------------------------------
    public static void main(String[] args) {
        MovieCollectionManager movieCM = new MovieCollectionManager();

        movieCM.addMovies(new Movie(1,"Jawan","ShahRukh Khan","Red Chillies Entertainment", 2023));
        movieCM.addMovies(new Movie(2,"Patha","Shiddhart Anand","Yash Raj Film", 2021));
        movieCM.addMovies(new Movie(3,"Drishyam 2","Abhishek Pathak","Walt Disney Studios", 2022));
        movieCM.addMovies(new Movie(4,"Shaitaan","Vikas Bhal","Devgn Films", 2024));

        System.out.println("\nRemove Movie By ID 2");
        movieCM.removeMovies(2);

        System.out.println("\nSearch Movie BY title is Jawan:");
        movieCM.searchMovieByTitle("Jawan");

        movieCM.displayMovie();

    }
}
