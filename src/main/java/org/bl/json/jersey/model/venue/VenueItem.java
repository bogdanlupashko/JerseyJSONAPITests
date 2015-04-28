package org.bl.json.jersey.model.venue;

import org.bl.json.jersey.model.components.*;
import org.codehaus.jackson.annotate.JsonIgnore;

import java.util.Map;

/**
 * Created by blupashko on 23.04.2015.
 */
public class VenueItem {
    private int id;
    private String name;
    private int categoryId;
    private String description;
    private float lat;
    private float lng;
    private int promoted;
    private float rating;
    private String phone;
    private String opentableUrl;
    private int offersGuestCount;
    private int offersTableCount;
    private int offersBachelorGuysCount;
    private int offersBachelorGirlsCount;
    private int offersBachelorCount;
    private Map<String, String[]> galleryImages;
    private Map<String, String> image;
    @JsonIgnore
    private Schedule schedule;
    private int open24h;
    private Map<String, String> pin;
    private String[] plans;
    private ReminderRes reminder;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getLat() {
        return lat;
    }

    public void setLat(float lat) {
        this.lat = lat;
    }

    public float getLng() {
        return lng;
    }

    public void setLng(float lng) {
        this.lng = lng;
    }

    public int getPromoted() {
        return promoted;
    }

    public void setPromoted(int promoted) {
        this.promoted = promoted;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

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

    public Map<String, String[]> getGalleryImages() {
        return galleryImages;
    }

    public void setGalleryImages(Map<String, String[]> galleryImages) {
        this.galleryImages = galleryImages;
    }

    public Map<String, String> getImage() {
        return image;
    }

    public void setImage(Map<String, String> image) {
        this.image = image;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public int isOpen24h() {
        return open24h;
    }

    public void setOpen24h(int open24h) {
        this.open24h = open24h;
    }

    public Map<String, String> getPin() {
        return pin;
    }

    public void setPin(Map<String, String> pin) {
        this.pin = pin;
    }

    public String[] getPlans() {
        return plans;
    }

    public void setPlans(String[] plans) {
        this.plans = plans;
    }

    public ReminderRes getReminder() {
        return reminder;
    }

    public void setReminder(ReminderRes reminder) {
        this.reminder = reminder;
    }
}
