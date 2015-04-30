package org.bl.json.jersey.rest.service;

import org.bl.json.jersey.client.JerseyClient;
import org.bl.json.jersey.model.request.PriceYourRequest;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * @author Bogdan Lupashko
 */

@Path(JerseyClient.API_PREAMBLE + "request/")
public interface Request {

    @GET
    @Path("item")
    @Produces(MediaType.APPLICATION_JSON)
    PriceYourRequest requestItem(@QueryParam("token") String token,
                                 @FormParam("id") int id) throws Exception;

    @POST
    @Path("item")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes("application/x-www-form-urlencoded")
    String requestCreate(@FormParam("token") String token,
                         @FormParam("venueId") int venueId,
                         @FormParam("beginDateTime") String beginDateTime,
                         @FormParam("firstName") String firstName,
                         @FormParam("lastName") String lastName,
                         @FormParam("email") String email,
                         @FormParam("phone") String phone,
                         @FormParam("malesCount") int malesCount,
                         @FormParam("femalesCount") int femalesCount,
                         @FormParam("budget") float budget,
                         @FormParam("note") String note) throws Exception;

    @GET
    @Path("status")
    @Produces(MediaType.APPLICATION_JSON)
    String requestStatus(@QueryParam("token") String token,
                         @QueryParam("id") int id) throws Exception;


    @PUT
    @Path("status")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes("application/x-www-form-urlencoded")
    String requestStatus(@FormParam("token") String token,
                         @FormParam("id") int id,
                         @FormParam("status") String status
                         /**@status values: confirmed_by_user, cancelled_by_user*/
    ) throws Exception;


}
