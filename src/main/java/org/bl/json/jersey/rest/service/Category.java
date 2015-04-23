package org.bl.json.jersey.rest.service;

import org.bl.json.jersey.client.JerseyClient;

import org.bl.json.jersey.model.category.CategoryHomepage;
import org.bl.json.jersey.model.category.CategoryList;
import org.bl.json.jersey.model.user.UserProfile;


import javax.ws.rs.FormParam;
import javax.ws.rs.GET;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * @author blupashko
 */
public interface Category {

    @GET
    @Path(JerseyClient.API_PATH + JerseyClient.VERSION_API_PATH + "category/homepage")
    @Produces(MediaType.APPLICATION_JSON)
    CategoryHomepage categoryHomepage(@QueryParam("token") String token);

    @GET
    @Path(JerseyClient.API_PATH + JerseyClient.VERSION_API_PATH + "category/list")
    @Produces(MediaType.APPLICATION_JSON)
    CategoryList categoryList(@QueryParam("token") String token);

    @GET
    @Path(JerseyClient.API_PATH + JerseyClient.VERSION_API_PATH + "category/list")
    @Produces(MediaType.APPLICATION_JSON)
    CategoryList categoryListTrip(@QueryParam("token") String token, @QueryParam("displayPlanTrip") int displayPlanTrip);


}
