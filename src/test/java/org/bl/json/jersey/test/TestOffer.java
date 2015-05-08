package org.bl.json.jersey.test;

import org.bl.json.jersey.TestVariables;
import org.bl.json.jersey.client.JerseyClient;
import org.bl.json.jersey.model.errors.ErrorString;
import org.bl.json.jersey.model.offer.OfferWithArch;
import org.bl.json.jersey.rest.service.Offer;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.ws.rs.ProcessingException;
import javax.ws.rs.WebApplicationException;

/**
 * @author Bogdan Lupashko
 */

public class TestOffer {
    private static final String docLink = "http://vegaster.webprv.com/api/doc#offer";
    private static final String offerListDescription = "Offers list test";
    private static final String offerItemDescription = "Selected offer test";

    static OfferWithArch[] offers;

    @Test(description = TestVariables.DESCRIPTION_TESTS_HEADER + offerListDescription + "<br> <a href=" + docLink + ">" + TestVariables.LINK_API_DOC_HEADER + "</a>")
    public void offerList() {
        try {
            Offer service = TestVariables.getClient().proxy(Offer.class);
            offers = service.offerList(TestVariables.getToken(),
                    TestVariables.venueId);

            TestVariables.reportFiller(docLink, offerListDescription, offers);
            JerseyClient.LOG.error(offers.toString());
            Assert.assertNotNull(offers);

        } catch (WebApplicationException errorsMessage) {
            errorsMessage.printStackTrace();
//            try {
//                TestVariables.reportFiller(docLink, offerListDescription, errorsMessage.getResponse().readEntity(Error.class));
//
//            } catch (ProcessingException e) {
//                try {
//                    e.printStackTrace();
//                    TestVariables.reportFiller(docLink, offerListDescription, errorsMessage.getResponse().readEntity(ErrorString.class));
//                } catch (ProcessingException e1) {
//                    e1.printStackTrace();
//                    TestVariables.reportFillerStackTrace(docLink, offerListDescription, errorsMessage.getLocalizedMessage());
//                }
//            }
//        } catch (ProcessingException pro) {
//
//            TestVariables.reportFillerStackTrace(docLink, offerListDescription, pro.getLocalizedMessage());
//            Assert.fail("Object mapping failed : ", pro.getCause());
        }

    }

    @Test(description = TestVariables.DESCRIPTION_TESTS_HEADER + offerItemDescription + "<br> <a href=" + docLink + ">" + TestVariables.LINK_API_DOC_HEADER + "</a>")
    public void offerItem() {
        try {
            Offer service = TestVariables.getClient().proxy(Offer.class);
            OfferWithArch offerItem = service.offerItem(TestVariables.getToken(), TestVariables.offerId, getPeriod(offers));
            TestVariables.reportFiller(docLink, offerItemDescription, offerItem);
            JerseyClient.LOG.error(offerItem.toString());
            Assert.assertNotNull(offerItem);
            JerseyClient.LOG.error(offerItem.toString());
        } catch (WebApplicationException errorsMessage) {
            try {
                TestVariables.reportFiller(docLink, offerItemDescription, errorsMessage.getResponse().readEntity(Error.class));

            } catch (ProcessingException e) {
                try {
                    TestVariables.reportFiller(docLink, offerItemDescription, errorsMessage.getResponse().readEntity(ErrorString.class));
                } catch (ProcessingException e1) {
                    TestVariables.reportFillerStackTrace(docLink, offerItemDescription, errorsMessage.getLocalizedMessage());
                }
            }
        } catch (ProcessingException pro) {
            TestVariables.reportFillerStackTrace(docLink, offerItemDescription, pro.getLocalizedMessage());
            Assert.fail("Object mapping failed : ", pro.getCause());
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
