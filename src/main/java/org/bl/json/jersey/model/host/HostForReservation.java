package org.bl.json.jersey.model.host;

import java.util.Map;

/**
 * @author Bogdan Lupashko
 */
public class HostForReservation extends HostSimple {
    private Map<String, String> photo;

    public Map<String, String> getPhoto() {
        return photo;
    }

    public void setPhoto(Map<String, String> photo) {
        this.photo = photo;
    }
}
