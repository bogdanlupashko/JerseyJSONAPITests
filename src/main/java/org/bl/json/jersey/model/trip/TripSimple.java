package org.bl.json.jersey.model.trip;

/**
 * @author Bogdan Lupashko
 */

public class TripSimple {
    private int id;
    private int userId;
    private String name;
    private int type;
    private int tripSyncId;
    private int tripRequestId;
    private int tripPlanId;
    private int dateTime;
    private String date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getTripSyncId() {
        return tripSyncId;
    }

    public void setTripSyncId(int tripSyncId) {
        this.tripSyncId = tripSyncId;
    }

    public int getTripRequestId() {
        return tripRequestId;
    }

    public void setTripRequestId(int tripRequestId) {
        this.tripRequestId = tripRequestId;
    }

    public int getTripPlanId() {
        return tripPlanId;
    }

    public void setTripPlanId(int tripPlanId) {
        this.tripPlanId = tripPlanId;
    }

    public int getDateTime() {
        return dateTime;
    }

    public void setDateTime(int dateTime) {
        this.dateTime = dateTime;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
