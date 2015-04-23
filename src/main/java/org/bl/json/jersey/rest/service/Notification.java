package org.bl.json.jersey.rest.service;

import org.bl.json.jersey.client.JerseyClient;
import org.bl.json.jersey.model.category.CategoryHomepage;
import org.bl.json.jersey.model.notification.NotificationCount;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * @author blupashko
 */
public interface Notification {

    @GET
    @Path(JerseyClient.API_PATH + JerseyClient.VERSION_API_PATH + "notification/count")
    @Produces(MediaType.APPLICATION_JSON)
    NotificationCount notificationCount(@QueryParam("token") String token);

}
