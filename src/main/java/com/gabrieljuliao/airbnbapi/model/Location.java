package com.gabrieljuliao.airbnbapi.model;

import lombok.Data;

import java.util.ArrayList;

@Data
public class Location {
    private String type;
    private ArrayList<Double> coordinates = new ArrayList<>();
    private boolean is_location_exact;
}
