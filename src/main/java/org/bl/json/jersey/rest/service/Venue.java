package org.bl.json.jersey.rest.service;

import org.bl.json.jersey.client.JerseyClient;
import org.bl.json.jersey.model.auth.AuthLogin;
import org.bl.json.jersey.model.venue.VenueBackground;
import org.bl.json.jersey.model.venue.VenueItem;
import org.bl.json.jersey.model.venue.VenueList;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;


@Path("/")
public interface Venue {

    @GET
    @Path(JerseyClient.API_PATH + JerseyClient.VERSION_API_PATH +"/venue/item")
    @Produces(MediaType.APPLICATION_JSON)
    VenueItem venueItem(@QueryParam("token") String token,
                        @QueryParam("id") int id);

    @GET
    @Path(JerseyClient.API_PATH + JerseyClient.VERSION_API_PATH + "/venue/list")
    @Produces(MediaType.APPLICATION_JSON)
    VenueList venueList(@QueryParam("token") String token);

    @GET
    @Path(JerseyClient.API_PATH + JerseyClient.VERSION_API_PATH + "/venue/background")
    @Produces(MediaType.APPLICATION_JSON)
    VenueBackground venueBackground(@QueryParam("token") String token,
                                    @QueryParam("venueId") int venueId);




}
