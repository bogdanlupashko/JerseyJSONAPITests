package org.bl.json.jersey.test;

import org.bl.json.jersey.TestVariables;
import org.bl.json.jersey.client.JerseyClient;
import org.bl.json.jersey.model.offer.OfferWithArch;
import org.bl.json.jersey.rest.service.Offer;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author Bogdan Lupashko
 */

public class TestOffer {
    private static final String docLink = "http://vegaster.webprv.com/api/doc#offer";
    private static final String offerListDescription = "Offers list test";
    private static final String offerItemDescription = "Selected offer test";

    static OfferWithArch[] offers;

    @Test(description = TestVariables.DESCRIPTION_TESTS_HEADER + offerListDescription  + "<br> <a href=" + docLink + ">" + TestVariables.LINK_API_DOC_HEADER + "</a>")
    public void offerList() {
        Offer service = TestVariables.getClient().proxy(Offer.class);
        offers = service.offerList(TestVariables.getToken(), TestVariables.getVenueId(), TestVariables.getReservedDateTime());
        TestVariables.reportFiller(docLink, offerListDescription, offers);
        JerseyClient.LOG.error(offers.toString());
        Assert.assertNotNull(offers);
        JerseyClient.LOG.error(offers.toString());
    }

    @Test(description = TestVariables.DESCRIPTION_TESTS_HEADER + offerItemDescription  + "<br> <a href=" + docLink + ">" + TestVariables.LINK_API_DOC_HEADER + "</a>")
    public void offerItem() {
        Offer service = TestVariables.getClient().proxy(Offer.class);
        OfferWithArch offerItem = service.offerItem(TestVariables.getToken(), TestVariables.getOfferId(), getPeriod(offers));
        TestVariables.reportFiller(docLink, offerItemDescription, offerItem);
        JerseyClient.LOG.error(offerItem.toString());
        Assert.assertNotNull(offerItem);
        JerseyClient.LOG.error(offerItem.toString());
    }

    private int getPeriod(OfferWithArch[] offers){
        for (int i = 0; i < offers.length; i++) {
            if (offers[i].getId() == TestVariables.getOfferId()){
                return offers[i].getPeriodId();
            }
        }
        return 0;
    }
}
