package org.bl.json.jersey.model.category;

import org.bl.json.jersey.model.components.Category;
import org.bl.json.jersey.model.venue.Venue;
import org.codehaus.jackson.annotate.JsonIgnore;

import java.util.LinkedList;

/**
 * Created by blupashko on 17.04.2015.
 */
public class CategoryHomepage extends CategoryList{

    @JsonIgnore
    private Venue[] venues;

    private int venuesCount;

    public int getVenuesCount() {
        return venuesCount;
    }

    public void setVenuesCount(int venuesCount) {
        this.venuesCount = venuesCount;
    }

    public Venue[] getVenues() {
        return venues;
    }

    public void setVenues(Venue[] venues) {
        this.venues = venues;
    }
}
