package day03_Comparator;

import java.util.*;

public class MovieRunner {
    public static void main(String[] args) {

        List<Movie> movies = new ArrayList<>(Arrays.asList(
                new Movie("Star Wars: Episode IV – A New Hope", 1977, 8.6),
                new Movie("Avatar", 2009, 7.9),
                new Movie("Iron Man", 2008, 7.9),
                new Movie("The Dark Knight", 2008, 9.0),
                new Movie("Rocky", 1976, 8.1)
        ));

        movies.forEach(System.out::println);

        System.out.println("-----------------------------");

        movies.sort(Comparator.comparing(movie -> movie.getYear()));

        movies.sort(Comparator.comparing(Movie::getYear));

        movies.forEach(System.out::println);

        System.out.println("-----------------------------");

        movies.sort(Comparator.comparing(Movie::getYear).reversed());

        movies.forEach(System.out::println);

        System.out.println("-----------------------------");

        movies.sort(Comparator.comparing(movie -> movie.getRating()));

        movies.sort(Comparator.comparing(Movie::getRating));
        movies.sort(Comparator.comparing(Movie::getRating).reversed());

        movies.forEach(System.out::println);

        System.out.println("-----------------------------");

        movies.sort(Comparator.comparing(movie -> movie.getName()));
        movies.sort(Comparator.comparing(Movie::getName));
        movies.forEach(System.out::println);

        System.out.println("-----------------------------");

        Collections.sort(movies);  //Comparable Interface implementation
        movies.forEach(System.out::println);

    }
}
