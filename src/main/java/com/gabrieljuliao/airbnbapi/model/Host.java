package com.gabrieljuliao.airbnbapi.model;

import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
public class Host {
    private Long host_id;
    private String host_url;
    private String host_name;
    private String host_location;
    private String host_about;
    private String host_response_time;
    private String host_thumbnail_url;
    private String host_picture_url;
    private String host_neighbourhood;
    private int host_response_rate;
    private boolean host_is_superhost;
    private boolean host_has_profile_pic;
    private boolean host_identity_verified;
    private int host_listings_count;
    private int host_total_listings_count;
    private Set<String> host_verifications = new HashSet<>();
}
