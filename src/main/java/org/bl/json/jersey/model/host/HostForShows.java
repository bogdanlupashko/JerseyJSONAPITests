package org.bl.json.jersey.model.host;

/**
 * Created by blupashko on 26.06.2015.
 */
public class HostForShows extends HostSimple {

    private String photo;
    private String email;
    private int id;

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
