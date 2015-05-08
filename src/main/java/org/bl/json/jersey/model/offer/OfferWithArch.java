package org.bl.json.jersey.model.offer;

/**
 * @author Bogdan Lupashko
 */
public class OfferWithArch extends OfferItem {

    private boolean archived;

    public boolean getArchived() {
        return archived;
    }

    public void setArchived(Object archived) {
        if (archived instanceof Boolean) {
            this.archived = (Boolean)archived;
        } else if (archived instanceof Integer){
            this.archived = ((Integer) archived).equals(1);
        }
    }
}
