package org.bl.json.jersey.rest.service;

import org.bl.json.jersey.client.JerseyClient;
import org.bl.json.jersey.model.components.Offers;
import org.bl.json.jersey.model.components.Offerss;
import org.bl.json.jersey.model.notification.NotificationCount;
import org.bl.json.jersey.model.offer.OfferItem;
import org.bl.json.jersey.model.offer.OffersList;

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
    @Path(JerseyClient.API_PATH + JerseyClient.VERSION_API_PATH + "offer/list")
    @Produces(MediaType.APPLICATION_JSON)
    Offerss[] offerList(@QueryParam("token") String token,
                         @QueryParam("id") int id);


    @GET
    @Path(JerseyClient.API_PATH + JerseyClient.VERSION_API_PATH + "offer/item")
    @Produces(MediaType.APPLICATION_JSON)
    Offerss offerItem(@QueryParam("token") String token,
                        @QueryParam("id") int id);






}
