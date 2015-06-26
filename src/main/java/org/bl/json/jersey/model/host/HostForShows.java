package org.bl.json.jersey.model.host;

/**
 * Created by blupashko on 26.06.2015.
 */
public class HostForShows extends HostItem {

    private int affiliateId;
    private int supportId;
    private int active;

    public int getAffiliateId() {
        return affiliateId;
    }

    public void setAffiliateId(int affiliateId) {
        this.affiliateId = affiliateId;
    }

    public int getSupportId() {
        return supportId;
    }

    public void setSupportId(int supportId) {
        this.supportId = supportId;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }
}
