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
    static OfferWithArch[] offers;

    @Test(description = "<br> <br> <br> <b>Description </b>Offers list test Vegaster <br> <a href=\"http://vegaster.webprv.com/api/doc#offer\">API doc</a>")
    public void offerList() {
        Offer service = TestVariables.getClient().proxy(Offer.class);
        offers = service.offerList(TestVariables.getToken(), TestVariables.getVenueId(), TestVariables.getReservedDateTime());
        JerseyClient.LOG.error(offers.toString());
        Assert.assertNotNull(offers);
        JerseyClient.LOG.error(offers.toString());
    }

    @Test(description = "<br> <br> <br> <b>Description </b>Selected offer test Vegaster <br> <a href=\"http://vegaster.webprv.com/api/doc#offer\">API doc</a>")
    public void offerItem() {
        Offer service = TestVariables.getClient().proxy(Offer.class);
        OfferWithArch offerItem = service.offerItem(TestVariables.getToken(), TestVariables.getOfferId(), getPeriod(offers));
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
