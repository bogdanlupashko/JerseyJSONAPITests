package org.bl.json.jersey.model.category;


/**
 * @author Bogdan Lupashko
 */

public class CategoryList extends Category {

    private boolean defaultMap;
    private String pinColor;

    public boolean isDefaultMap() {
        return defaultMap;
    }

    public void setDefaultMap(Object defaultMap) {
        if (defaultMap instanceof Boolean) {
            this.defaultMap = (Boolean)defaultMap;
        } else if (defaultMap instanceof Integer){
            this.defaultMap = ((Integer) defaultMap).equals(1);
        }
    }

    public String getPinColor() {
        return pinColor;
    }

    public void setPinColor(String pinColor) {
        this.pinColor = pinColor;
    }
}
