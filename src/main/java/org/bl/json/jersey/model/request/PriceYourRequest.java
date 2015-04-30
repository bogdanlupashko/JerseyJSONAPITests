package org.bl.json.jersey.model.request;

import org.bl.json.jersey.model.host.HostForPriceYourRequest;
import java.util.Map;

/**
 * @author Bogdan Lupashko
 */

public class PriceYourRequest extends Request{

    private HostForPriceYourRequest host;
    private int venueId;
    private String venueName;
    private Map<String, String> venueBackground;
    private String[] venuePlans;

    public HostForPriceYourRequest getHost() {
        return host;
    }

    public void setHost(HostForPriceYourRequest host) {
        this.host = host;
    }

    public int getVenueId() {
        return venueId;
    }

    public void setVenueId(int venueId) {
        this.venueId = venueId;
    }

    public String getVenueName() {
        return venueName;
    }

    public void setVenueName(String venueName) {
        this.venueName = venueName;
    }

    public Map<String, String> getVenueBackground() {
        return venueBackground;
    }

    public void setVenueBackground(Map<String, String> venueBackground) {
        this.venueBackground = venueBackground;
    }

    public String[] getVenuePlans() {
        return venuePlans;
    }

    public void setVenuePlans(String[] venuePlans) {
        this.venuePlans = venuePlans;
    }
}
