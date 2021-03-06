package org.bl.json.jersey.rest.service;

import org.bl.json.jersey.client.JerseyClient;
import org.bl.json.jersey.model.category.CategoryHomepage;
import org.bl.json.jersey.model.category.CategoryList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;

/**
 * @author Bogdan Lupashko
 */
@Path(JerseyClient.API_PREAMBLE + "category/")
public interface Category {

    @GET
    @Path("homepage")
    @Produces(MediaType.APPLICATION_JSON)
    CategoryHomepage[] categoryHomepage(@QueryParam("token") String token)  throws WebApplicationException;

    @GET
    @Path("list")
    @Produces(MediaType.APPLICATION_JSON)
    CategoryList[] categoryList(@QueryParam("token") String token)  throws WebApplicationException;

    @GET
    @Path("list")
    @Produces(MediaType.APPLICATION_JSON)
    CategoryList categoryListTrip(@QueryParam("token") String token,
                                  @QueryParam("displayPlanTrip") int displayPlanTrip,
                                  @QueryParam("parentId") int parentId) throws WebApplicationException;

}
