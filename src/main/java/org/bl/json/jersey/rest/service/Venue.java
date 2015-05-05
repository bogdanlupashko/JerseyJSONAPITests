package org.bl.json.jersey.rest.service;

import org.bl.json.jersey.client.JerseyClient;
import org.bl.json.jersey.model.venue.VenueGalery;
import org.bl.json.jersey.model.venue.VenueItem;
import org.bl.json.jersey.model.venue.VenueList;
import org.bl.json.jersey.model.venue.VenueMap;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.Map;

/**
 * @author Bogdan Lupashko
 */

@Path(JerseyClient.API_PREAMBLE + "venue/")
public interface Venue {

    @GET
    @Path("list")
    @Produces(MediaType.APPLICATION_JSON)
    VenueList[] venueList(@QueryParam("token") String token) throws Exception;

    @GET
    @Path("item")
    @Produces(MediaType.APPLICATION_JSON)
    VenueItem venueItem(@QueryParam("token") String token,
                        @QueryParam("id") int id) throws Exception;

    @GET
    @Path("map")
    @Produces(MediaType.APPLICATION_JSON)
    VenueMap[] venueMap(@QueryParam("token") String token,
                        @QueryParam("centerLat") float centerLat,
                        @QueryParam("centerLng") float centerLng,
                        @QueryParam("deltaLat") float deltaLat,
                        @QueryParam("deltaLng") float deltaLng) throws Exception;

    @GET
    @Path("gallery")
    @Produces(MediaType.APPLICATION_JSON)
    VenueGalery[] venueGalery(@QueryParam("token") String token,
                              @QueryParam("id") int id) throws Exception;

    @GET
    @Path("backgroundUrl")
    @Produces(MediaType.APPLICATION_JSON)
    Map<String, String> venueBackgroundUrl(@QueryParam("token") String token,
                                           @QueryParam("venueId") int venueId) throws Exception;

    @GET
    @Path("thumb")
    @Produces(MediaType.APPLICATION_JSON)
    Map<String, String> venueThumb(@QueryParam("token") String token,
                                   @QueryParam("venueId") int venueId) throws Exception;

}
