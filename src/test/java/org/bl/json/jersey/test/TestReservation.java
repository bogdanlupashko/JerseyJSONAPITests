package org.bl.json.jersey.test;

import org.bl.json.jersey.TestVariables;
import org.bl.json.jersey.client.JerseyClient;
import org.bl.json.jersey.model.offer.OfferWithArch;
import org.bl.json.jersey.model.reservation.ReservationItem;
import org.bl.json.jersey.model.reservation.ReservationItemGetId;
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
    private static final String reservationItemDescription = "Selected reservation test";
    private static final String reservationItemPostDescription = "Request reservation test";
    private static final String docLink = "http://vegaster.webprv.com/api/doc#reservation";

    static ReservationItemGetId response;

    @Test(description = TestVariables.DESCRIPTION_TESTS_HEADER + reservationItemDescription + "<br> <a href=" + docLink + ">" + TestVariables.LINK_API_DOC_HEADER + "</a>")
    public void reservationItem() {
        try {
            Reservation service = TestVariables.getClient().proxy(Reservation.class);
            ReservationItem reservationItem = service.reservationItem(TestVariables.getToken(), response.getReservationId());
            TestVariables.reportFiller(docLink, reservationItemDescription, response);
            JerseyClient.LOG.error(reservationItem.toString());
            Assert.assertNotNull(reservationItem);
            JerseyClient.LOG.error(reservationItem.toString());
        } catch (Exception e) {
            e.printStackTrace();
            TestVariables.reportFillerStackTrace(docLink, reservationItemDescription, e.getLocalizedMessage());
            Assert.fail();
        }
    }

    @Test(description = TestVariables.DESCRIPTION_TESTS_HEADER + reservationItemPostDescription + "<br> <a href=" + docLink + ">" + TestVariables.LINK_API_DOC_HEADER + "</a>")
    public void reservationItemPost() {
        try {
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

            TestVariables.reportFiller(docLink, reservationItemPostDescription, response);
            JerseyClient.LOG.error(response.toString());
            LOGGER.error(response.toString());
            Assert.assertNotNull(response);
            JerseyClient.LOG.error(response.toString());
        } catch (Exception e) {
            e.printStackTrace();
            TestVariables.reportFillerStackTrace(docLink, reservationItemPostDescription, e.getLocalizedMessage());
            Assert.fail();
        }
    }

    private int getPeriod(OfferWithArch[] offers) {
        for (int i = 0; i < offers.length; i++) {
            if (offers[i].getId() == TestVariables.getOfferId()) {
                return offers[i].getPeriodId();
            }
        }
        return 0;
    }
}
