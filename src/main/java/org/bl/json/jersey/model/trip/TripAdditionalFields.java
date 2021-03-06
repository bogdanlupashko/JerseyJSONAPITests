package org.bl.json.jersey.model.trip;

/**
 * @author Bogdan Lupashko
 */

public class TripAdditionalFields {
    private String name;
    private String value;
    private String label;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
