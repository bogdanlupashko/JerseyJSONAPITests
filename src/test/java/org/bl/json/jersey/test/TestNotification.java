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

    @Test(description = "<br> <br> <br> <b>Description </b>Notification test Vegaster <br> <a href=\"http://vegaster.webprv.com/api/doc#notification\">API doc</a>")
    public void notificationCount() {
        Notification service = TestVariables.getClient().proxy(Notification.class);
        NotificationCount response = service.notificationCount(TestVariables.getToken());
        JerseyClient.LOG.error(response.toString());
        Assert.assertNotNull(response);
        JerseyClient.LOG.error(response.toString());
    }

}
