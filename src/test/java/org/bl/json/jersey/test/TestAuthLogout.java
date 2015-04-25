package org.bl.json.jersey.test;


import org.bl.json.jersey.RestClient;
import org.bl.json.jersey.model.auth.AuthLogin;
import org.bl.json.jersey.rest.service.Auth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;


/**
 * Created by blupashko on 03.04.2015.
 */


public class TestAuthLogout {
    public static Logger LOGGER = LoggerFactory.getLogger(TestAuthLogout.class.getName());

    static RestClient client;
    static String token;

    @BeforeClass
    public  void init() {
        client = new RestClient();
        token = getToken();
       // LOGGER.error(token);
    }

//    @Test
//    public void authLogin() {
//        token = getToken();
//    }

//    @Test
//    public void authLogout() {
//        Auth service = client.proxy(Auth.class);
//        String respose = service.authLogout(token);
//        Assert.assertTrue(respose.toString().isEmpty());
//        JerseyClient.LOG.error(respose.toString());
//    }

    private  String getToken() {
        if (TestAuth.token != null) {
            LOGGER.error("if statement");
            return TestAuth.token;
        } else {
            LOGGER.error("else statement");

            Auth service = client.proxy(Auth.class);
            AuthLogin respose = service.authLogin("googlecomua@mail.ru", "qqqqqq");
            Assert.assertNotNull(respose);
            Assert.assertNotNull(respose.getId());
            Assert.assertNotNull(respose.getToken());
            return respose.getToken();
        }
    }
}
