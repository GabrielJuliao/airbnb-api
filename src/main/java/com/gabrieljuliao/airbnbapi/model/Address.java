package com.gabrieljuliao.airbnbapi.model;

import lombok.Data;

@Data
public class Address {
   private String street;
   private String suburb;
   private String government_area;
   private String market;
   private String country;
   private String country_code;
   private Location location;
}
