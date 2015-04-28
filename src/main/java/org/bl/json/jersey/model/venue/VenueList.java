package org.bl.json.jersey.model.venue;

import java.util.Map;

/**
 * Created by blupashko on 23.04.2015.
 */
public class VenueList extends VenueForCategory {

    private String description;
    private float lat;
    private float lng;
    private float rating;
    private int minOffer;
    private int open24h;
    private String status;
    private Map<String, String> background;
    private Map<String, String> pin;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getLat() {
        return lat;
    }

    public void setLat(float lat) {
        this.lat = lat;
    }

    public float getLng() {
        return lng;
    }

    public void setLng(float lng) {
        this.lng = lng;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public int getMinOffer() {
        return minOffer;
    }

    public void setMinOffer(int minOffer) {
        this.minOffer = minOffer;
    }

    public int getOpen24h() {
        return open24h;
    }

    public void setOpen24h(int open24h) {
        this.open24h = open24h;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Map<String, String> getBackground() {
        return background;
    }

    public void setBackground(Map<String, String> background) {
        this.background = background;
    }

    public Map<String, String> getPin() {
        return pin;
    }

    public void setPin(Map<String, String> pin) {
        this.pin = pin;
    }
}