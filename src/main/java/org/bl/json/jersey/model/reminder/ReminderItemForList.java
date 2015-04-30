package org.bl.json.jersey.model.reminder;

import java.util.Map;

/**
 * @author Bogdan Lupashko
 */
public class ReminderItemForList extends ReminderSimple {

    private String type;
    private String venueName;
    private String venueLat;
    private String venueLng;
    private int venueId;
    private int reservationGuestsCount;
    private String reservationReservedDateTime;
    private String reservationStatus;
    private int reservationId;
    private int offerId;
    private boolean shared;
    private String ownerName;
    private Map<String, String> venueImage;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVenueName() {
        return venueName;
    }

    public void setVenueName(String venueName) {
        this.venueName = venueName;
    }

    public String getVenueLat() {
        return venueLat;
    }

    public void setVenueLat(String venueLat) {
        this.venueLat = venueLat;
    }

    public String getVenueLng() {
        return venueLng;
    }

    public void setVenueLng(String venueLng) {
        this.venueLng = venueLng;
    }

    public int getVenueId() {
        return venueId;
    }

    public void setVenueId(int venueId) {
        this.venueId = venueId;
    }

    public int getReservationGuestsCount() {
        return reservationGuestsCount;
    }

    public void setReservationGuestsCount(int reservationGuestsCount) {
        this.reservationGuestsCount = reservationGuestsCount;
    }

    public String getReservationReservedDateTime() {
        return reservationReservedDateTime;
    }

    public void setReservationReservedDateTime(String reservationReservedDateTime) {
        this.reservationReservedDateTime = reservationReservedDateTime;
    }

    public String getReservationStatus() {
        return reservationStatus;
    }

    public void setReservationStatus(String reservationStatus) {
        this.reservationStatus = reservationStatus;
    }

    public int getReservationId() {
        return reservationId;
    }

    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }

    public int getOfferId() {
        return offerId;
    }

    public void setOfferId(int offerId) {
        this.offerId = offerId;
    }

    public boolean isShared() {
        return shared;
    }

    public void setShared(Object shared) {
        if (shared instanceof Boolean) {
            this.shared = (Boolean)shared;
        } else if (shared instanceof Integer){
            this.shared = ((Integer) shared).equals(1);
        }
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public  Map<String, String> getVenueImage() {
        return venueImage;
    }

    public void setVenueImage( Map<String, String> venueImage) {
        this.venueImage = venueImage;
    }
}