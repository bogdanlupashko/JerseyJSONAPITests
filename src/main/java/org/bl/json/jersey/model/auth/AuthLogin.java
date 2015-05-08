package org.bl.json.jersey.model.auth;

import org.bl.json.jersey.model.errors.Error;

/**
 * @author Bogdan Lupashko
 */

public class AuthLogin  {

    private String token;
    private Integer id;
    private Error errors;

    public Error getErrors() {
        return errors;
    }

    public void setErrors(Error errors) {
        this.errors = errors;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}