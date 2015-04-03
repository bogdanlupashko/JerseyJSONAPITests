package org.bl.json.rest.jersey.jerseyclient.jersey.rest.service;

import org.bl.json.rest.jersey.UserProfile;

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
