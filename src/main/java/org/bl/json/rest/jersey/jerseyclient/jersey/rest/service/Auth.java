package org.bl.json.rest.jersey.jerseyclient.jersey.rest.service;

import org.bl.json.rest.jersey.AuthLogin;
import org.bl.json.rest.jersey.AuthLogout;

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
