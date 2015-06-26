package org.bl.json.jersey.model.venue;

/**
 * @author Bogdan Lupashko
 */

public class VenueForCategory extends VenueSimple {

    private int promoted;
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPromoted() {
        return promoted;
    }

    public void setPromoted(int promoted) {
        this.promoted = promoted;
    }
}
