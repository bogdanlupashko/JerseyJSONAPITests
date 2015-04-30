package org.bl.json.jersey.model.trip;

/**
 * @author Bogdan Lupashko
 */

public class TripRequest {
    private int id;
    private int tripPlanId;
    private int status;
    private int dateTime;
    private int travelType;
    private int[] categories;
    private int malesCount;
    private int femalesCount;
    private int budget;
    private int costType;
    private String note;
    private int userId;
    private String date;
    private TripPlan[] tripPlans;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTripPlanId() {
        return tripPlanId;
    }

    public void setTripPlanId(int tripPlanId) {
        this.tripPlanId = tripPlanId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getDateTime() {
        return dateTime;
    }

    public void setDateTime(int dateTime) {
        this.dateTime = dateTime;
    }

    public int getTravelType() {
        return travelType;
    }

    public void setTravelType(int travelType) {
        this.travelType = travelType;
    }

    public int[] getCategories() {
        return categories;
    }

    public void setCategories(int[] categories) {
        this.categories = categories;
    }

    public int getMalesCount() {
        return malesCount;
    }

    public void setMalesCount(int malesCount) {
        this.malesCount = malesCount;
    }

    public int getFemalesCount() {
        return femalesCount;
    }

    public void setFemalesCount(int femalesCount) {
        this.femalesCount = femalesCount;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public int getCostType() {
        return costType;
    }

    public void setCostType(int costType) {
        this.costType = costType;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public TripPlan[] getTripPlans() {
        return tripPlans;
    }

    public void setTripPlans(TripPlan[] tripPlans) {
        this.tripPlans = tripPlans;
    }
}
