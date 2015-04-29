package org.bl.json.jersey.model.offer;

/**
 * @author Bogdan Lupashko
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
