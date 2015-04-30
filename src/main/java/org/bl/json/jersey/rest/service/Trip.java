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
    TripSimple tripListGet(@QueryParam("token") String token) throws Exception;

    @GET
    @Path("item")
    @Produces(MediaType.APPLICATION_JSON)
    TripItem tripItemGet(@QueryParam("token") String token,
                         @QueryParam("id") int id) throws Exception;

    @POST
    @Path("item")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes("application/x-www-form-urlencoded")
    TripId tripCreate(@FormParam("token") String token,
                      @FormParam("date") String date) throws Exception;

    @PUT
    @Path("item")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes("application/x-www-form-urlencoded")
    TripId tripUpdate(@FormParam("token") String token,
                      @FormParam("id") int id,
                      @FormParam("date") String date) throws Exception;

    @DELETE
    @Path("item")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes("application/x-www-form-urlencoded")
    String tripDelete(@FormParam("token") String token,
                      @FormParam("id") int id) throws Exception;

    @GET
    @Path("activity")
    @Produces(MediaType.APPLICATION_JSON)
    TripActivity tripActivityGet(@QueryParam("token") String token,
                                 @QueryParam("id") int id) throws Exception;

    @POST
    @Path("activity")
    @Produces(MediaType.APPLICATION_JSON)
    TripId tripActivityCreate(@QueryParam("token") String token,
                              @QueryParam("tripId") int tripId,
                              @QueryParam("name") String name,
                              @QueryParam("type") String type, /** @type value: flight, hotel, event, restaurant, show, misc*/
                              @QueryParam("dateTime") String dateTime) throws Exception;

    @PUT
    @Path("activity")
    @Produces(MediaType.APPLICATION_JSON)
    TripId tripActivityUpdate(@QueryParam("token") String token,
                              @QueryParam("tripId") int tripId,
                              @QueryParam("name") String name,
                              @QueryParam("type") String type, /** @type value: flight, hotel, event, restaurant, show, misc*/
                              @QueryParam("dateTime") String dateTime) throws Exception;

    @DELETE
    @Path("activity")
    @Produces(MediaType.APPLICATION_JSON)
    String tripActivityDelete(@QueryParam("token") String token,
                              @QueryParam("id") int id,
                              @QueryParam("tripId") int tripId) throws Exception;

    @POST
    @Path("sync")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes("application/x-www-form-urlencoded")
    TripSync tripSyncCreate(@FormParam("token") String token,
                            @FormParam("code") String code) throws Exception;

    @GET
    @Path("activityTypes")
    @Produces(MediaType.APPLICATION_JSON)
    Map<Integer, String> tripActivityTypesGet(@QueryParam("token") String token) throws Exception;


    @GET
    @Path("activityTypes")
    @Produces(MediaType.APPLICATION_JSON)
    TripSyncItem tripSyncItemGet(@QueryParam("token") String token,
                                 @QueryParam("id") int id) throws Exception;

    @GET
    @Path("request")
    @Produces(MediaType.APPLICATION_JSON)
    TripRequest tripRequestGet(@QueryParam("token") String token,
                               @QueryParam("id") int id) throws Exception;


    @POST
    @Path("request")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes("application/x-www-form-urlencoded")
    TripId tripRequestCreate(@QueryParam("token") String token,
                             @QueryParam("travelType") int travelType,
                             @QueryParam("categories") String[] categories,
                             @QueryParam("malesCount") int malesCount,
                             @QueryParam("femalesCount") int femalesCount,
                             @QueryParam("budget") int budget,
                             @QueryParam("costType") int costType/** @type value: const COST_TYPE_PER_PERSON = 1;const COST_TYPE_TOTAL_PACKAGE = 2;*/
    ) throws Exception;

    @GET
    @Path("planItem")
    @Produces(MediaType.APPLICATION_JSON)
    TripPlan tripPlanItemGet(@QueryParam("token") String token,
                             @QueryParam("id") int id) throws Exception;

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
    ) throws Exception;


}
