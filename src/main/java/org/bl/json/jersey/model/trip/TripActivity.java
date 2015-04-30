package org.bl.json.jersey.model.trip;

/**
 * @author Bogdan Lupashko
 */

public class TripActivity {
    private int id;
    private int tripId;
    private String type;
    private String name;
    private String dateTime;
    private TripData data;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTripId() {
        return tripId;
    }

    public void setTripId(int tripId) {
        this.tripId = tripId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public TripData getData() {
        return data;
    }

    public void setData(TripData data) {
        this.data = data;
    }
}
