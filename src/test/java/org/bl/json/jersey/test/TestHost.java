package org.bl.json.jersey.test;

import org.bl.json.jersey.TestVariables;
import org.bl.json.jersey.client.JerseyClient;
import org.bl.json.jersey.model.host.HostItem;
import org.bl.json.jersey.rest.service.Host;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author Bogdan Lupashko
 */

public class TestHost {

    @Test(description = "<br> <br> <br> <b>Description </b>Venue host test Vegaster <br> <a href=\"http://vegaster.webprv.com/api/doc#category\">API doc</a>")
    public void hostItem() {
        Host service = TestVariables.getClient().proxy(Host.class);
        HostItem response = service.hostItem(TestVariables.getToken(), TestVariables.getVenueId());
        JerseyClient.LOG.error(response.toString());
        Assert.assertNotNull(response);
        JerseyClient.LOG.error(response.toString());
    }

}
