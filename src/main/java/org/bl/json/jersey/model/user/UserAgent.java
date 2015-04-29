package org.bl.json.jersey.model.user;

/**
 * @author Bogdan Lupashko
 */

public class UserAgent {
    private Integer id;
    private String firstName;
    private String lastName;
    private String photo;

    @Override
    public String toString() {
        return "{id :\"" + id + "\", firstName :\"" + firstName + "\", lastName :\"" + lastName + "\", photo :\"" + photo + "\"}";
    }

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
