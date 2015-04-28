package org.bl.json.jersey.model.offer;

/**
 * Created by blupashko on 17.04.2015.
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
