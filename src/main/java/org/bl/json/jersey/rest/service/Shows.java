package org.bl.json.jersey.rest.service;

import org.bl.json.jersey.client.JerseyClient;
import org.bl.json.jersey.model.shows.ShowsItem;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;

/**
 * Created by blupashko on 25.06.2015.
 */

@Path(JerseyClient.API_PREAMBLE + "showTour/")
public interface Shows {

    @GET
    @Path("item")
    @Produces(MediaType.APPLICATION_JSON)
    ShowsItem showsItem(@QueryParam("token") String token,
                          @QueryParam("id") int id) throws WebApplicationException;

    @GET
    @Path("list")
    @Produces(MediaType.APPLICATION_JSON)
    ShowsItem[] showsList(@QueryParam("token") String token) throws WebApplicationException;

}
