package org.bl.json.jersey.rest.service;

import org.bl.json.jersey.client.JerseyClient;
import org.bl.json.jersey.model.viator.ViatorItem;
import org.bl.json.jersey.model.viator.ViatorList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;

/**
 * @author Bogdan Lupashko
 */
@Path(JerseyClient.API_PREAMBLE + "viator/")
public interface Viator {

    @GET
    @Path("item")
    @Produces(MediaType.APPLICATION_JSON)
    ViatorItem viatorItem(@QueryParam("token") String token,
                          @QueryParam("id") int id) throws WebApplicationException;

    @GET
    @Path("list")
    @Produces(MediaType.APPLICATION_JSON)
    ViatorList[] viatorList(@QueryParam("token") String token,
                            @QueryParam("id") int id) throws WebApplicationException;
}
