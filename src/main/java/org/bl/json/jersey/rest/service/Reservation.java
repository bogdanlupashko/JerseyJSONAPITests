package org.bl.json.jersey.rest.service;

import org.bl.json.jersey.client.JerseyClient;
import org.bl.json.jersey.model.reservation.ReservationItem;
import org.bl.json.jersey.model.reservation.ReservationItemNe;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
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

    @POST
    @Path(JerseyClient.API_PATH + JerseyClient.VERSION_API_PATH + "reservation/item")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes("application/x-www-form-urlencoded")
    ReservationItemNe reservationItemPost(@QueryParam("token") String token,
                                        @FormParam("phone") String phone,
                                        @FormParam("malesCount") int malesCount,
                                        @FormParam("firstName") String firstName,
                                        @FormParam("reservedDateTime") String reservedDateTime,
                                        @FormParam("offerId") int offerId,
                                        @FormParam("femalesCount") int femalesCount,
                                        @FormParam("email") String email,
                                        @FormParam("periodId") int periodId,
                                        @FormParam("lastName") String lastName);
}
