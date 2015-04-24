package org.bl.json.jersey.test;

import org.bl.json.jersey.RestClient;
import org.bl.json.jersey.client.JerseyClient;
import org.bl.json.jersey.model.auth.AuthLogin;

import org.bl.json.jersey.model.venue.VenueBackground;
import org.bl.json.jersey.model.venue.VenueItem;
import org.bl.json.jersey.model.venue.VenueList;
import org.bl.json.jersey.rest.service.Auth;
import org.bl.json.jersey.rest.service.Venue;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author Bogdan Lupashko
 */

public class TestVenue {

    static RestClient client;
    static String token;
    private int id = 40;//need to be changed
    private int venueId = 40; // jfkjrfkj

    @BeforeClass
    public  void init() {
        client = new RestClient();
        token = getToken();
    }

    @Test
    public void venueItem() {
        Venue service = client.proxy(Venue.class);
        VenueItem respose = service.venueItem(token, id);
        JerseyClient.LOG.error(respose.toString());
        Assert.assertNotNull(respose);
        JerseyClient.LOG.error(respose.toString());
    }

    @Test
    public void venueList() {
        Venue service = client.proxy(Venue.class);
        VenueList respose = service.venueList(token);
        JerseyClient.LOG.error(respose.toString());
        Assert.assertNotNull(respose);
        JerseyClient.LOG.error(respose.toString());
    }

    @Test
    public void venueBackgroundUrl() {
        Venue service = client.proxy(Venue.class);
        VenueBackground respose = service.venueBackgroundUrl(token, id);
        JerseyClient.LOG.error(respose.toString());
        Assert.assertNotNull(respose);
        JerseyClient.LOG.error(respose.toString());
    }

    private String getToken() {
        if (TestAuth.token != null) {
            return TestAuth.token;
        } else {
            Auth service = client.proxy(Auth.class);
            AuthLogin respose = service.authLogin("googlecomua@mail.ru", "qqqqqq");
            Assert.assertNotNull(respose);
            Assert.assertNotNull(respose.getId());
            Assert.assertNotNull(respose.getToken());
            return respose.getToken();
        }
    }
}
