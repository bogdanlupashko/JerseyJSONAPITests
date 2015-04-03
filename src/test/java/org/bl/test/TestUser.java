package org.bl.test;

import org.bl.RestClient;
import org.bl.json.rest.jersey.AuthLogin;
import org.bl.json.rest.jersey.UserAgent;
import org.bl.json.rest.jersey.jerseyclient.JerseyClient;
import org.bl.json.rest.jersey.jerseyclient.jersey.rest.service.Auth;
import org.bl.json.rest.jersey.jerseyclient.jersey.rest.service.User;
import org.bl.json.rest.jersey.UserProfile;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by blupashko on 03.04.2015.
 */
public class TestUser {
    private String email = "google@abra.com";
    private String passwordRaw = "passwordRaw";
    private String passwordRepeat = "passwordRaw";
    private String phone = "(544)-5454-145";
    private String firstName = "firstName";
    private String lastName = "lastName";
    private String leaveDate = "leaveDate";
    private String flightTime = "44564564";


    private RestClient client;
    private String token;

    @BeforeClass
    public  void init() {
        client = new RestClient();
        token = getToken();
    }

    @Test
    public void userProfile(){
        User service = client.proxy(User.class);
        UserProfile respose = service.userProfile(token);
        JerseyClient.LOG.error(respose.toString());
        Assert.assertNotNull(respose);
        JerseyClient.LOG.error(respose.toString());
    }

    @Test
    public void userProfileUpdate(){
        User service = client.proxy(User.class);
        UserProfile respose = service.userProfile(token, email, passwordRaw, passwordRepeat, phone, firstName, lastName, leaveDate, flightTime);
        JerseyClient.LOG.error(respose.toString());
        Assert.assertNotNull(respose);
        JerseyClient.LOG.error(respose.toString());
    }

    @Test
         public void userAgent(){
        User service = client.proxy(User.class);
        UserAgent respose = service.userAgent(token);
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
