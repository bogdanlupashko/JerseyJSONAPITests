package org.bl.json.jersey.rest.service;

import org.bl.json.jersey.client.JerseyClient;
import org.bl.json.jersey.model.components.Offerss;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * @author blupashko
 */
public interface Offer {

    @GET
    @Path(JerseyClient.API_PREAMBLE + "offer/list")
    @Produces(MediaType.APPLICATION_JSON)
    Offerss[] offerList(@QueryParam("token") String token,
                        @QueryParam("id") int id,
                        @QueryParam("dateTime") String dateTime);


    @GET
    @Path(JerseyClient.API_PREAMBLE + "offer/item")
    @Produces(MediaType.APPLICATION_JSON)
    Offerss offerItem(@QueryParam("token") String token,
                      @QueryParam("id") int id,
                      @QueryParam("periodId") int periodId);
}
