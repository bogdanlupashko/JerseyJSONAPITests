package org.bl.json.rest.jersey.jerseyclient.jersey.rest.service;

import org.bl.json.rest.jersey.UserAgent;
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


    @PUT
    @Path("api/v1.4/user/profile")
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
    @Path("api/v1.4/user/agent")
    @Produces(MediaType.APPLICATION_JSON)
        //@Consumes("application/x-www-form-urlencoded")
    UserAgent userAgent(@QueryParam("token") String token);

}
