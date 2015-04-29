package org.bl.json.jersey.test;

import com.google.gson.Gson;
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
    private static final String categoryHomepageDescription = "Homepage test";
    private static final String categoryListDescription = "Categories list test";
    private static final String docLink = "http://vegaster.webprv.com/api/doc#category";


    @Test(description = TestVariables.DESCRIPTION_TESTS_HEADER + categoryHomepageDescription  + "<br> <a href=" + docLink + ">" + TestVariables.LINK_API_DOC_HEADER + "</a>")
    public void categoryHomepage() {
        Category service = TestVariables.getClient().proxy(Category.class);
        CategoryHomepage[] response = service.categoryHomepage(TestVariables.getToken());
        TestVariables.reportFiller(docLink, categoryHomepageDescription, response);
        JerseyClient.LOG.error(response.toString());
        Assert.assertNotNull(response);
        JerseyClient.LOG.error(response.toString());


    }

    @Test(description = TestVariables.DESCRIPTION_TESTS_HEADER + categoryListDescription  + "<br> <a href=" + docLink + ">" + TestVariables.LINK_API_DOC_HEADER + "</a>")
    public void categoryList() {
        Category service = TestVariables.getClient().proxy(Category.class);
        CategoryList[] response = service.categoryList(TestVariables.getToken());
        TestVariables.reportFiller(docLink, categoryListDescription, response);
        JerseyClient.LOG.error(response.toString());
        Assert.assertNotNull(response);
        JerseyClient.LOG.error(response.toString());
    }
}
