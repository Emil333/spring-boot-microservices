package io.javabrains.moviecatalogservice.models;

import java.util.List;

public class UserRatings {

    private List<Rating> userRating;

    public UserRatings() {
    }

    public UserRatings(List<Rating> userRating) {
        this.userRating = userRating;
    }

    public List<Rating> getUserRating() {
        return userRating;
    }

    public void setUserRating(List<Rating> userRating) {
        this.userRating = userRating;
    }
}
