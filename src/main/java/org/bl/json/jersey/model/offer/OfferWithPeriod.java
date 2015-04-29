package org.bl.json.jersey.model.offer;

/**
 * @author Bogdan Lupashko
 */
public class OfferWithPeriod extends OfferItem {

    private int periodId;

    public int getPeriodId() {
        return periodId;
    }

    public void setPeriodId(int periodId) {
        this.periodId = periodId;
    }
}
