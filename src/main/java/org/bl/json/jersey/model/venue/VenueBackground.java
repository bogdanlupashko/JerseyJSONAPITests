package org.bl.json.jersey.model.venue;

import org.bl.json.jersey.model.components.Image;

import java.util.Map;


/**
 * Created by blupashko on 23.04.2015.
 */
public class VenueBackground {

    private String name;
    private String url;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
