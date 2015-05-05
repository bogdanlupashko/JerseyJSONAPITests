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
    private static final String reservationItemDeleteDescription = "Request delete test";
    private static final String reservationItemPayDescription = "Request payment test";
    private static final String docLink = "http://vegaster.webprv.com/api/doc#reservation";

    static ReservationItemGetId reservationItemId;

    @Test(description = TestVariables.DESCRIPTION_TESTS_HEADER + reservationItemDescription + "<br> <a href=" + docLink + ">" + TestVariables.LINK_API_DOC_HEADER + "</a>")
    public void reservationItem() {
        try {
            Reservation service = TestVariables.getClient().proxy(Reservation.class);
            ReservationItem reservationItem = service.reservationItem(TestVariables.getToken(), reservationItemId.getReservationId());
            TestVariables.reportFiller(docLink, reservationItemDescription, reservationItem);
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
            reservationItemId = service.reservationItemPost(TestVariables.getToken(),
                    TestUser.userProfile.getPhone(),
                    TestVariables.malesCount,
                    TestUser.userProfile.getFirstName(),
                    TestVariables.reservedDateTime,
                    TestVariables.offerId,
                    TestVariables.femalesCount,
                    TestUser.userProfile.getEmail(),
                    getPeriod(TestOffer.offers),
                    TestUser.userProfile.getLastName());

            TestVariables.reportFiller(docLink, reservationItemPostDescription, reservationItemId);
            JerseyClient.LOG.error(reservationItemId.toString());
            LOGGER.error(reservationItemId.toString());
            Assert.assertNotNull(reservationItemId);
            JerseyClient.LOG.error(reservationItemId.toString());
        } catch (Exception e) {
            e.printStackTrace();
            TestVariables.reportFillerStackTrace(docLink, reservationItemPostDescription, e.getLocalizedMessage());
            Assert.fail();
        }
    }

    @Test(description = TestVariables.DESCRIPTION_TESTS_HEADER + reservationItemDeleteDescription + "<br> <a href=" + docLink + ">" + TestVariables.LINK_API_DOC_HEADER + "</a>")
    public void reservationItemDelete() {
        try {
            Reservation service = TestVariables.getClient().proxy(Reservation.class);
            String response = service.reservationItemDelete(TestVariables.getToken(),
                    reservationItemId.getReservationId());

            TestVariables.reportFiller(docLink, reservationItemDeleteDescription, response);
            JerseyClient.LOG.error(response.toString());
            LOGGER.error(response.toString());
            Assert.assertNotNull(response);
            JerseyClient.LOG.error(response.toString());
        } catch (Exception e) {
            e.printStackTrace();
            TestVariables.reportFillerStackTrace(docLink, reservationItemDeleteDescription, e.getLocalizedMessage());
            Assert.fail();
        }
    }

    @Test(description = TestVariables.DESCRIPTION_TESTS_HEADER + reservationItemPayDescription + "<br> <a href=" + docLink + ">" + TestVariables.LINK_API_DOC_HEADER + "</a>")
    public void reservationItemPay() {
        try {
            Reservation service = TestVariables.getClient().proxy(Reservation.class);
            String response = service.reservationItemPay(TestVariables.getToken(),
                    reservationItemId.getReservationId(),
                    TestVariables.paymentId);

            TestVariables.reportFiller(docLink, reservationItemPayDescription, response);
            JerseyClient.LOG.error(response.toString());
            LOGGER.error(response.toString());
            Assert.assertNotNull(response);
            JerseyClient.LOG.error(response.toString());
        } catch (Exception e) {
            e.printStackTrace();
            TestVariables.reportFillerStackTrace(docLink, reservationItemPayDescription, e.getLocalizedMessage());
            Assert.fail();
        }
    }

    private int getPeriod(OfferWithArch[] offers) {
        for (int i = 0; i < offers.length; i++) {
            if (offers[i].getId() == TestVariables.offerId) {
                return offers[i].getPeriodId();
            }
        }
        return 0;
    }
}
