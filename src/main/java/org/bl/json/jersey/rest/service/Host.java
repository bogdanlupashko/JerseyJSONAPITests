package org.bl.json.jersey.rest.service;

import org.bl.json.jersey.client.JerseyClient;
import org.bl.json.jersey.model.host.HostItem;
import org.bl.json.jersey.model.host.HostsList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * @author blupashko
 */
public interface Host {

    @GET
    @Path(JerseyClient.API_PREAMBLE + "host/list")
    @Produces(MediaType.APPLICATION_JSON)
    HostsList hostsList(@QueryParam("token") String token, @QueryParam("id") int id);

    @GET
    @Path(JerseyClient.API_PREAMBLE + "host/item")
    @Produces(MediaType.APPLICATION_JSON)
    HostItem hostItem(@QueryParam("token") String token, @QueryParam("id") int id);

}
