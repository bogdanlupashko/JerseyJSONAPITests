package org.bl.json.jersey.model.category;

import org.bl.json.jersey.model.components.Image;

import java.util.LinkedList;

/**
 * Created by blupashko on 17.04.2015.
 */
public class CategoryList {
    private int id;
    private String name;
    private LinkedList<Image> image;
    private String type;
    private boolean defaultMap;
    private String pinColor;

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

    public LinkedList<Image> getImage() {
        return image;
    }

    public void setImage(LinkedList<Image> image) {
        this.image = image;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isDefaultMap() {
        return defaultMap;
    }

    public void setDefaultMap(boolean defaultMap) {
        this.defaultMap = defaultMap;
    }

    public String getPinColor() {
        return pinColor;
    }

    public void setPinColor(String pinColor) {
        this.pinColor = pinColor;
    }
}
