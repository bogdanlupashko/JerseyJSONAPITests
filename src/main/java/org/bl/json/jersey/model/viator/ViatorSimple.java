package org.bl.json.jersey.model.viator;

import java.util.Map;

/**
 * @author Bogdan Lupashko
 */

public class ViatorSimple {
    private int id;
    private String title;
    private int reviewsCount;
    private float price;
    private Map<String, String> imageUrl;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReviewsCount() {
        return reviewsCount;
    }

    public void setReviewsCount(int reviewsCount) {
        this.reviewsCount = reviewsCount;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Map<String, String> getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(Map<String, String> imageUrl) {
        this.imageUrl = imageUrl;
    }
}
