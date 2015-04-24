package org.bl.json.jersey.rest.service;

import org.bl.json.jersey.client.JerseyClient;
import org.bl.json.jersey.model.auth.AuthLogin;
import org.bl.json.jersey.model.auth.AuthLogout;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/")
public interface Auth {

    @POST
    @Path(JerseyClient.API_PATH + JerseyClient.VERSION_API_PATH +"auth/login")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes("application/x-www-form-urlencoded")
    AuthLogin authLogin(@FormParam("email") String email, @FormParam("password") String password);


    @POST
    @Path(JerseyClient.API_PATH + JerseyClient.VERSION_API_PATH +"auth/logout")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes("application/x-www-form-urlencoded")
    String authLogout(@FormParam("token") String token);

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
