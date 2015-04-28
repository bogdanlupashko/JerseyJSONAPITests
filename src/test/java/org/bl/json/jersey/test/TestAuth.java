package org.bl.json.jersey.test;


import org.bl.json.jersey.TestVariables;
import org.bl.json.jersey.client.JerseyClient;
import org.bl.json.jersey.rest.service.Auth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;


/**
 * Created by blupashko on 03.04.2015.
 */


public class TestAuth {
    private static Logger LOGGER = LoggerFactory.getLogger(TestAuth.class.getName());

    @Test(description = "<br> <br> <br> <b>Description </b> <br> login test Vegaster <br> <a href=\"http://vegaster.webprv.com/api/doc#auth\">API doc</a>")
    public void authLogin() {
        TestVariables.getToken();
    }

    @Test(description = "<br> <br> <br> <b>Description </b>logout test Vegaster <br> <a href=\"http://vegaster.webprv.com/api/doc#auth\">API doc</a>")
    public void authLogout() {
        Auth service = TestVariables.getClient().proxy(Auth.class);
        String response = service.authLogout(TestVariables.getToken());
        Assert.assertTrue(response.toString().isEmpty());
        JerseyClient.LOG.error(response.toString());
    }

}
