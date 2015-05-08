package org.bl.json.jersey.test;

import org.bl.json.jersey.TestVariables;
import org.bl.json.jersey.client.JerseyClient;
import org.bl.json.jersey.model.errors.ErrorString;
import org.bl.json.jersey.model.notification.NotificationItem;
import org.bl.json.jersey.rest.service.Notification;
import org.bl.json.jersey.model.notification.NotificationCount;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.ws.rs.ProcessingException;
import javax.ws.rs.WebApplicationException;

/**
 * @author Bogdan Lupashko
 */

public class TestNotification {
    private static final String notificationCountDescription = "Notification test";
    private static final String notificationListDescription = "Notification list test";
    private static final String notificationReadDescription = "Notification read test";
    private static final String docLink = "http://vegaster.webprv.com/api/doc#notification";
    public static  NotificationItem[] notificationItems;

    @Test(description = TestVariables.DESCRIPTION_TESTS_HEADER + notificationCountDescription + "<br> <a href=" + docLink + ">" + TestVariables.LINK_API_DOC_HEADER + "</a>")
    public void notificationCount() {
        try {
            Notification service = TestVariables.getClient().proxy(Notification.class);
            NotificationCount response;
            response = service.notificationCount(TestVariables.getToken());
            TestVariables.reportFiller(docLink, notificationCountDescription, response);
            JerseyClient.LOG.error(response.toString());
            Assert.assertNotNull(response);
            JerseyClient.LOG.error(response.toString());
        } catch (WebApplicationException errorsMessage) {
            try {
                TestVariables.reportFiller(docLink, notificationCountDescription, errorsMessage.getResponse().readEntity(org.bl.json.jersey.model.errors.Error.class));

            } catch (ProcessingException e) {
                try {
                    TestVariables.reportFiller(docLink, notificationCountDescription, errorsMessage.getResponse().readEntity(ErrorString.class));
                } catch (ProcessingException e1) {
                    TestVariables.reportFillerStackTrace(docLink, notificationCountDescription, errorsMessage.getLocalizedMessage());
                }
            }
        } catch (ProcessingException pro) {
            TestVariables.reportFillerStackTrace(docLink, notificationCountDescription, pro.getLocalizedMessage());
            Assert.fail("Object mapping failed : ", pro.getCause());
        }
    }

    @Test(description = TestVariables.DESCRIPTION_TESTS_HEADER + notificationListDescription + "<br> <a href=" + docLink + ">" + TestVariables.LINK_API_DOC_HEADER + "</a>")
    public void notificationList() {
        try {
            Notification service = TestVariables.getClient().proxy(Notification.class);
            notificationItems = service.notificationList(TestVariables.getToken());
            TestVariables.reportFiller(docLink, notificationListDescription, notificationItems);
            JerseyClient.LOG.error(notificationItems.toString());
            Assert.assertNotNull(notificationItems);
            JerseyClient.LOG.error(notificationItems.toString());
        } catch (WebApplicationException errorsMessage) {
            try {
                TestVariables.reportFiller(docLink, notificationListDescription, errorsMessage.getResponse().readEntity(org.bl.json.jersey.model.errors.Error.class));

            } catch (ProcessingException e) {
                try {
                    TestVariables.reportFiller(docLink, notificationListDescription, errorsMessage.getResponse().readEntity(ErrorString.class));
                } catch (ProcessingException e1) {
                    TestVariables.reportFillerStackTrace(docLink, notificationListDescription, errorsMessage.getLocalizedMessage());
                }
            }
        } catch (ProcessingException pro) {
            TestVariables.reportFillerStackTrace(docLink, notificationListDescription, pro.getLocalizedMessage());
            Assert.fail("Object mapping failed : ", pro.getCause());
        }
    }

    @Test(description = TestVariables.DESCRIPTION_TESTS_HEADER + notificationReadDescription + "<br> <a href=" + docLink + ">" + TestVariables.LINK_API_DOC_HEADER + "</a>")
    public void notificationRead() {
        try {
            Notification service = TestVariables.getClient().proxy(Notification.class);
            String response = service.notificationRead(TestVariables.getToken(), getUnreadNotification(notificationItems));
            TestVariables.reportFiller(docLink, notificationReadDescription, response);
            JerseyClient.LOG.error(response.toString());
            Assert.assertNotNull(response);
            JerseyClient.LOG.error(response.toString());
        } catch (WebApplicationException errorsMessage) {
            try {
                TestVariables.reportFiller(docLink, notificationReadDescription, errorsMessage.getResponse().readEntity(org.bl.json.jersey.model.errors.Error.class));

            } catch (ProcessingException e) {
                try {
                    TestVariables.reportFiller(docLink, notificationReadDescription, errorsMessage.getResponse().readEntity(ErrorString.class));
                } catch (ProcessingException e1) {
                    TestVariables.reportFillerStackTrace(docLink, notificationReadDescription, errorsMessage.getLocalizedMessage());
                }
            }
        } catch (ProcessingException pro) {
            TestVariables.reportFillerStackTrace(docLink, notificationReadDescription, pro.getLocalizedMessage());
            Assert.fail("Object mapping failed : ", pro.getCause());
        }
    }

    private int getUnreadNotification(NotificationItem[] notificationItems){
        for (NotificationItem item : notificationItems) {
            if (!item.getRead()) {
                return item.getId();
            }
        }
        return 0;
    }
}
