package org.bl.json.jersey.test;

import org.bl.json.jersey.TestVariables;
import org.bl.json.jersey.client.JerseyClient;
import org.bl.json.jersey.model.venue.VenueGalery;
import org.bl.json.jersey.model.venue.VenueItem;
import org.bl.json.jersey.model.venue.VenueList;
import org.bl.json.jersey.model.venue.VenueMap;
import org.bl.json.jersey.rest.service.Venue;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Map;

/**
 * @author Bogdan Lupashko
 */

public class TestVenue {
    private static final String docLink = "http://vegaster.webprv.com/api/doc#venue";
    private static final String venueItemDescription = "Selected venue  test ";
    private static final String venueListDescription = "Venues list  test ";
    private static final String venueMapDescription = "Venues map  test ";
    private static final String venueThumbDescription = "Venues thumb  test ";
    private static final String venueBackgroundUrlDescription = "Venue background test";
    public static VenueItem venueItem;

    @Test(description = TestVariables.DESCRIPTION_TESTS_HEADER + venueItemDescription + "<br> <a href=" + docLink + ">" + TestVariables.LINK_API_DOC_HEADER + "</a>")
    public void venueItem() {
        try {
            Venue service = TestVariables.getClient().proxy(Venue.class);
            VenueItem venueItem = service.venueItem(TestVariables.getToken(), TestVariables.venueId);
            TestVariables.reportFiller(docLink, venueItemDescription, venueItem);
            JerseyClient.LOG.error(venueItem.toString());
            Assert.assertNotNull(venueItem);
            JerseyClient.LOG.error(venueItem.toString());
        } catch (Exception e) {
            e.printStackTrace();
            TestVariables.reportFillerStackTrace(docLink, venueItemDescription, e.getLocalizedMessage());
            Assert.fail();
        }
    }

    @Test(description = TestVariables.DESCRIPTION_TESTS_HEADER + venueListDescription + "<br> <a href=" + docLink + ">" + TestVariables.LINK_API_DOC_HEADER + "</a>")
    public void venueList() {
        try {
            Venue service = TestVariables.getClient().proxy(Venue.class);
            VenueList[] response = service.venueList(TestVariables.getToken());
            TestVariables.reportFiller(docLink, venueListDescription, response);
            JerseyClient.LOG.error(response.toString());
            Assert.assertNotNull(response);
            JerseyClient.LOG.error(response.toString());
        } catch (Exception e) {
            e.printStackTrace();
            TestVariables.reportFillerStackTrace(docLink, venueListDescription, e.getLocalizedMessage());
            Assert.fail();
        }
    }

    @Test(description = TestVariables.DESCRIPTION_TESTS_HEADER + venueMapDescription + "<br> <a href=" + docLink + ">" + TestVariables.LINK_API_DOC_HEADER + "</a>")
    public void venueMap() {
        try {
            Venue service = TestVariables.getClient().proxy(Venue.class);
            VenueMap[] response = service.venueMap(TestVariables.getToken(),
                    TestVariables.lat,
                    TestVariables.lng,
                    TestVariables.deltaLat,
                    TestVariables.deltaLng);

            TestVariables.reportFiller(docLink, venueMapDescription, response);
            JerseyClient.LOG.error(response.toString());
            Assert.assertNotNull(response);
            JerseyClient.LOG.error(response.toString());
        } catch (Exception e) {
            e.printStackTrace();
            TestVariables.reportFillerStackTrace(docLink, venueMapDescription, e.getLocalizedMessage());
            Assert.fail();
        }
    }

    @Test(description = TestVariables.DESCRIPTION_TESTS_HEADER + venueMapDescription + "<br> <a href=" + docLink + ">" + TestVariables.LINK_API_DOC_HEADER + "</a>")
    public void venueGalery() {
        try {
            Venue service = TestVariables.getClient().proxy(Venue.class);
            VenueGalery[] response = service.venueGalery(TestVariables.getToken(),
                    venueItem.getId());

            TestVariables.reportFiller(docLink, venueMapDescription, response);
            JerseyClient.LOG.error(response.toString());
            Assert.assertNotNull(response);
            JerseyClient.LOG.error(response.toString());
        } catch (Exception e) {
            e.printStackTrace();
            TestVariables.reportFillerStackTrace(docLink, venueMapDescription, e.getLocalizedMessage());
            Assert.fail();
        }
    }

    @Test(description = TestVariables.DESCRIPTION_TESTS_HEADER + venueBackgroundUrlDescription + "<br> <a href=" + docLink + ">" + TestVariables.LINK_API_DOC_HEADER + "</a>")
    public void venueBackgroundUrl() {
        try {
            Venue service = TestVariables.getClient().proxy(Venue.class);
            Map<String, String> response = service.venueBackgroundUrl(TestVariables.getToken(), TestVariables.venueId);
            TestVariables.reportFiller(docLink, venueBackgroundUrlDescription, response);
            JerseyClient.LOG.error(response.toString());
            Assert.assertNotNull(response);
            JerseyClient.LOG.error(response.toString());
        } catch (Exception e) {
            e.printStackTrace();
            TestVariables.reportFillerStackTrace(docLink, venueBackgroundUrlDescription, e.getLocalizedMessage());
            Assert.fail();
        }
    }

    @Test(description = TestVariables.DESCRIPTION_TESTS_HEADER + venueThumbDescription + "<br> <a href=" + docLink + ">" + TestVariables.LINK_API_DOC_HEADER + "</a>")
    public void venueThumb() {
        try {
            Venue service = TestVariables.getClient().proxy(Venue.class);
            Map<String, String>  response = service.venueThumb(TestVariables.getToken(),
                    venueItem.getId());

            TestVariables.reportFiller(docLink, venueThumbDescription, response);
            JerseyClient.LOG.error(response.toString());
            Assert.assertNotNull(response);
            JerseyClient.LOG.error(response.toString());
        } catch (Exception e) {
            e.printStackTrace();
            TestVariables.reportFillerStackTrace(docLink, venueThumbDescription, e.getLocalizedMessage());
            Assert.fail();
        }
    }
}
