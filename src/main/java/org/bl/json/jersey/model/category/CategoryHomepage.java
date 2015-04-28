package org.bl.json.jersey.model.category;

import org.bl.json.jersey.model.venue.VenueForCategory;

/**
 * @author Bogdan Lupashko
 */
public class CategoryHomepage extends Category{

    private VenueForCategory[] venues;
    private int venuesCount;

    public int getVenuesCount() {
        return venuesCount;
    }

    public void setVenuesCount(int venuesCount) {
        this.venuesCount = venuesCount;
    }

    public VenueForCategory[] getVenues() {
        return venues;
    }

    public void setVenues(VenueForCategory[] venues) {
        this.venues = venues;
    }
}
