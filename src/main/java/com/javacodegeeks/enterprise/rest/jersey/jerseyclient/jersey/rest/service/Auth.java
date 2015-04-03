package com.javacodegeeks.enterprise.rest.jersey.jerseyclient.jersey.rest.service;

import com.javacodegeeks.enterprise.rest.jersey.AuthLogin;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;


@Path("/")
public interface Auth {

    @POST
    @Path("api/v1.4/auth/login")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes("application/x-www-form-urlencoded")
    AuthLogin authLogin(@FormParam("email") String email, @FormParam("password") String password);

}
