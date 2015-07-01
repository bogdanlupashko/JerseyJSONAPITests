package org.bl.json.jersey.model.host;

import java.util.Map;

/**
 * Created by blupashko on 26.06.2015.
 */
public class HostList extends HostSimple {
    private int id;
    private String email;
    private String role;
    private String gender;
    private Map<String, String> photo;
    private String facebookId;
    private String twitterId;
    private String googleId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Map<String, String> getPhoto() {
        return photo;
    }

    public void setPhoto(Map<String, String> photo) {
        this.photo = photo;
    }

    public String getFacebookId() {
        return facebookId;
    }

    public void setFacebookId(String facebookId) {
        this.facebookId = facebookId;
    }

    public String getTwitterId() {
        return twitterId;
    }

    public void setTwitterId(String twitterId) {
        this.twitterId = twitterId;
    }

    public String getGoogleId() {
        return googleId;
    }

    public void setGoogleId(String googleId) {
        this.googleId = googleId;
    }
}
