package org.bl.json.jersey.rest.service;

import org.bl.json.jersey.model.auth.AuthLogin;
import org.bl.json.jersey.model.auth.AuthLogout;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;


@Path("/")
public interface Auth {

    @POST
    @Path("api/v1.4/auth/login")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes("application/x-www-form-urlencoded")
    AuthLogin authLogin(@FormParam("email") String email, @FormParam("password") String password);


    @POST
    @Path("api/v1.4/auth/logout")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes("application/x-www-form-urlencoded")
    AuthLogout authLogout(@FormParam("token") String token);

//
//    @POST
//    @Path("api/v1.4/auth/login")
//    @Produces(MediaType.APPLICATION_JSON)
//    @Consumes("application/x-www-form-urlencoded")
//    AuthLogin authLogin(@FormParam("email") String email, @FormParam("password") String password);
//
//    @POST
//    @Path("api/v1.4/auth/login")
//    @Produces(MediaType.APPLICATION_JSON)
//    @Consumes("application/x-www-form-urlencoded")
//    AuthLogin authLogin(@FormParam("email") String email, @FormParam("password") String password);
}
