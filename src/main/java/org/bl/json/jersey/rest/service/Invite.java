package org.bl.json.jersey.rest.service;

import org.bl.json.jersey.client.JerseyClient;
import org.bl.json.jersey.model.invite.Invited;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * @author Bogdan Lupashko
 *
 */
@Path(JerseyClient.API_PREAMBLE + "invite/")
public interface Invite {

    @GET
    @Path("list")
    @Produces(MediaType.APPLICATION_JSON)
    Invited[] inviteList(@QueryParam("token") String token,
                         @QueryParam("reservationId") int reservationId) throws Exception;

    @POST
    @Path("share")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes("application/x-www-form-urlencoded")
    String inviteShare(@FormParam("token") String token,
                       @FormParam("reservationId") int reservationId,
                       @FormParam("contacts") Invited[] contacts) throws Exception;
}
