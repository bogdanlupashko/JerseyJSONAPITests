package org.bl.json.jersey.rest.service;

import org.bl.json.jersey.client.JerseyClient;
import org.bl.json.jersey.model.reservation.ReservationItemGetId;
import org.bl.json.jersey.model.shows.ShowsItem;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by blupashko on 25.06.2015.
 */

@Path(JerseyClient.API_PREAMBLE + "showTour/")
public interface Shows {

    @GET
    @Path("item")
    @Produces(MediaType.APPLICATION_JSON)
    ShowsItem showsItem(@QueryParam("token") String token,
                          @QueryParam("id") int id,
                        @QueryParam("type") String type) throws WebApplicationException;

    @GET
    @Path("list")
    @Produces(MediaType.APPLICATION_JSON)
    ShowsItem[] showsList(@QueryParam("token") String token) throws WebApplicationException;

    @POST
    @Path("item")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes("application/x-www-form-urlencoded")
    ReservationItemGetId reservationItemPost(@QueryParam("token") String token,
                                             @FormParam("id") int id,
                                             @FormParam("periodId") int periodId,
                                             @FormParam("firstName") String firstName,
                                             @FormParam("lastName") String lastName,
                                             @FormParam("email") String email,
                                             @FormParam("phone") String phone) throws WebApplicationException;
}
