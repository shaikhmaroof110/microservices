package com.lcwd.rating.RatingService.controllers;

import com.lcwd.rating.RatingService.entitiies.Rating;
import com.lcwd.rating.RatingService.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingController {
    @Autowired
    private RatingService ratingService;

    @PostMapping
    public ResponseEntity<Rating> create(@RequestBody Rating rating)
    {
        return ResponseEntity.status(HttpStatus.CREATED).body(ratingService.create(rating));

    }

    @GetMapping
    public ResponseEntity<List<Rating>> getRatings()
    {
        return ResponseEntity.ok(ratingService.getRatings());
    }

    // communication between user and rating service.
    // rating by userId
    @GetMapping("users/{userId}")
    public ResponseEntity<List<Rating>> getRatingsByUserId(@PathVariable String userId)
    {
        return ResponseEntity.ok(ratingService.getRatingByUserId(userId));
    }

    // Rating By HotelId
    @GetMapping("/hotels/{hotelId}")
    public ResponseEntity<List<Rating>> getRatingsByHoteId(@PathVariable String hotelId)
    {
        return ResponseEntity.ok(ratingService.getRatingByHotelId(hotelId));
    }


}
