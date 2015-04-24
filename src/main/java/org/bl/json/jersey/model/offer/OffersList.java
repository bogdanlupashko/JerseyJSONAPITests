package org.bl.json.jersey.model.offer;

import org.bl.json.jersey.model.components.Offers;

import java.util.LinkedList;

/**
 * Created by blupashko on 17.04.2015.
 */
public class OffersList {
    private LinkedList<Offers> offers;

    public LinkedList<Offers> getOffers() {
        return offers;
    }

    public void setOffers(LinkedList<Offers> offers) {
        this.offers = offers;
    }
}
