package org.bl.json.jersey.rest.service;

import org.bl.json.jersey.client.JerseyClient;
import org.bl.json.jersey.model.user.UserAgent;
import org.bl.json.jersey.model.user.UserProfile;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import java.io.File;

/**
 * @author Bogdan Lupashko
 */

@Path(JerseyClient.API_PREAMBLE + "user/")
public interface User {

    @GET
    @Path("profile")
    @Produces(MediaType.APPLICATION_JSON)
    UserProfile userProfile(@QueryParam("token") String token) throws WebApplicationException;

    @PUT
    @Path("profile")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes("application/x-www-form-urlencoded")
    String userProfile(@FormParam("token") String token,
                            @FormParam("email") String email,
                            @FormParam("passwordRaw") String passwordRaw,
                            @FormParam("passwordRepeat") String passwordRepeat,
                            @FormParam("phone") String phone,
                            @FormParam("firstName") String firstName,
                            @FormParam("lastName") String lastName,
                            @FormParam("leaveDate") String leaveDate,
                            @FormParam("flightTime") String flightTime) throws WebApplicationException;

    @POST
    @Path("photo")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes("application/x-www-form-urlencoded")
    String userPhotoSet(@FormParam("token") String token,
                        @FormParam("file") File file) throws WebApplicationException;

    @DELETE
    @Path("photo")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes("application/x-www-form-urlencoded")
    String userPhotoDelete(@FormParam("token") String token,
                           @FormParam("file") File file) throws WebApplicationException;

    @POST
    @Path("social")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes("application/x-www-form-urlencoded")
    String userSocialsLink(@FormParam("token") String token,
                           @FormParam("provider") String provider,
                           @FormParam("tokenProvider") String tokenProvider) throws WebApplicationException;

    @DELETE
    @Path("social")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes("application/x-www-form-urlencoded")
    String userSocialsLinkDelete(@FormParam("token") String token,
                                 @FormParam("provider") String provider) throws WebApplicationException;

    @PUT
    @Path("affiliate")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes("application/x-www-form-urlencoded")
    String userAffiliateSet(@FormParam("token") String token,
                            @FormParam("code") String code) throws WebApplicationException;

    @POST
    @Path("track")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes("application/x-www-form-urlencoded")
    String userTrack(@FormParam("token") String token,
                     @FormParam("lat") float lat,
                     @FormParam("lng") float lng) throws WebApplicationException;

    @GET
    @Path("agent")
    @Produces(MediaType.APPLICATION_JSON)
    UserAgent userAgent(@QueryParam("token") String token) throws WebApplicationException;

}
