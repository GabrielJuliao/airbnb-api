package com.gabrieljuliao.airbnbapi.model;

import lombok.Data;

import java.util.Date;
@Data
public class Review {
   private String _id;
   private Date date;
   private String listing_id;
   private String reviewer_id;
   private String reviewer_name;
   private String comments;
}
