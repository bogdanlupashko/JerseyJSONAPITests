package org.bl.json.jersey.model.user;


import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Created by blupashko on 03.04.2015.
 */

@JsonIgnoreProperties(ignoreUnknown=true)
public class UserAgent {
    private Integer id;
    private String firstName;
    private String lastName;
    private String photo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
