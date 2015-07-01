package org.bl.json.jersey.model.notification;

/**
 * @author Bogdan Lupashko
 */
public class NotificationItem {
    private int id;
    private String message;
    private String venueName;
    private String date;
    private boolean read;
    private int reservationId;
    private String reservationStatus;
    private String requestStatus;
    private int venueId;
    private String type;
    private String titleAlt;
    private int  hostId;

     public String getTitleAlt() {
        return titleAlt;
    }

    public void setTitleAlt(String titleAlt) {
        this.titleAlt = titleAlt;
    }

    public int getHostId() {
        return hostId;
    }

    public void setHostId(int hostId) {
        this.hostId = hostId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getVenueName() {
        return venueName;
    }

    public void setVenueName(String venueName) {
        this.venueName = venueName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean getRead() {
        return read;
    }

    public void setRead(Object read) {
        if (read instanceof Boolean) {
            this.read = (Boolean)read;
        } else if (read instanceof Integer){
            this.read = ((Integer) read).equals(1);
        }
    }

    public int getReservationId() {
        return reservationId;
    }

    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }

    public String getReservationStatus() {
        return reservationStatus;
    }

    public void setReservationStatus(String reservationStatus) {
        this.reservationStatus = reservationStatus;
    }

    public String getRequestStatus() {
        return requestStatus;
    }

    public void setRequestStatus(String requestStatus) {
        this.requestStatus = requestStatus;
    }

    public int getVenueId() {
        return venueId;
    }

    public void setVenueId(int venueId) {
        this.venueId = venueId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
