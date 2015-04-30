package org.bl.json.jersey.rest.service;

import org.bl.json.jersey.client.JerseyClient;
import org.bl.json.jersey.model.notification.NotificationCount;
import org.bl.json.jersey.model.notification.NotificationItem;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * @author Bogdan Lupashko
 */

@Path(JerseyClient.API_PREAMBLE + "notification/")
public interface Notification {

    @GET
    @Path("list")
    @Produces(MediaType.APPLICATION_JSON)
    NotificationItem[] notificationList(@QueryParam("token") String token) throws Exception;

    @GET
    @Path("count")
    @Produces(MediaType.APPLICATION_JSON)
    NotificationCount notificationCount(@QueryParam("token") String token) throws Exception;


    @PUT
    @Path(JerseyClient.API_PREAMBLE + "notification/read")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes("application/x-www-form-urlencoded")
    String notificationRead(@FormParam("token") String token,
                            @FormParam("id") int id) throws Exception; //Notification ID required

}
