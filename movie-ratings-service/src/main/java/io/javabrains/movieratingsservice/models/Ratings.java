package io.javabrains.movieratingsservice.models;

public class Ratings {

    private String movieName;
    private int rating;

    public Ratings(String movieId, int rating) {
        this.movieName = movieId;
        this.rating = rating;
    }

    public Ratings() {

    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieId(String movieId) {
        this.movieName = movieId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
