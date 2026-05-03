package May1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Movie {
    int movieId;
    String movieName;
    double rating;

    Movie(int movieId, String movieName, double rating) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.rating = rating;
    }

    void display() {
        System.out.println(movieId + "  " + movieName + "  " + rating);
    }
}

public class MovieSorting {
    public static void main(String[] args) {

        List<Movie> movies = new ArrayList<>();

        // Adding movies
        movies.add(new Movie(1, "Inception", 8.8));
        movies.add(new Movie(2, "Avatar", 7.9));
        movies.add(new Movie(3, "Interstellar", 9.1));
        movies.add(new Movie(4, "Joker", 8.4));

        // Before sorting
        System.out.println("Before Sorting:");
        for (Movie m : movies) {
            m.display();
        }

        // Sorting by rating (ascending)
        Collections.sort(movies, new Comparator<Movie>() {
            public int compare(Movie m1, Movie m2) {
                return Double.compare(m1.rating, m2.rating);
            }
        });

        // After sorting
        System.out.println("\nAfter Sorting By Rating:");
        for (Movie m : movies) {
            m.display();
        }
    }
}