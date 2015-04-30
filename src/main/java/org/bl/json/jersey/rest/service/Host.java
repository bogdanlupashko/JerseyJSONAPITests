package org.bl.json.jersey.rest.service;

import org.bl.json.jersey.client.JerseyClient;
import org.bl.json.jersey.model.host.HostItem;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * @author Bogdan Lupashko
 */
@Path(JerseyClient.API_PREAMBLE + "host/")
public interface Host {

    @GET
    @Path("list")
    @Produces(MediaType.APPLICATION_JSON)
    HostItem[] hostsList(@QueryParam("token") String token,
                         @QueryParam("id") int id)  throws Exception; //Venue Id required

    @GET
    @Path("item")
    @Produces(MediaType.APPLICATION_JSON)
    HostItem hostItem(@QueryParam("token") String token,
                      @QueryParam("id") int id) throws Exception; //Host User Id required

}
