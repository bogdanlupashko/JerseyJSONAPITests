package org.bl.json.jersey.model.shows;

import java.util.Map;

import jdk.nashorn.internal.ir.annotations.Ignore;
import org.bl.json.jersey.model.host.HostForShows;
import org.codehaus.jackson.annotate.JsonIgnore;

/**
 * Created by blupashko on 25.06.2015.
 */
public class ShowsItem {
    private int id;
    private int hostId;
    private String category;
    private String type;
    private int providerId;
    private String title;
    private String description;
    private int pickUp;
    private int air;
    private String departurePoint;
    private int costType;
    private Float price;
    private Float priceOld;
    private String duration;
    private Float rating;
    private String thumb;
    private int userAgreement;
    private String specialRequirement;
    private String itemsToBring;
    private String finePrint;
    private String guestLimit;
    private int minGuests;
    private int maxGuests;
    private String createdAt;
    private String updatedAt;
    private String[] customData;
    private Map<String, String> mainImage;
    private Map<String, String>[] images;
    private HostForShows host;
    private Period[] periods;
    private Provider provider;

    public int getMinGuests() {
        return minGuests;
    }

    public void setMinGuests(int minGuests) {
        this.minGuests = minGuests;
    }

    public int getMaxGuests() {
        return maxGuests;
    }

    public void setMaxGuests(int maxGuests) {
        this.maxGuests = maxGuests;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGuestLimit() {
        return guestLimit;
    }

    public void setGuestLimit(String guestLimit) {
        this.guestLimit = guestLimit;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHostId() {
        return hostId;
    }

    public void setHostId(int hostId) {
        this.hostId = hostId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getProviderId() {
        return providerId;
    }

    public void setProviderId(int providerId) {
        this.providerId = providerId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPickUp() {
        return pickUp;
    }

    public void setPickUp(int pickUp) {
        this.pickUp = pickUp;
    }

    public int getAir() {
        return air;
    }

    public void setAir(int air) {
        this.air = air;
    }

    public String getDeparturePoint() {
        return departurePoint;
    }

    public void setDeparturePoint(String departurePoint) {
        this.departurePoint = departurePoint;
    }

    public int getCostType() {
        return costType;
    }

    public void setCostType(int costType) {
        this.costType = costType;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Float getPriceOld() {
        return priceOld;
    }

    public void setPriceOld(Float priceOld) {
        this.priceOld = priceOld;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Float getRating() {
        return rating;
    }

    public void setRating(Float rating) {
        this.rating = rating;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public int getUserAgreement() {
        return userAgreement;
    }

    public void setUserAgreement(int userAgreement) {
        this.userAgreement = userAgreement;
    }

    public String getSpecialRequirement() {
        return specialRequirement;
    }

    public void setSpecialRequirement(String specialRequirement) {
        this.specialRequirement = specialRequirement;
    }

    public String getItemsToBring() {
        return itemsToBring;
    }

    public void setItemsToBring(String itemsToBring) {
        this.itemsToBring = itemsToBring;
    }

    public String getFinePrint() {
        return finePrint;
    }

    public void setFinePrint(String finePrint) {
        this.finePrint = finePrint;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String[] getCustomData() {
        return customData;
    }

    public void setCustomData(String[] customData) {
        this.customData = customData;
    }

    public Map<String, String> getMainImage() {
        return mainImage;
    }

    public void setMainImage(Map<String, String> mainImage) {
        this.mainImage = mainImage;
    }

    public Map<String, String>[] getImages() {
        return images;
    }

    public void setImages(Map<String, String>[] images) {
        this.images = images;
    }

    public HostForShows getHost() {
        return host;
    }

    public void setHost(HostForShows host) {
        this.host = host;
    }

    public Period[] getPeriods() {
        return periods;
    }

    public void setPeriods(Period[] periods) {
        this.periods = periods;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }
}
