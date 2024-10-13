package com.hoel.rating.rating.service;

import com.hoel.rating.rating.entities.Rating;

import java.util.List;

public interface RatingService {
    //create
    Rating create(Rating rating);
    //get all ratings
    List<Rating> getRatings();
    //get all by userid
    List<Rating> getRatingsByUserId(String userId);

    //get all by hotel
    List<Rating> getRatingByHotelId(String hotelId);
}
