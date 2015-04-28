package org.bl.json.jersey.rest.service;

import org.bl.json.jersey.client.JerseyClient;
import org.bl.json.jersey.model.venue.VenueItem;
import org.bl.json.jersey.model.venue.VenueList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.Map;


@Path("/")
public interface Venue {

    @GET
    @Path(JerseyClient.API_PREAMBLE +"venue/item")
    @Produces(MediaType.APPLICATION_JSON)
    VenueItem venueItem(@QueryParam("token") String token,
                        @QueryParam("id") int id);

    @GET
    @Path(JerseyClient.API_PREAMBLE + "venue/list")
    @Produces(MediaType.APPLICATION_JSON)
    VenueList[] venueList(@QueryParam("token") String token);

    @GET
    @Path(JerseyClient.API_PREAMBLE + "venue/backgroundUrl")
    @Produces(MediaType.APPLICATION_JSON)
    Map<String,String> venueBackgroundUrl(@QueryParam("token") String token,
                                    @QueryParam("venueId") int venueId);

}
