package org.bl.json.jersey.model.venue;

/**
 * @author Bogdan Lupashko
 */

public class VenueForCategory extends VenueSimple {

    private int promoted;

    public int getPromoted() {
        return promoted;
    }

    public void setPromoted(int promoted) {
        this.promoted = promoted;
    }
}
