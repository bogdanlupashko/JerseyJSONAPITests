package org.bl.json.jersey.rest.service;

import org.bl.json.jersey.client.JerseyClient;
import org.bl.json.jersey.model.host.HostItem;
import org.bl.json.jersey.model.host.HostList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;

/**
 * @author Bogdan Lupashko
 */
@Path(JerseyClient.API_PREAMBLE + "host/")
public interface Host {

    @GET
    @Path("list")
    @Produces(MediaType.APPLICATION_JSON)
    HostList[] hostsList(@QueryParam("token") String token,
                         @QueryParam("id") int id)  throws WebApplicationException; //Venue Id required

    @GET
    @Path("item")
    @Produces(MediaType.APPLICATION_JSON)
    HostItem hostItem(@QueryParam("token") String token,
                      @QueryParam("id") int id) throws WebApplicationException; //Host User Id required

}
