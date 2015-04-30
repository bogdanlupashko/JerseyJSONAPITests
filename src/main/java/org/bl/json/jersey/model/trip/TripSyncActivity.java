package org.bl.json.jersey.model.trip;

/**
 * @author Bogdan Lupashko
 */

public class TripSyncActivity {
    private int id;
    private int type;
    private String dateTime;
    private int venueId;
    private int tripSyncId;
    private String name;
    private String background;
    private TripAdditionalFields[] additionalFields;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public int getVenueId() {
        return venueId;
    }

    public void setVenueId(int venueId) {
        this.venueId = venueId;
    }

    public int getTripSyncId() {
        return tripSyncId;
    }

    public void setTripSyncId(int tripSyncId) {
        this.tripSyncId = tripSyncId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public TripAdditionalFields[] getAdditionalFields() {
        return additionalFields;
    }

    public void setAdditionalFields(TripAdditionalFields[] additionalFields) {
        this.additionalFields = additionalFields;
    }
}
