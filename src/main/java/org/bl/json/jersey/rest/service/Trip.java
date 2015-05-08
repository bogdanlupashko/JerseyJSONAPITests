package org.bl.json.jersey.rest.service;

import org.bl.json.jersey.client.JerseyClient;
import org.bl.json.jersey.model.trip.TripActivity;
import org.bl.json.jersey.model.trip.TripId;
import org.bl.json.jersey.model.trip.TripItem;
import org.bl.json.jersey.model.trip.TripPlan;
import org.bl.json.jersey.model.trip.TripRequest;
import org.bl.json.jersey.model.trip.TripSimple;
import org.bl.json.jersey.model.trip.TripSync;
import org.bl.json.jersey.model.trip.TripSyncItem;

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
import java.util.Map;

/**
 * @author Bogdan Lupashko
 */
@Path(JerseyClient.API_PREAMBLE + "trip/")
public interface Trip {

    @GET
    @Path("list")
    @Produces(MediaType.APPLICATION_JSON)
    TripSimple[] tripListGet(@QueryParam("token") String token) throws WebApplicationException;

    @GET
    @Path("item")
    @Produces(MediaType.APPLICATION_JSON)
    TripItem tripItemGet(@QueryParam("token") String token,
                         @QueryParam("id") int id) throws WebApplicationException;

    @POST
    @Path("item")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes("application/x-www-form-urlencoded")
    TripId tripCreate(@FormParam("token") String token,
                      @FormParam("date") String date) throws WebApplicationException;

    @PUT
    @Path("item")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes("application/x-www-form-urlencoded")
    TripId tripUpdate(@FormParam("token") String token,
                      @FormParam("id") int id,
                      @FormParam("date") String date) throws WebApplicationException;

    @DELETE
    @Path("item")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes("application/x-www-form-urlencoded")
    String tripDelete(@FormParam("token") String token,
                      @FormParam("id") int id) throws WebApplicationException;

    @GET
    @Path("activity")
    @Produces(MediaType.APPLICATION_JSON)
    TripActivity tripActivityGet(@QueryParam("token") String token,
                                 @QueryParam("id") int id,
                                 @QueryParam("tripId") int tripId) throws WebApplicationException;

    @POST
    @Path("activity")
    @Produces(MediaType.APPLICATION_JSON)
    TripId tripActivityCreate(@QueryParam("token") String token,
                              @QueryParam("tripId") int tripId,
                              @QueryParam("name") String name,
                              @QueryParam("type") String type, /** @type value: flight, hotel, event, restaurant, show, misc*/
                              @QueryParam("dateTime") String dateTime) throws WebApplicationException;

    @PUT
    @Path("activity")
    @Produces(MediaType.APPLICATION_JSON)
    TripId tripActivityUpdate(@QueryParam("token") String token,
                              @QueryParam("tripId") int tripId,
                              @QueryParam("name") String name,
                              @QueryParam("type") String type, /** @type value: flight, hotel, event, restaurant, show, misc*/
                              @QueryParam("dateTime") String dateTime) throws WebApplicationException;

    @DELETE
    @Path("activity")
    @Produces(MediaType.APPLICATION_JSON)
    String tripActivityDelete(@QueryParam("token") String token,
                              @QueryParam("id") int id,
                              @QueryParam("tripId") int tripId) throws WebApplicationException;

    @POST
    @Path("sync")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes("application/x-www-form-urlencoded")
    TripSync tripSyncCreate(@FormParam("token") String token,
                            @FormParam("code") String code) throws WebApplicationException;

    @GET
    @Path("activityTypes")
    @Produces(MediaType.APPLICATION_JSON)
    Map<Integer, String> tripActivityTypesGet(@QueryParam("token") String token) throws WebApplicationException;


    @GET
    @Path("syncItem")
    @Produces(MediaType.APPLICATION_JSON)
    TripSyncItem tripSyncItemGet(@QueryParam("token") String token,
                                 @QueryParam("id") int id) throws WebApplicationException;

    @GET
    @Path("request")
    @Produces(MediaType.APPLICATION_JSON)
    TripRequest tripRequestGet(@QueryParam("token") String token,
                               @QueryParam("id") int id) throws WebApplicationException;

    @POST
    @Path("request")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes("application/x-www-form-urlencoded")
    TripId tripRequestCreate(@FormParam("token") String token,
                             @FormParam("travelType") int travelType,
                             @FormParam("categories") int[] categories,
                             @FormParam("malesCount") int malesCount,
                             @FormParam("femalesCount") int femalesCount,
                             @FormParam("budget") int budget,
                             @FormParam("costType") int costType/** @type value: const COST_TYPE_PER_PERSON = 1;const COST_TYPE_TOTAL_PACKAGE = 2;*/
    ) throws WebApplicationException;

    @GET
    @Path("planItem")
    @Produces(MediaType.APPLICATION_JSON)
    TripPlan tripPlanItemGet(@QueryParam("token") String token,
                             @QueryParam("id") int id) throws WebApplicationException;

    @POST
    @Path("changeStatusRequest")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes("application/x-www-form-urlencoded")
    String tripChangeStatusRequest(@QueryParam("token") String token,
                                   @QueryParam("tripRequestId") int tripRequestId,
                                   @QueryParam("status") int status
                                   /**
                                    *  STATUS_NEW = 1;
                                    *  STATUS_CANCELED = 2;
                                    *  STATUS_HAVE_PLAN = 3;
                                    *  STATUS_APPROVED = 4;
                                    *  STATUS_EXPIRED = 5;
                                    *
                                    *  STATUS_NEW => [STATUS_CANCELED],
                                    *  STATUS_CANCELED => [],
                                    *  STATUS_HAVE_PLAN => [STATUS_CANCELED, STATUS_APPROVED]
                                    *  STATUS_APPROVED => [STATUS_CANCELED],
                                    *  STATUS_EXPIRED => [].
                                    *
                                    */
    ) throws WebApplicationException;


}
