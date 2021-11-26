package com.gabrieljuliao.airbnbapi.repository;

import com.gabrieljuliao.airbnbapi.model.ListingAndReview;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ListingAndReviewRepository extends MongoRepository<ListingAndReview, Long> {
    Page<ListingAndReview> findListingAndReviewByAddress_Country(String name, Pageable pageable);
    Page<ListingAndReview> findListingAndReviewByAddress_CountryAndAddress_Market(String countryName,String marketName, Pageable pageable);
}
