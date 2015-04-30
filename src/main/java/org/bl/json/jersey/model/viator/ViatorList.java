package org.bl.json.jersey.model.viator;

/**
 * @author Bogdan Lupashko
 */

public class ViatorList extends ViatorSimple {
    private String duration;
    private String location;
    private String description;
    private float priceDelta;
    private String url;
    private String reviewsUrl;
    private float rating;

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPriceDelta() {
        return priceDelta;
    }

    public void setPriceDelta(float priceDelta) {
        this.priceDelta = priceDelta;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getReviewsUrl() {
        return reviewsUrl;
    }

    public void setReviewsUrl(String reviewsUrl) {
        this.reviewsUrl = reviewsUrl;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }
}
