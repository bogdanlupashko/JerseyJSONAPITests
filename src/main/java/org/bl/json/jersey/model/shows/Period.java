package org.bl.json.jersey.model.shows;

/**
 * Created by blupashko on 26.06.2015.
 */
public class Period{
    private int id;
    private int showTourId;
    private String date;
    private String time;
    private String dateTimestamp;
    private String dateTimeTimestamp;
    private int offerLimit;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getShowTourId() {
        return showTourId;
    }

    public void setShowTourId(int showTourId) {
        this.showTourId = showTourId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDateTimestamp() {
        return dateTimestamp;
    }

    public void setDateTimestamp(String dateTimestamp) {
        this.dateTimestamp = dateTimestamp;
    }

    public String getDateTimeTimestamp() {
        return dateTimeTimestamp;
    }

    public void setDateTimeTimestamp(String dateTimeTimestamp) {
        this.dateTimeTimestamp = dateTimeTimestamp;
    }

    public int getOfferLimit() {
        return offerLimit;
    }

    public void setOfferLimit(int offerLimit) {
        this.offerLimit = offerLimit;
    }
}
