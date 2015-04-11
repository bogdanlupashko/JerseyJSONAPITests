package org.bl.json.jersey;

import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;

/**
 * Created by blupashko on 03.04.2015.
 */
public class RestClient {
    private ResteasyWebTarget target;

    private static final String DEFAULT_ENDPOINT = "http://vegaster.webprv.com/";

    public RestClient() {
        this(DEFAULT_ENDPOINT);
    }

    public RestClient(String endpoint) {
        javax.ws.rs.client.Client client = new ResteasyClientBuilder().build();
        target = (ResteasyWebTarget) client.target(endpoint);
    }

    public <T> T proxy(java.lang.Class<T> clazz) {
        return target.proxy(clazz);
    }
}
