package com.javacodegeeks.enterprise.rest.jersey.jerseyclient.jersey.rest.service;

import com.javacodegeeks.enterprise.rest.jersey.UserProfile;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;


@Path("/")
public interface User {

    @GET
    @Path("api/v1.4/user/profile")
    @Produces(MediaType.APPLICATION_JSON)
    //@Consumes("application/x-www-form-urlencoded")
    UserProfile userProfile(@QueryParam("token") String token);

}
