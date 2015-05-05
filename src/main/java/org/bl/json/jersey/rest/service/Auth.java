package org.bl.json.jersey.rest.service;

import org.bl.json.jersey.client.JerseyClient;
import org.bl.json.jersey.model.auth.AuthLogin;
import org.bl.json.jersey.model.components.UserTopCategories;

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
 */

@Path(JerseyClient.API_PREAMBLE + "auth/")
public interface Auth {

    @POST
    @Path("login")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes("application/x-www-form-urlencoded")
    AuthLogin authLogin(@FormParam("email") String email,
                        @FormParam("password") String password) throws Exception;

    @POST
    @Path("logout")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes("application/x-www-form-urlencoded")
    String authLogout(@FormParam("token") String token) throws Exception;

    @POST
    @Path("register")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes("application/x-www-form-urlencoded")
    AuthLogin authRegister(@FormParam("email") String email,
                        @FormParam("passwordRaw") String passwordRaw,
                        @FormParam("passwordRepeat") String passwordRepeat,
                        @FormParam("phone") String phone,
                        @FormParam("firstName") String firstName,
                        @FormParam("lastName") String lastName) throws Exception;

    @POST
    @Path("recover")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes("application/x-www-form-urlencoded")
    String authRecover(@FormParam("email") String email) throws Exception;

    @GET
    @Path("hotelsList")
    @Produces(MediaType.APPLICATION_JSON)
    String[] authHotelsList(@QueryParam("token") String token)  throws Exception;

    @POST
    @Path("passwordCheck")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes("application/x-www-form-urlencoded")
    String authPasswordCheck(@FormParam("token") String token,
                             @FormParam("password") String password) throws Exception;

    @POST
    @Path("deviceTokenUpdate")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes("application/x-www-form-urlencoded")
    String authDeviceTokenUpdate(@FormParam("token") String token) throws Exception;

    @GET
    @Path("categoriesList")
    @Produces(MediaType.APPLICATION_JSON)
    UserTopCategories[] authCategoriesList(@QueryParam("token") String token) throws Exception;

}
