package org.bl.json.jersey.test;

import org.bl.json.jersey.TestVariables;
import org.bl.json.jersey.client.JerseyClient;
import org.bl.json.jersey.model.venue.VenueItem;
import org.bl.json.jersey.model.venue.VenueList;
import org.bl.json.jersey.rest.service.Venue;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Map;

/**
 * @author Bogdan Lupashko
 */

public class TestVenue {

    @Test(description = "<br> <br> <br> <b>Description </b>Selected venue  test Vegaster <br> <a href=\"http://vegaster.webprv.com/api/doc#venue\">API doc</a>")
    public void venueItem() {
        Venue service = TestVariables.getClient().proxy(Venue.class);
        VenueItem response = service.venueItem(TestVariables.getToken(), TestVariables.getVenueId());
        JerseyClient.LOG.error(response.toString());
        Assert.assertNotNull(response);
        JerseyClient.LOG.error(response.toString());
    }

    @Test(description = "<br> <br> <br> <b>Description </b>Venues list  test Vegaster <br> <a href=\"http://vegaster.webprv.com/api/doc#venue\">API doc</a>")
    public void venueList() {
        Venue service = TestVariables.getClient().proxy(Venue.class);
        VenueList[] response = service.venueList(TestVariables.getToken());
        JerseyClient.LOG.error(response.toString());
        Assert.assertNotNull(response);
        JerseyClient.LOG.error(response.toString());
    }

    @Test(description = "<br> <br> <br> <b>Description </b>Venue background test Vegaster <br> <a href=\"http://vegaster.webprv.com/api/doc#venue\">API doc</a>")
    public void venueBackgroundUrl() {
        Venue service = TestVariables.getClient().proxy(Venue.class);
        Map<String,String> response = service.venueBackgroundUrl(TestVariables.getToken(), TestVariables.getVenueId());
        JerseyClient.LOG.error(response.toString());
        Assert.assertNotNull(response);
        JerseyClient.LOG.error(response.toString());
    }
}
