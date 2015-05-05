package org.bl.json.jersey.test;

import org.bl.json.jersey.TestVariables;
import org.bl.json.jersey.client.JerseyClient;
import org.bl.json.jersey.model.reminder.ReminderItem;
import org.bl.json.jersey.model.reminder.ReminderItemForList;
import org.bl.json.jersey.model.request.PriceYourRequest;
import org.bl.json.jersey.rest.service.Reminder;
import org.bl.json.jersey.rest.service.Request;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author Bogdan Lupashko
 */

public class TestRequest {
    private static final String requestItemDescription = "Get request item test";
    private static final String createRequestDescription = "Create request item test";
    private static final String updateRequestStatusDescription = "Update request status test";
    private static final String docLink = "http://vegaster.webprv.com/api/doc#request";
    public static ReminderItemForList[] reminderItems;


    @Test(description = TestVariables.DESCRIPTION_TESTS_HEADER + requestItemDescription + "<br> <a href=" + docLink + ">" + TestVariables.LINK_API_DOC_HEADER + "</a>")
    public void requestItem() {
        try {
            Request service = TestVariables.getClient().proxy(Request.class);
            PriceYourRequest response = service.requestItem(TestVariables.getToken(),
                    getRequestId());
            TestVariables.reportFiller(docLink, requestItemDescription, response);
            JerseyClient.LOG.error(response.toString());
            Assert.assertNotNull(response);
            JerseyClient.LOG.error(response.toString());
        } catch (Exception e) {
            e.printStackTrace();
            TestVariables.reportFillerStackTrace(docLink, requestItemDescription, e.getLocalizedMessage());
            Assert.fail();
        }
    }

    private int getRequestId() {
        return TestVariables.requestId;
    }

    @Test(description = TestVariables.DESCRIPTION_TESTS_HEADER + createRequestDescription + "<br> <a href=" + docLink + ">" + TestVariables.LINK_API_DOC_HEADER + "</a>")
    public void requestCreate() {
        try {
            Request service = TestVariables.getClient().proxy(Request.class);
            String response = service.requestCreate(TestVariables.getToken(),
                    getVenueId(),
                    TestVariables.beginDateTime,
                    TestVariables.firstName,
                    TestVariables.lastName,
                    TestVariables.email,
                    TestVariables.phone,
                    TestVariables.malesCount,
                    TestVariables.femalesCount,
                    TestVariables.budget,
                    TestVariables.note);
            System.out.println(response);
            TestVariables.reportFiller(docLink, createRequestDescription, response);

            JerseyClient.LOG.error(response.toString());
            Assert.assertTrue(response.toString().isEmpty());
            JerseyClient.LOG.error(response.toString());
        } catch (Exception e) {
            e.printStackTrace();
            TestVariables.reportFillerStackTrace(docLink, createRequestDescription, e.getLocalizedMessage());
            Assert.fail();
        }
    }

    @Test(description = TestVariables.DESCRIPTION_TESTS_HEADER + createRequestDescription + "<br> <a href=" + docLink + ">" + TestVariables.LINK_API_DOC_HEADER + "</a>")
    public void requestStatus() {
        try {
            Request service = TestVariables.getClient().proxy(Request.class);
            String response = service.requestStatus(TestVariables.getToken(),
                    getRequestId());
            TestVariables.reportFiller(docLink, createRequestDescription, response);
            JerseyClient.LOG.error(response.toString());
            Assert.assertTrue(response.toString().isEmpty());
            JerseyClient.LOG.error(response.toString());
        } catch (Exception e) {
            e.printStackTrace();
            TestVariables.reportFillerStackTrace(docLink, createRequestDescription, e.getLocalizedMessage());
            Assert.fail();
        }
    }

    @Test(description = TestVariables.DESCRIPTION_TESTS_HEADER + updateRequestStatusDescription + "<br> <a href=" + docLink + ">" + TestVariables.LINK_API_DOC_HEADER + "</a>")
    public void requestStatusUpdate() {
        try {
            Request service = TestVariables.getClient().proxy(Request.class);
            String response = service.requestStatus(TestVariables.getToken(),
                    getRequestId(),
                    TestVariables.status);
            TestVariables.reportFiller(docLink, updateRequestStatusDescription, response);
            JerseyClient.LOG.error(response.toString());
            Assert.assertTrue(response.toString().isEmpty());
            JerseyClient.LOG.error(response.toString());
        } catch (Exception e) {
            e.printStackTrace();
            TestVariables.reportFillerStackTrace(docLink, updateRequestStatusDescription, e.getLocalizedMessage());
            Assert.fail();
        }
    }



    private int getVenueId() {
        return TestVenue.venueItem == null ? TestVariables.venueId : TestVenue.venueItem.getId();
    }


}
