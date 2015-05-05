package org.bl.json.jersey.test;

import org.bl.json.jersey.TestVariables;
import org.bl.json.jersey.client.JerseyClient;
import org.bl.json.jersey.model.host.HostItem;
import org.bl.json.jersey.rest.service.Host;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author Bogdan Lupashko
 */

public class TestHost {
    private static final String hostItemDescription = "Venue host test";
    private static final String hostListDescription = "Host list test";
    private static final String docLink = "http://vegaster.webprv.com/api/doc#host";


    @Test(description = TestVariables.DESCRIPTION_TESTS_HEADER + hostItemDescription + "<br> <a href=" + docLink + ">" + TestVariables.LINK_API_DOC_HEADER + "</a>")
    public void hostItem() {
        try {
            Host service = TestVariables.getClient().proxy(Host.class);
            HostItem response = service.hostItem(TestVariables.getToken(), TestVariables.hostId);
            TestVariables.reportFiller(docLink, hostItemDescription, response);
            JerseyClient.LOG.error(response.toString());
            Assert.assertNotNull(response);
            JerseyClient.LOG.error(response.toString());
        } catch (Exception e) {
            e.printStackTrace();
            TestVariables.reportFillerStackTrace(docLink, hostItemDescription, e.getLocalizedMessage());
            Assert.fail();
        }
    }

    @Test(description = TestVariables.DESCRIPTION_TESTS_HEADER + hostListDescription + "<br> <a href=" + docLink + ">" + TestVariables.LINK_API_DOC_HEADER + "</a>")
    public void hostsList() {
        try {
            Host service = TestVariables.getClient().proxy(Host.class);
            HostItem[] response = service.hostsList(TestVariables.getToken(), TestVariables.venueId);
            TestVariables.reportFiller(docLink, hostListDescription, response);
            JerseyClient.LOG.error(response.toString());
            Assert.assertNotNull(response);
            JerseyClient.LOG.error(response.toString());
        } catch (Exception e) {
            e.printStackTrace();
            TestVariables.reportFillerStackTrace(docLink, hostListDescription, e.getLocalizedMessage());
            Assert.fail();
        }
    }
}
