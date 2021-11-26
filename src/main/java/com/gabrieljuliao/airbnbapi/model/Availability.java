package com.gabrieljuliao.airbnbapi.model;

import lombok.Data;

@Data
public class Availability {
    private int availability_30;
    private int availability_60;
    private int availability_90;
    private int availability_365;
}
