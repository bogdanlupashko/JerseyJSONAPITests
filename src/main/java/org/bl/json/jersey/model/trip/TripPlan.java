package org.bl.json.jersey.model.trip;

import java.util.Map;

/**
 * @author Bogdan Lupashko
 */

public class TripPlan {
    private int id;
    private int tripRequestId;
    private int venueId;
    private String venueName;
    private String label;
    private String purpose;
    private String time;
    private String pickUpTime;
    private boolean hasTransportation;
    private int transportationVenueId;
    private String transportationVenueName;
    private int malesCount;
    private int femalesCount;
    private int totalCost;
    private int userId;
    private String specialNotes;
    private String expireTime;
    private boolean hasAllInclusive;
    private Map<String, String[]> galleryImages;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTripRequestId() {
        return tripRequestId;
    }

    public void setTripRequestId(int tripRequestId) {
        this.tripRequestId = tripRequestId;
    }

    public int getVenueId() {
        return venueId;
    }

    public void setVenueId(int venueId) {
        this.venueId = venueId;
    }

    public String getVenueName() {
        return venueName;
    }

    public void setVenueName(String venueName) {
        this.venueName = venueName;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPickUpTime() {
        return pickUpTime;
    }

    public void setPickUpTime(String pickUpTime) {
        this.pickUpTime = pickUpTime;
    }

    public boolean isHasTransportation() {
        return hasTransportation;
    }

    public void setHasTransportation(boolean hasTransportation) {
        this.hasTransportation = hasTransportation;
    }

    public int getTransportationVenueId() {
        return transportationVenueId;
    }

    public void setTransportationVenueId(int transportationVenueId) {
        this.transportationVenueId = transportationVenueId;
    }

    public String getTransportationVenueName() {
        return transportationVenueName;
    }

    public void setTransportationVenueName(String transportationVenueName) {
        this.transportationVenueName = transportationVenueName;
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

    public int getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getSpecialNotes() {
        return specialNotes;
    }

    public void setSpecialNotes(String specialNotes) {
        this.specialNotes = specialNotes;
    }

    public String getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    public boolean isHasAllInclusive() {
        return hasAllInclusive;
    }

    public void setHasAllInclusive(boolean hasAllInclusive) {
        this.hasAllInclusive = hasAllInclusive;
    }

    public Map<String, String[]> getGalleryImages() {
        return galleryImages;
    }

    public void setGalleryImages(Map<String, String[]> galleryImages) {
        this.galleryImages = galleryImages;
    }
}
