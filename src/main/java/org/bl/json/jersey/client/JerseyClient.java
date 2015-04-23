package org.bl.json.jersey.client;

import org.bl.json.jersey.model.auth.AuthLogin;
import org.bl.json.jersey.rest.service.Auth;

import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.ws.rs.client.Client;

public class JerseyClient {
    public static final String MAIN_URL =  "http://vegaster.webprv.com/";
    public static final String API_PATH =  "api/";
    public static final String VERSION_API_PATH =  "v1.4/";

    public static Logger LOG = LoggerFactory.getLogger(JerseyClient.class.getName());

    public static void main(String[] args) {
        Client client = new ResteasyClientBuilder().build();
        ResteasyWebTarget target = (ResteasyWebTarget) client.target(MAIN_URL);
        Auth resource = target.proxy(Auth.class);
        AuthLogin login = resource.authLogin("googlecomua@mail.ru", "qqqqqq");
        LOG.info(login.getToken());
    }

}
