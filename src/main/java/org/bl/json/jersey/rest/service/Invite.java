package org.bl.json.jersey.rest.service;

import org.bl.json.jersey.client.JerseyClient;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * @author Bogdan Lupashko
 *
 */
@Path(JerseyClient.API_PREAMBLE + "invite/")
public interface Invite {

    @GET
    @Path("list")
    @Produces(MediaType.APPLICATION_JSON)
    Response inviteList(@QueryParam("token") String token,
                         @QueryParam("reservationId") int reservationId) throws WebApplicationException;

    @POST
    @Path("share")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes("application/x-www-form-urlencoded")
    String inviteShare(@FormParam("token") String token,
                       @FormParam("reservationId") int reservationId,
                       @FormParam("contacts") Map<String, String>[] contacts) throws WebApplicationException;
}
