package com.lcwd.rating.RatingService.entitiies;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document("user_ratings") // MONGODB
public class Rating {

    @Id
    private String ratingId;
    private  String userId;
    private String hotelId;
    private String rating;
    private String feedback;
}
