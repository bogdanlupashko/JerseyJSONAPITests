package org.bl.json.jersey.model.offer;

/**
 * Created by blupashko on 17.04.2015.
 */
public class OfferWithArch extends OfferWithPeriod {

    private int archived;

    public int getArchived() {
        return archived;
    }

    public void setArchived(int archived) {
        this.archived = archived;
    }
}
