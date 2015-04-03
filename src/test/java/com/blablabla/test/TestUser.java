package com.blablabla.test;

import com.blablabla.RestClient;
import com.javacodegeeks.enterprise.rest.jersey.AuthLogin;
import com.javacodegeeks.enterprise.rest.jersey.jerseyclient.jersey.rest.service.Auth;
import com.javacodegeeks.enterprise.rest.jersey.UserProfile;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by blupashko on 03.04.2015.
 */
public class TestUser {
    private RestClient client;
    private String token;

    @BeforeClass
    public  void init() {
        client = new RestClient();
        token = getToken();
    }

    @Test
    public void userProfile(){
        Auth service = client.proxy(Auth.class);
        UserProfile respose = service.userProfile(token);
        Assert.assertNotNull(respose);
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
