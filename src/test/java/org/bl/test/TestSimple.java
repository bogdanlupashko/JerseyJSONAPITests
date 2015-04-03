package org.bl.test;

import org.bl.RestClient;
import org.bl.json.rest.jersey.AuthLogin;
import org.bl.json.rest.jersey.jerseyclient.jersey.rest.service.Auth;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



/**
 * Created by blupashko on 03.04.2015.
 */


public class TestSimple {

    static RestClient client;
    static String token;

    @BeforeClass
    public  void init() {
        client = new RestClient();
        token = getToken();
    }

    @Test
    public void loginTests() {
        getToken();
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
