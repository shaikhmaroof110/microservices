package com.lcwd.rating.RatingService.repositories;

import com.lcwd.rating.RatingService.entitiies.Rating;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RatingRepository extends MongoRepository<Rating, String> {

    // Custom finder method for data by userId
    List<Rating> findByUserId(String userId);

    // Custom finder method for data by hotelId
    List<Rating> findByHotelId(String hotelId);

}
