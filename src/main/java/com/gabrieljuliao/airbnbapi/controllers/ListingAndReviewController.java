package com.gabrieljuliao.airbnbapi.controllers;

import com.gabrieljuliao.airbnbapi.repository.ListingAndReviewRepository;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ListingAndReviewController {

    private final ListingAndReviewRepository listingAndReviewRepository;

    public ListingAndReviewController(ListingAndReviewRepository listingAndReviewRepository) {
        this.listingAndReviewRepository = listingAndReviewRepository;
    }

    @GetMapping
    public ResponseEntity<?> getListings(Pageable pageable) {
        return new ResponseEntity<>(listingAndReviewRepository.findAll(pageable), HttpStatus.OK);
    }

    @GetMapping("{countryName}")
    public ResponseEntity<?> getListingsByCountry(@PathVariable String countryName, Pageable pageable) {
        return new ResponseEntity<>(listingAndReviewRepository.findListingAndReviewByAddress_Country(countryName, pageable), HttpStatus.OK);
    }
    @GetMapping("{countryName}/{marketName}")
    public ResponseEntity<?> getListingsByCountryAndMarket(@PathVariable String countryName, @PathVariable String marketName, Pageable pageable){
        return new ResponseEntity<>(
                listingAndReviewRepository.findListingAndReviewByAddress_CountryAndAddress_Market(countryName, marketName, pageable),
                HttpStatus.OK);
    }
}
