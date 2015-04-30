package org.bl.json.jersey.model.host;

import java.util.Map;

/**
 * @author Bogdan Lupashko
 */

public class HostForPriceYourRequest extends HostSimple {

    private Map<String, String> image;

    public Map<String, String> getImage() {
        return image;
    }

    public void setImage(Map<String, String> image) {
        this.image = image;
    }
}
