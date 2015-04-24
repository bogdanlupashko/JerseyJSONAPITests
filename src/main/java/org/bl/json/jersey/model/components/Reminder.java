package org.bl.json.jersey.model.components;

import java.util.LinkedList;

/**
 * Created by blupashko on 17.04.2015.
 */
public class Reminder {
    private String type;
    private String venueName;
    private String venueLat;
    private String venueLng;
    private int venueId;
    private int reservationGuestsCount;
    private String reservationReservedDateTime;
    private String reservationStatus;
    private int reservationId;
    private String reminderDateTime;
    private String addedDateTime;
    private int interval;
    private int offerId;
    private boolean shared;
    private String ownerName;
    private LinkedList<Image> venueImage;

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

    public String getReminderDateTime() {
        return reminderDateTime;
    }

    public void setReminderDateTime(String reminderDateTime) {
        this.reminderDateTime = reminderDateTime;
    }

    public String getAddedDateTime() {
        return addedDateTime;
    }

    public void setAddedDateTime(String addedDateTime) {
        this.addedDateTime = addedDateTime;
    }

    public int getInterval() {
        return interval;
    }

    public void setInterval(int interval) {
        this.interval = interval;
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

    public void setShared(boolean shared) {
        this.shared = shared;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public LinkedList<Image> getVenueImage() {
        return venueImage;
    }

    public void setVenueImage(LinkedList<Image> venueImage) {
        this.venueImage = venueImage;
    }
}