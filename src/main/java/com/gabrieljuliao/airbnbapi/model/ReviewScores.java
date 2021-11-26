package com.gabrieljuliao.airbnbapi.model;

import lombok.Data;

@Data
public class ReviewScores {
   private int review_scores_accuracy;
   private int review_scores_cleanliness;
   private int review_scores_checkin;
   private int review_scores_communication;
   private int review_scores_location;
   private int review_scores_value;
   private int review_scores_rating;
}
