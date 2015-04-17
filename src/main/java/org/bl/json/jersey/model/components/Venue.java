package org.bl.json.jersey.model.components;

import java.util.LinkedList;

/**
 * Created by blupashko on 17.04.2015.
 */
public class Venue {
    private int id;
    private int categoryId;
    private String name;
    private int promoted;
    private LinkedList<Image> image = new LinkedList<Image>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPromoted() {
        return promoted;
    }

    public void setPromoted(int promoted) {
        this.promoted = promoted;
    }

    public LinkedList<Image> getImage() {
        return image;
    }

    public void setImage(LinkedList<Image> image) {
        this.image = image;
    }
}
