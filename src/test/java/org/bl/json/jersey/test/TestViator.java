package org.bl.json.jersey.test;

import org.bl.json.jersey.TestVariables;
import org.bl.json.jersey.client.JerseyClient;
import org.bl.json.jersey.model.viator.ViatorItem;
import org.bl.json.jersey.model.viator.ViatorList;
import org.bl.json.jersey.rest.service.Viator;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author Bogdan Lupashko
 */

public class TestViator {
    private static final String viatorItemDescription = "Viator item  test";
    private static final String viatorListDescription = "Viator list test";
    private static final String docLink = "http://vegaster.webprv.com/api/doc#viator";


    @Test(description = TestVariables.DESCRIPTION_TESTS_HEADER + viatorItemDescription + "<br> <a href=" + docLink + ">" + TestVariables.LINK_API_DOC_HEADER + "</a>")
    public void viatorItem() {
        try {
            Viator service = TestVariables.getClient().proxy(Viator.class);
            ViatorItem response = service.viatorItem(TestVariables.getToken(),
                    TestVariables.viatorId);
            TestVariables.reportFiller(docLink, viatorItemDescription, response);
            JerseyClient.LOG.error(response.toString());
            Assert.assertNotNull(response);
            JerseyClient.LOG.error(response.toString());
        } catch (Exception e) {
            e.printStackTrace();
            TestVariables.reportFillerStackTrace(docLink, viatorItemDescription, e.getLocalizedMessage());
            Assert.fail();
        }
    }
    @Test(description = TestVariables.DESCRIPTION_TESTS_HEADER + viatorListDescription + "<br> <a href=" + docLink + ">" + TestVariables.LINK_API_DOC_HEADER + "</a>")
    public void viatorList() {
        try {
            Viator service = TestVariables.getClient().proxy(Viator.class);
            ViatorList[] response = service.viatorList(TestVariables.getToken(),
                    TestVariables.viatorId);
            TestVariables.reportFiller(docLink, viatorListDescription, response);
            JerseyClient.LOG.error(response.toString());
            Assert.assertNotNull(response);
            JerseyClient.LOG.error(response.toString());
        } catch (Exception e) {
            e.printStackTrace();
            TestVariables.reportFillerStackTrace(docLink, viatorListDescription, e.getLocalizedMessage());
            Assert.fail();
        }
    }

}
