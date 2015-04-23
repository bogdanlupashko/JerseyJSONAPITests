package org.bl.json.jersey.model.components;

/**
 * Created by blupashko on 23.04.2015.
 */
public class Images {
    private String name;
    private String[] urls;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getUrls() {
        return urls;
    }

    public void setUrls(String[] urls) {
        this.urls = urls;
    }
}
