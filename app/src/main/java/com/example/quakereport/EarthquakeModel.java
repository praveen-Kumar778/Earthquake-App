package com.example.quakereport;

public class EarthquakeModel {
    private double magnitude ;
    private String location ;
    private long timeInMillis ;
    private String mUrl;

    public String getmUrl() {
        return mUrl;
    }

    public double getMagnitude() {
        return magnitude;
    }

    public String getLocation() {
        return location;
    }

    public long getTimeInMillis() {
        return timeInMillis;
    }

    public EarthquakeModel(double magnitude, String location, long timeInMillis,String url) {
        this.magnitude = magnitude;
        this.location = location;
        this.timeInMillis = timeInMillis;
        this.mUrl = url ;
    }
}
