package org.bl.json.jersey.model.components;

import java.util.LinkedList;

/**
 * Created by blupashko on 17.04.2015.
 */
public class Category {
    private int id;
    private String name;
    private LinkedList<Image> image = new LinkedList<Image>();
    private String type;
    private LinkedList<Venue> venues = new LinkedList<Venue>();
    private int venuesCount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LinkedList<Image> getImages() {
        return image;
    }

    public void setImages(LinkedList<Image> images) {
        this.image = images;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LinkedList<Venue> getVenues() {
        return venues;
    }

    public void setVenues(LinkedList<Venue> venues) {
        this.venues = venues;
    }

    public int getVenuesCount() {
        return venuesCount;
    }

    public void setVenuesCount(int venuesCount) {
        this.venuesCount = venuesCount;
    }
}
