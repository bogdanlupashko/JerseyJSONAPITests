package org.bl.json.jersey.rest.service;

import org.bl.json.jersey.client.JerseyClient;
import org.bl.json.jersey.model.reservation.ReservationItem;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * @author blupashko
 */
public interface Reservation {

    @GET
    @Path(JerseyClient.API_PATH + JerseyClient.VERSION_API_PATH + "reservation/item")
    @Produces(MediaType.APPLICATION_JSON)
    ReservationItem reservationItem(@QueryParam("token") String token,
                                    @QueryParam("id") int id);
}
