package org.bl.json.jersey.test;

import org.bl.json.jersey.TestVariables;
import org.bl.json.jersey.client.JerseyClient;
import org.bl.json.jersey.model.notification.NotificationItem;
import org.bl.json.jersey.rest.service.Notification;
import org.bl.json.jersey.model.notification.NotificationCount;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author Bogdan Lupashko
 */

public class TestNotification {
    private static final String notificationCountDescription = "Notification test";
    private static final String notificationListDescription = "Notification list test";
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
        } catch (Exception e) {
            e.printStackTrace();
            TestVariables.reportFillerStackTrace(docLink, notificationCountDescription, e.getLocalizedMessage());
            Assert.fail();
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
        } catch (Exception e) {
            e.printStackTrace();
            TestVariables.reportFillerStackTrace(docLink, notificationListDescription, e.getLocalizedMessage());
            Assert.fail();
        }
    }

    @Test(description = TestVariables.DESCRIPTION_TESTS_HEADER + notificationListDescription + "<br> <a href=" + docLink + ">" + TestVariables.LINK_API_DOC_HEADER + "</a>")
    public void notificationRead() {
        try {
            Notification service = TestVariables.getClient().proxy(Notification.class);
            String response = service.notificationRead(TestVariables.getToken(), getUnreadNotification(notificationItems));
            TestVariables.reportFiller(docLink, notificationListDescription, response);
            JerseyClient.LOG.error(response.toString());
            Assert.assertNotNull(response);
            JerseyClient.LOG.error(response.toString());
        } catch (Exception e) {
            e.printStackTrace();
            TestVariables.reportFillerStackTrace(docLink, notificationListDescription, e.getLocalizedMessage());
            Assert.fail();
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
