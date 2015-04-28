package org.bl.json.jersey.test;

import org.bl.json.jersey.TestVariables;
import org.bl.json.jersey.model.user.UserAgent;
import org.bl.json.jersey.client.JerseyClient;
import org.bl.json.jersey.rest.service.User;
import org.bl.json.jersey.model.user.UserProfile;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by blupashko on 03.04.2015.
 */
public class TestUser {
    public static UserProfile userProfile;

    @Test(description = "<br> <br> <br> <b>Description </b>User profile  test Vegaster <br> <a href=\"http://vegaster.webprv.com/api/doc#user\">API doc</a>")
    public void userProfile() {
        User service = TestVariables.getClient().proxy(User.class);
        userProfile = service.userProfile(TestVariables.getToken());
        JerseyClient.LOG.error(userProfile.toString());
        Assert.assertNotNull(userProfile);
        JerseyClient.LOG.error(userProfile.toString());
    }

    @Test(description = "<br> <br> <br> <b>Description </b>Support agent  test Vegaster <br> <a href=\"http://vegaster.webprv.com/api/doc#user\">API doc</a>")
    public void userAgent() {
        User service = TestVariables.getClient().proxy(User.class);
        UserAgent response = service.userAgent(TestVariables.getToken());
        Assert.assertNotNull(response);
    }
}
