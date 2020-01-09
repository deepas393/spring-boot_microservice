package io.javabrains.movieratingsservice.resources;

import io.javabrains.movieratingsservice.models.Ratings;
import io.javabrains.movieratingsservice.models.UserRatings;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratings")
public class MovieRatingResource {

    public MovieRatingResource() {
    }

    @RequestMapping("/{movieId}")
    public Ratings getMovieRatings(@PathVariable("movieId") String movieId){
        return new Ratings(movieId,5);
    }

    @RequestMapping("/Users/{userId}")
    public UserRatings getUserRatings(@PathVariable("userId") String userId){
        List<Ratings> ratings = Arrays.asList(
                new Ratings("111",5),
                new Ratings("222",4));
        UserRatings userRatings = new UserRatings();
        userRatings.setUserRatings(ratings);
        return userRatings;
    }

}
