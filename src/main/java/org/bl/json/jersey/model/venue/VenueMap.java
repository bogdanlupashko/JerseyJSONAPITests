package org.bl.json.jersey.model.venue;

import java.util.Map;

/**
 * @author Bogdan Lupashko
 */

public class VenueMap extends VenueSimple {
    private Map<String, String> pin;
    private int pinId;
    private float lat;
    private float lng;

    public Map<String, String> getPin() {
        return pin;
    }

    public void setPin(Map<String, String> pin) {
        this.pin = pin;
    }

    public int getPinId() {
        return pinId;
    }

    public void setPinId(int pinId) {
        this.pinId = pinId;
    }

    public float getLat() {
        return lat;
    }

    public void setLat(float lat) {
        this.lat = lat;
    }

    public float getLng() {
        return lng;
    }

    public void setLng(float lng) {
        this.lng = lng;
    }
}
