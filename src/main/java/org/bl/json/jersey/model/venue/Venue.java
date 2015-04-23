package org.bl.json.jersey.model.venue;

import org.bl.json.jersey.model.components.Image;

import java.util.ArrayList;

/**
 * Created by blupashko on 23.04.2015.
 */
public class Venue {
    private int id;
    private String name;
    private int categoryId;
    private String description;
    private float lat;
    private float lng;
    private int promoted;
    private float rating;
    private int open24h;
    private String status;
    private ArrayList<Image> image;
    private ArrayList<Image> background;
    private ArrayList<Image> pin;

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

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

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

    public int getPromoted() {
        return promoted;
    }

    public void setPromoted(int promoted) {
        this.promoted = promoted;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
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

    public ArrayList<Image> getImage() {
        return image;
    }

    public void setImage(ArrayList<Image> image) {
        this.image = image;
    }

    public ArrayList<Image> getBackground() {
        return background;
    }

    public void setBackground(ArrayList<Image> background) {
        this.background = background;
    }

    public ArrayList<Image> getPin() {
        return pin;
    }

    public void setPin(ArrayList<Image> pin) {
        this.pin = pin;
    }
}
