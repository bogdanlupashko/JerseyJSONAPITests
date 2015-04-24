package org.bl.json.jersey.model.components;

import org.apache.commons.lang.text.StrTokenizer;

import java.util.ArrayList;
import java.util.Map;

/**
 * Created by blupashko on 23.04.2015.
 */
public class HostRes {
    private String firstName;
    private String lastName;
    private String phone;
    private Map<String, String> photo;
    private String rating;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Map<String, String> getPhoto() {
        return photo;
    }

    public void setPhoto(Map<String, String> photo) {
        this.photo = photo;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}
