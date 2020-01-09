package io.javabrains.movieratingsservice.models;

import java.util.List;

public class UserRatings {

private List<Ratings> userRatings;

    public UserRatings() {

    }

    public List<Ratings> getUserRatings() {
        return userRatings;
    }

    public void setUserRatings(List<Ratings> userRatings) {
        this.userRatings = userRatings;
    }
}
