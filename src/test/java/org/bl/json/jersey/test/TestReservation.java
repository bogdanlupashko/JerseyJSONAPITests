package org.bl.json.jersey.test;

import org.bl.json.jersey.TestVariables;
import org.bl.json.jersey.client.JerseyClient;
import org.bl.json.jersey.model.components.Offerss;
import org.bl.json.jersey.model.reservation.ReservationItem;
import org.bl.json.jersey.model.reservation.ReservationItemNe;
import org.bl.json.jersey.rest.service.Reservation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author Bogdan Lupashko
 */

public class TestReservation {
    private static Logger LOGGER = LoggerFactory.getLogger(TestReservation.class.getName());
    static ReservationItemNe response;

    @Test(description = "<br> <br> <br> <b>Description </b>Selected reservation test Vegaster <br> <a href=\"http://vegaster.webprv.com/api/doc#reservation\">API doc</a>")
    public void reservationItem() {
        Reservation service = TestVariables.getClient().proxy(Reservation.class);
        ReservationItem reservationItem = service.reservationItem(TestVariables.getToken(), response.getReservationId());
        JerseyClient.LOG.error(reservationItem.toString());
        Assert.assertNotNull(reservationItem);
        JerseyClient.LOG.error(reservationItem.toString());
    }

    @Test(description = "<br> <br> <br> <b>Description </b>Request reservation test Vegaster <br> <a href=\"http://vegaster.webprv.com/api/doc#reservation\">API doc</a>")
    public void reservationItemPost() {
        Reservation service = TestVariables.getClient().proxy(Reservation.class);
        response = service.reservationItemPost(TestVariables.getToken(),
                TestUser.userProfile.getPhone(),
                TestVariables.getMalesCount(),
                TestUser.userProfile.getFirstName(),
                TestVariables.getReservedDateTime(),
                TestVariables.getOfferId(),
                TestVariables.getFemalesCount(),
                TestUser.userProfile.getEmail(),
                getPeriod(TestOffer.offers),
                TestUser.userProfile.getLastName());

        JerseyClient.LOG.error(response.toString());
        LOGGER.error(response.toString());
        Assert.assertNotNull(response);
        JerseyClient.LOG.error(response.toString());
    }

    private int getPeriod(Offerss[] offers) {
        for (int i = 0; i < offers.length; i++) {
            if (offers[i].getId() == TestVariables.getOfferId()) {
                return offers[i].getPeriodId();
            }
        }
        return 0;
    }
}
