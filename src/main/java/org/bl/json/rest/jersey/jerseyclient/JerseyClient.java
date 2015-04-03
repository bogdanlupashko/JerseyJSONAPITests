package org.bl.json.rest.jersey.jerseyclient;

import org.bl.json.rest.jersey.AuthLogin;
import org.bl.json.rest.jersey.jerseyclient.jersey.rest.service.Auth;

import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import javax.ws.rs.client.Client;
//import javax.ws.rs.client.ClientBuilder;

public class JerseyClient {

    private static Logger LOG = LoggerFactory.getLogger(JerseyClient.class.getName());

    public static void main(String[] args) {
        Client client = new ResteasyClientBuilder().build();
        ResteasyWebTarget target = (ResteasyWebTarget) client.target("http://vegaster.webprv.com/");
        Auth resource = target.proxy(Auth.class);
        AuthLogin login = resource.authLogin("googlecomua@mail.ru", "qqqqqq");
        LOG.info(login.getToken());
    }

}
