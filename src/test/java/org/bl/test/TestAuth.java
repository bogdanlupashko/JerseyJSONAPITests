package org.bl.test;

import org.bl.RestClient;
import org.bl.json.rest.jersey.AuthLogin;
import org.bl.json.rest.jersey.AuthLogout;
import org.bl.json.rest.jersey.UserProfile;
import org.bl.json.rest.jersey.jerseyclient.JerseyClient;
import org.bl.json.rest.jersey.jerseyclient.jersey.rest.service.Auth;
import org.bl.json.rest.jersey.jerseyclient.jersey.rest.service.User;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



/**
 * Created by blupashko on 03.04.2015.
 */


public class TestAuth {

    static RestClient client;
    static String token;

    @BeforeClass
    public  void init() {
        client = new RestClient();
        token = getToken();
    }

    @Test
    public void authLogin() {
        getToken();
    }

    @Test
    public void authLogout() {
        Auth service = client.proxy(Auth.class);
        AuthLogout respose = service.authLogout(token);
        Assert.assertTrue(!respose.toString().isEmpty());
        JerseyClient.LOG.error(respose.toString());
    }

    private  String getToken() {
        Auth service = client.proxy(Auth.class);
        AuthLogin respose = service.authLogin("googlecomua@mail.ru", "qqqqqq");
        Assert.assertNotNull(respose);
        Assert.assertNotNull(respose.getId());
        Assert.assertNotNull(respose.getToken());
        return respose.getToken();
    }
}