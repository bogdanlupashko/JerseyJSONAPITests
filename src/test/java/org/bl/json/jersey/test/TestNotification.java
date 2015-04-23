package org.bl.json.jersey.test;

import org.bl.json.jersey.RestClient;
import org.bl.json.jersey.client.JerseyClient;
import org.bl.json.jersey.model.auth.AuthLogin;
import org.bl.json.jersey.rest.service.Notification;
import org.bl.json.jersey.model.host.HostItem;
import org.bl.json.jersey.model.host.HostsList;
import org.bl.json.jersey.model.notification.NotificationCount;
import org.bl.json.jersey.rest.service.Auth;
import org.bl.json.jersey.rest.service.Host;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author Bogdan Lupashko
 */

public class TestNotification {
    static RestClient client;
    static String token;


    @BeforeClass
    public  void init() {
        client = new RestClient();
        token = getToken();
    }

    @Test
    public void notificationCount() {
        Notification service = client.proxy(Notification.class);
        NotificationCount respose = service.notificationCount(token);
        JerseyClient.LOG.error(respose.toString());
        Assert.assertNotNull(respose);
        JerseyClient.LOG.error(respose.toString());
    }



    private String getToken() {
        if (TestAuth.token != null) {
            return TestAuth.token;
        } else {
            Auth service = client.proxy(Auth.class);
            AuthLogin respose = service.authLogin("googlecomua@mail.ru", "qqqqqq");
            Assert.assertNotNull(respose);
            Assert.assertNotNull(respose.getId());
            Assert.assertNotNull(respose.getToken());
            return respose.getToken();
        }
    }

}
