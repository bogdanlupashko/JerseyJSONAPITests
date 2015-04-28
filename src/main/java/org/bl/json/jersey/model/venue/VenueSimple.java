package org.bl.json.jersey.model.venue;

import java.util.Map;

/**
 * @author Bogdan Lupashko
 */

public class VenueSimple {
    private int id;
    private int categoryId;
    private String name;
    private Map<String, String> image;

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

    public Map<String, String> getImage() {
        return image;
    }

    public void setImage(Map<String, String> image) {
        this.image = image;
    }
}
