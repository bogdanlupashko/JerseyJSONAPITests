package org.bl.json.jersey.test;

import org.bl.json.jersey.TestVariables;
import org.bl.json.jersey.client.JerseyClient;
import org.bl.json.jersey.rest.service.Notification;
import org.bl.json.jersey.model.notification.NotificationCount;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author Bogdan Lupashko
 */

public class TestNotification {
    private static final String notificationCountDescription = "Notification test";
    private static final String docLink = "http://vegaster.webprv.com/api/doc#notification";

    @Test(description = TestVariables.DESCRIPTION_TESTS_HEADER + notificationCountDescription  + "<br> <a href=" + docLink + ">" + TestVariables.LINK_API_DOC_HEADER + "</a>")
    public void notificationCount() {
        Notification service = TestVariables.getClient().proxy(Notification.class);
        NotificationCount response = service.notificationCount(TestVariables.getToken());
        TestVariables.reportFiller(docLink, notificationCountDescription, response);
        JerseyClient.LOG.error(response.toString());
        Assert.assertNotNull(response);
        JerseyClient.LOG.error(response.toString());
    }

}
