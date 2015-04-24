package org.bl.json.jersey.test;

import org.bl.json.jersey.RestClient;
import org.bl.json.jersey.client.JerseyClient;
import org.bl.json.jersey.model.auth.AuthLogin;
import org.bl.json.jersey.model.components.Offerss;
import org.bl.json.jersey.rest.service.Auth;
import org.bl.json.jersey.rest.service.Offer;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author Bogdan Lupashko
 */

public class TestOffer {
    static RestClient client;
    static String token;
    private int id = 20; // править
    private int offerId = 254;
  //  private int periodId = 45; // need to be change


    @BeforeClass
    public  void init() {
        client = new RestClient();
      //  token = TestAuth.token;
        token = getToken();
    }


    @Test
    public void offerList() {
        Offer service = client.proxy(Offer.class);
        Offerss[] respose = service.offerList(token, id);
        JerseyClient.LOG.error(respose.toString());
        Assert.assertNotNull(respose);
       // offerId = respose.getOffers().getFirst().getId();
        JerseyClient.LOG.error(respose.toString());
    }


    @Test
    public void offerItem() {
        Offer service = client.proxy(Offer.class);
        Offerss respose = service.offerItem(token, offerId);
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
