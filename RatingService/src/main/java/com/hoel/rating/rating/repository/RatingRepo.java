package com.hoel.rating.rating.repository;

import com.hoel.rating.rating.entities.Rating;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface RatingRepo extends MongoRepository<Rating,String> {
    //custome finder methods
    List<Rating> findByUserId(String userId);
    List<Rating> findABYHotelId(String hotelId);


}
