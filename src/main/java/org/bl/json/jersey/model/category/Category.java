package org.bl.json.jersey.model.category;

import java.util.Map;

/**
 * @author Bogdan Lupashko
 */

public class Category {
    private int id;
    private String name;
    private Map<String, String> image;
    private String type;

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

    public Map<String, String> getImage() {
        return image;
    }

    public void setImage(Map<String, String> image) {
        this.image = image;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
