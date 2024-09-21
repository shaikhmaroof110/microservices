package com.lcwd.rating.RatingService.services;

import com.lcwd.rating.RatingService.entitiies.Rating;

import java.util.List;

public interface RatingService {


    // create
    Rating create (Rating rating);
    // get all
    List<Rating> getRatings();
    // get all by user Id
    List<Rating> getRatingByUserId(String userId);

    // get all by hotel
    List<Rating> getRatingByHotelId(String hotelId);
}
