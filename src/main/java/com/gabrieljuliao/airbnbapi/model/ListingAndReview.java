package com.gabrieljuliao.airbnbapi.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Document("listingsAndReviews")
@Data
public class ListingAndReview {
    @Id
    private String _id;
    private String listing_url;
    private String name;
    private String summary;
    private String space;
    private String description;
    private String neighborhood_overview;
    private String notes;
    private String transit;
    private String access;
    private String interaction;
    private String house_rules;
    private String property_type;
    private String room_type;
    private String bed_type;
    private String minimum_nights;
    private String maximum_nights;
    private String cancellation_policy;
    private Date last_scraped;
    private Date calendar_last_scraped;
    private Date first_review;
    private Date last_review;
    private int accommodates;
    private int bedrooms;
    private int beds;
    private int number_of_reviews;
    private int bathrooms;
    private Set<String> amenities = new HashSet<>();
    private BigDecimal price;
    private BigDecimal security_deposit;
    private BigDecimal cleaning_fee;
    private BigDecimal extra_people;
    private int guests_included;
    private Images images;
    private Host host;
    private Address address;
    private Availability availability;
    private ReviewScores review_scores;
    private Set<Review> reviews = new HashSet<>();
}
