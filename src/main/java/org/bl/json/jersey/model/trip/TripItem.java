package org.bl.json.jersey.model.trip;

/**
 * @author Bogdan Lupashko
 */

public class TripItem extends TripSimple {
    private TripActivity[] activities;

    public TripActivity[] getActivities() {
        return activities;
    }

    public void setActivities(TripActivity[] activities) {
        this.activities = activities;
    }
}
