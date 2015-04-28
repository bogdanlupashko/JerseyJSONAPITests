package org.bl.json.jersey.test;

import org.bl.json.jersey.TestVariables;
import org.bl.json.jersey.client.JerseyClient;
import org.bl.json.jersey.model.category.CategoryHomepage;
import org.bl.json.jersey.model.category.CategoryList;
import org.bl.json.jersey.rest.service.Category;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author Bogdan Lupashko
 */

public class TestCategory {
    public static Logger LOGGER = LoggerFactory.getLogger(TestCategory.class.getName());

    @Test(description = "<br> <br> <br> <b>Description </b>home page test Vegaster <br> <a href=\"http://vegaster.webprv.com/api/doc#category\">API doc</a>")
    public void categoryHomepage() {
        Category service = TestVariables.getClient().proxy(Category.class);
        CategoryHomepage[] response = service.categoryHomepage(TestVariables.getToken());
        JerseyClient.LOG.error(response.toString());
        Assert.assertNotNull(response);
        JerseyClient.LOG.error(response.toString());
    }

    @Test(description = "<br> <br> <br> <b>Description </b>Categories list test Vegaster <br> <a href=\"http://vegaster.webprv.com/api/doc#category\">API doc</a>")
    public void categoryList() {
        Category service = TestVariables.getClient().proxy(Category.class);
        CategoryList[] response = service.categoryList(TestVariables.getToken());
        JerseyClient.LOG.error(response.toString());
        Assert.assertNotNull(response);
        JerseyClient.LOG.error(response.toString());
    }
}
