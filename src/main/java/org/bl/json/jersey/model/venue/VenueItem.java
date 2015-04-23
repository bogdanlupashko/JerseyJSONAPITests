package org.bl.json.jersey.model.venue;

import org.bl.json.jersey.model.components.*;

import java.util.ArrayList;

/**
 * Created by blupashko on 23.04.2015.
 */
public class VenueItem extends Venue {
    private String phone;
    private String opentableUrl;
    private int offersGuestCount;
    private int offersTableCount;
    private int offersBachelorGuysCount;
    private int offersBachelorGirlsCount;
    private int offersBachelorCount;
    private ArrayList<Images> galleryImages;
    private Schedule schedule;
    private ReminderRes reminderRes;
    private Plan plans;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getOpentableUrl() {
        return opentableUrl;
    }

    public void setOpentableUrl(String opentableUrl) {
        this.opentableUrl = opentableUrl;
    }

    public int getOffersGuestCount() {
        return offersGuestCount;
    }

    public void setOffersGuestCount(int offersGuestCount) {
        this.offersGuestCount = offersGuestCount;
    }

    public int getOffersTableCount() {
        return offersTableCount;
    }

    public void setOffersTableCount(int offersTableCount) {
        this.offersTableCount = offersTableCount;
    }

    public int getOffersBachelorGuysCount() {
        return offersBachelorGuysCount;
    }

    public void setOffersBachelorGuysCount(int offersBachelorGuysCount) {
        this.offersBachelorGuysCount = offersBachelorGuysCount;
    }

    public int getOffersBachelorGirlsCount() {
        return offersBachelorGirlsCount;
    }

    public void setOffersBachelorGirlsCount(int offersBachelorGirlsCount) {
        this.offersBachelorGirlsCount = offersBachelorGirlsCount;
    }

    public int getOffersBachelorCount() {
        return offersBachelorCount;
    }

    public void setOffersBachelorCount(int offersBachelorCount) {
        this.offersBachelorCount = offersBachelorCount;
    }

    public ArrayList<Images> getGalleryImages() {
        return galleryImages;
    }

    public void setGalleryImages(ArrayList<Images> galleryImages) {
        this.galleryImages = galleryImages;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public ReminderRes getReminderRes() {
        return reminderRes;
    }

    public void setReminderRes(ReminderRes reminderRes) {
        this.reminderRes = reminderRes;
    }

    public Plan getPlans() {
        return plans;
    }

    public void setPlans(Plan plans) {
        this.plans = plans;
    }
}
