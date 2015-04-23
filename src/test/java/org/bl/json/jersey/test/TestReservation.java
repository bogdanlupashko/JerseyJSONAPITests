package org.bl.json.jersey.test;

import org.bl.json.jersey.RestClient;
import org.bl.json.jersey.client.JerseyClient;
import org.bl.json.jersey.model.auth.AuthLogin;
import org.bl.json.jersey.model.host.HostItem;
import org.bl.json.jersey.model.host.HostsList;
import org.bl.json.jersey.model.reservation.ReservationItem;
import org.bl.json.jersey.rest.service.Auth;
import org.bl.json.jersey.rest.service.Host;
import org.bl.json.jersey.rest.service.Reservation;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author Bogdan Lupashko
 */

public class TestReservation {

    static RestClient client;
    static String token;
    private int id = 40;//need to be changed

    @BeforeClass
    public  void init() {
        client = new RestClient();
        token = getToken();
    }



    @Test
    public void reservationItem() {
        Reservation service = client.proxy(Reservation.class);
        ReservationItem respose = service.reservationItem(token, id);
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
