package org.bl.json.jersey.rest.service;

import org.bl.json.jersey.client.JerseyClient;
import org.bl.json.jersey.model.reminder.ReminderId;
import org.bl.json.jersey.model.reminder.ReminderItem;
import org.bl.json.jersey.model.reminder.ReminderItemForList;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;

/**
 * @author Bogdan Lupashko
 */
@Path(JerseyClient.API_PREAMBLE + "reminder/")
public interface Reminder {

    @GET
    @Path("list")
    @Produces(MediaType.APPLICATION_JSON)
    ReminderItemForList[] reminderList(@QueryParam("token") String token) throws WebApplicationException;

    @GET
    @Path("item")
    @Produces(MediaType.APPLICATION_JSON)
    ReminderItem reminderItem(@QueryParam("token") String token,
                              @FormParam("id") int id) throws WebApplicationException;

    @PUT
    @Path("item")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes("application/x-www-form-urlencoded")
    ReminderId reminderItemIdReminderDate(@FormParam("token") String token,
                                          @FormParam("id") int id,
                                          @FormParam("reminderDateTime") String reminderDateTime,
                                          @FormParam("addedDateTime") String addedDateTime) throws WebApplicationException;

    @PUT
    @Path("item")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes("application/x-www-form-urlencoded")
    ReminderId reminderItemIdInterval(@FormParam("token") String token,
                                      @FormParam("id") int id,
                                      @FormParam("interval") int interval,
                                      @FormParam("addedDateTime") String addedDateTime) throws WebApplicationException;

    @DELETE
    @Path("item")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes("application/x-www-form-urlencoded")
    String reminderItemDelete(@FormParam("token") String token,
                              @FormParam("id") int id) throws Exception;

    @POST
    @Path("item")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes("application/x-www-form-urlencoded")
    ReminderId addReminderItemIdReminderDate(@FormParam("token") String token,
                                             @FormParam("id") int id,
                                             @FormParam("reminderDateTime") String reminderDateTime,
                                             @FormParam("addedDateTime") String addedDateTime) throws WebApplicationException;

    @POST
    @Path("venue")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes("application/x-www-form-urlencoded")
    ReminderId addReminderItemIdInterval(@FormParam("token") String token,
                                         @FormParam("id") int id,
                                         @FormParam("interval") int interval,
                                         @FormParam("addedDateTime") String addedDateTime) throws Exception;

    @GET
    @Path("venue")
    @Produces(MediaType.APPLICATION_JSON)
    ReminderItem[] reminderItemsForVenue(@QueryParam("token") String token,
                                         @FormParam("id") int id) throws Exception;

    @POST
    @Path("reservation")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes("application/x-www-form-urlencoded")
    ReminderId addReminderForReservation(@FormParam("token") String token,
                                         @FormParam("id") int id) throws Exception;

    @GET
    @Path("reservation")
    @Produces(MediaType.APPLICATION_JSON)
    ReminderItem[] reminderForReservation(@QueryParam("token") String token,
                                          @QueryParam("id") int id) throws Exception;

}
