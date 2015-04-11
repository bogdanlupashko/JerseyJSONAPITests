package org.bl.json.jersey.rest.service;

import org.bl.json.jersey.model.AuthLogin;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;


@Path("/")
public interface Venue {

    @POST
    @Path("api/v1.4/auth/login")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes("application/x-www-form-urlencoded")
    AuthLogin authLogin(@FormParam("email") String email, @FormParam("password") String password);

}
