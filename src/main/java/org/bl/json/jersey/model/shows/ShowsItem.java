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
    private String category;
    private int providerId;
    private String title;
    private String image;
    private String description;
    private int pickUp;
    private int air;
    private String departurePoint;
    private int costType;
    private Float price;
    private Float salePrice;
    private String duration;
    private Float rating;
    private String itemsToBring;
    private String finePrint;
    private String createdAt;
    private String updatedAt;
    private HostForShows[] hosts;
    private Period[] periods;
    private String thumb;
    private int userAgreement;
    private String specialRequirement;
    @JsonIgnore
    private String customData;
    private Map<String, String> mainImage;
    private Map<String, String>[] images;
    private Provider provider;

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public Map<String, String>[] getImages() {
        return images;
    }

    public void setImages(Map<String, String>[] images) {
        this.images = images;
    }

    public Map<String, String> getMainImage() {
        return mainImage;
    }

    public void setMainImage(Map<String, String> mainImage) {
        this.mainImage = mainImage;
    }

    public String getCustomData() {
        return customData;
    }

    public void setCustomData(String customData) {
        this.customData = customData;
    }

    public String getSpecialRequirement() {
        return specialRequirement;
    }

    public void setSpecialRequirement(String specialRequirement) {
        this.specialRequirement = specialRequirement;
    }

    public int getUserAgreement() {
        return userAgreement;
    }

    public void setUserAgreement(int userAgreement) {
        this.userAgreement = userAgreement;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public void setProviderId(int provider) {
        this.providerId = providerId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
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

    public Float getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Float salePrice) {
        this.salePrice = salePrice;
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

    public HostForShows[] getHosts() {
        return hosts;
    }

    public void setHosts(HostForShows[] hosts) {
        this.hosts = hosts;
    }

    public Period[] getPeriods() {
        return periods;
    }

    public void setPeriods(Period[] periods) {
        this.periods = periods;
    }





}
