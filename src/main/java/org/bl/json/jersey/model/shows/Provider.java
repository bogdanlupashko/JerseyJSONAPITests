package org.bl.json.jersey.model.shows;

import org.bl.json.jersey.model.host.HostForShows;

/**
 * Created by blupashko on 26.06.2015.
 */
public class Provider{

    private int id;
    private int display;
    private String title;
    private String phone;
    private String url;
    private Float rating;
    private String ratingDisplay;
    private int top100Ranking;
    private String description;
    private String address;
    private Float lat;
    private Float lng;
    private Float zoom;
    private Boolean thumb;
    private Boolean pending;
    private String createdAt;
    private String updatedAt;
    private HostForShows[] hosts;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDisplay() {
        return display;
    }

    public void setDisplay(int display) {
        this.display = display;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Float getRating() {
        return rating;
    }

    public void setRating(Float rating) {
        this.rating = rating;
    }

    public String getRatingDisplay() {
        return ratingDisplay;
    }

    public void setRatingDisplay(String ratingDisplay) {
        this.ratingDisplay = ratingDisplay;
    }

    public int getTop100Ranking() {
        return top100Ranking;
    }

    public void setTop100Ranking(int top100Ranking) {
        this.top100Ranking = top100Ranking;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Float getLat() {
        return lat;
    }

    public void setLat(Float lat) {
        this.lat = lat;
    }

    public Float getLng() {
        return lng;
    }

    public void setLng(Float lng) {
        this.lng = lng;
    }

    public Float getZoom() {
        return zoom;
    }

    public void setZoom(Float zoom) {
        this.zoom = zoom;
    }

    public Boolean getThumb() {
        return thumb;
    }

    public void setThumb(Boolean thumb) {
        this.thumb = thumb;
    }

    public Boolean getPending() {
        return pending;
    }

    public void setPending(Boolean pending) {
        this.pending = pending;
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
}
