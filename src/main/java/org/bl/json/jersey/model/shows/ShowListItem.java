package org.bl.json.jersey.model.shows;


import java.util.Map;
/**
 * Created by blupashko on 10.07.2015.
 */
public class ShowListItem {
    private String type;
    private int id;
    private String title;
    private Float price;
    private Float priceOld;
    private Float rating;
    private Map<String, String> mainImage;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

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

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Float getPriceOld() {
        return priceOld;
    }

    public void setPriceOld(Float priceOld) {
        this.priceOld = priceOld;
    }

    public Float getRating() {
        return rating;
    }

    public void setRating(Float rating) {
        this.rating = rating;
    }

    public Map<String, String> getMainImage() {
        return mainImage;
    }

    public void setMainImage(Map<String, String> mainImage) {
        this.mainImage = mainImage;
    }
}
