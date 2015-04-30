package org.bl.json.jersey.model.viator;

/**
 * @author Bogdan Lupashko
 */

public class ViatorItem extends ViatorSimple {
    private float rate;
    private  String categoryName;

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
