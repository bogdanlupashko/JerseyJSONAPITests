package org.bl.json.jersey.rest.service;

import org.bl.json.jersey.client.JerseyClient;
import org.bl.json.jersey.model.user.UserAgent;
import org.bl.json.jersey.model.user.UserProfile;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;


@Path("/")
public interface User {

    @GET
    @Path(JerseyClient.API_PATH + JerseyClient.VERSION_API_PATH +"user/profile")
    @Produces(MediaType.APPLICATION_JSON)
        //@Consumes("application/x-www-form-urlencoded")
    UserProfile userProfile(@QueryParam("token") String token);


    @PUT
    @Path(JerseyClient.API_PATH + JerseyClient.VERSION_API_PATH +"user/profile")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes("application/x-www-form-urlencoded")
    UserProfile userProfile(@FormParam("token") String token,
                        @FormParam("email") String email,
                        @FormParam("passwordRaw") String passwordRaw,
                        @FormParam("passwordRepeat") String passwordRepeat,
                        @FormParam("phone") String phone,
                        @FormParam("firstName") String firstName,
                        @FormParam("lastName") String lastName,
                        @FormParam("leaveDate") String leaveDate,
                        @FormParam("flightTime") String flightTime);


    @GET
    @Path(JerseyClient.API_PATH + JerseyClient.VERSION_API_PATH +"user/agent")
    @Produces(MediaType.APPLICATION_JSON)
        //@Consumes("application/x-www-form-urlencoded")
    UserAgent userAgent(@QueryParam("token") String token);

}