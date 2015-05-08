package org.bl.json.jersey.test;

import org.bl.json.jersey.TestVariables;
import org.bl.json.jersey.client.JerseyClient;
import org.bl.json.jersey.model.errors.ErrorString;
import org.bl.json.jersey.model.viator.ViatorItem;
import org.bl.json.jersey.model.viator.ViatorList;
import org.bl.json.jersey.rest.service.Viator;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.ws.rs.ProcessingException;
import javax.ws.rs.WebApplicationException;

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
        } catch (WebApplicationException errorsMessage) {
            try {
                TestVariables.reportFiller(docLink, viatorItemDescription, errorsMessage.getResponse().readEntity(org.bl.json.jersey.model.errors.Error.class));

            } catch (ProcessingException e) {
                try {
                    TestVariables.reportFiller(docLink, viatorItemDescription, errorsMessage.getResponse().readEntity(ErrorString.class));
                } catch (ProcessingException e1) {
                    TestVariables.reportFillerStackTrace(docLink, viatorItemDescription, errorsMessage.getLocalizedMessage());
                }
            }
        } catch (ProcessingException pro) {
            TestVariables.reportFillerStackTrace(docLink, viatorItemDescription, pro.getLocalizedMessage());
            Assert.fail("Object mapping failed : ", pro.getCause());
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
        } catch (WebApplicationException errorsMessage) {
            try {
                TestVariables.reportFiller(docLink, viatorListDescription, errorsMessage.getResponse().readEntity(org.bl.json.jersey.model.errors.Error.class));

            } catch (ProcessingException e) {
                try {
                    TestVariables.reportFiller(docLink, viatorListDescription, errorsMessage.getResponse().readEntity(ErrorString.class));
                } catch (ProcessingException e1) {
                    TestVariables.reportFillerStackTrace(docLink, viatorListDescription, errorsMessage.getLocalizedMessage());
                }
            }
        } catch (ProcessingException pro) {
            TestVariables.reportFillerStackTrace(docLink, viatorListDescription, pro.getLocalizedMessage());
            Assert.fail("Object mapping failed : ", pro.getCause());
        }
    }

}
