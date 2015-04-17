package org.bl.json.jersey.model.offer;

import org.bl.json.jersey.model.components.Offer;

import java.util.LinkedList;

/**
 * Created by blupashko on 17.04.2015.
 */
public class OffersList {
    private LinkedList<Offer> offers;

    public LinkedList<Offer> getOffers() {
        return offers;
    }

    public void setOffers(LinkedList<Offer> offers) {
        this.offers = offers;
    }
}
