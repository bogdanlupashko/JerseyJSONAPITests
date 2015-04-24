package org.bl.json.jersey.test;


import org.bl.json.jersey.RestClient;
import org.bl.json.jersey.model.auth.AuthLogin;
import org.bl.json.jersey.model.auth.AuthLogout;
import org.bl.json.jersey.client.JerseyClient;
import org.bl.json.jersey.rest.service.Auth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



/**
 * Created by blupashko on 03.04.2015.
 */


public class TestAuth {
    public static Logger LOGGER = LoggerFactory.getLogger(TestAuth.class.getName());

    static RestClient client;
    static String token;

    @BeforeClass
    public  void init() {
        client = new RestClient();
        //token = getToken();
       // LOGGER.error(token);
    }

    @Test
    public void authLogin() {
        token = getToken();
    }

//    @Test
//    public void authLogout() {
//        Auth service = client.proxy(Auth.class);
//        AuthLogout respose = service.authLogout(token);
//        Assert.assertTrue(!respose.toString().isEmpty());
//        JerseyClient.LOG.error(respose.toString());
//    }

    private  String getToken() {
        Auth service = client.proxy(Auth.class);
        AuthLogin respose = service.authLogin("googlecomua@mail.ru", "qqqqqq");
        Assert.assertNotNull(respose);
        Assert.assertNotNull(respose.getId());
        Assert.assertNotNull(respose.getToken());
        LOGGER.error("response auth : " + respose.getToken());
        return respose.getToken();
    }
}
