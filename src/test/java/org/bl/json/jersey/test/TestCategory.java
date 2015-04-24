package org.bl.json.jersey.test;

import org.bl.json.jersey.RestClient;
import org.bl.json.jersey.client.JerseyClient;
import org.bl.json.jersey.model.auth.AuthLogin;
import org.bl.json.jersey.model.category.CategoryHomepage;
import org.bl.json.jersey.model.category.CategoryList;
import org.bl.json.jersey.rest.service.Auth;
import org.bl.json.jersey.rest.service.Category;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author Bogdan Lupashko
 */

public class TestCategory {
    public static Logger LOGGER = LoggerFactory.getLogger(TestCategory.class.getName());


    private RestClient client;
    private String token;

    @BeforeClass
    public void init() {
        client = new RestClient();
        token = TestAuth.token;
        LOGGER.error(token);
       // token = getToken();
    }

    @Test
    public void categoryHomepage() {
        Category service = client.proxy(Category.class);
        CategoryHomepage[] respose = service.categoryHomepage(token);
        JerseyClient.LOG.error(respose.toString());
        Assert.assertNotNull(respose);
        JerseyClient.LOG.error(respose.toString());
    }

    @Test
    public void categoryList() {
        Category service = client.proxy(Category.class);
        CategoryList[] respose = service.categoryList(token);
        JerseyClient.LOG.error(respose.toString());
        Assert.assertNotNull(respose);
        JerseyClient.LOG.error(respose.toString());
    }


    private String getToken() {
        LOGGER.error("getToken: " + TestAuth.token);
        if (TestAuth.token != null) {
            LOGGER.error("if statement");
            return TestAuth.token;
        } else {
            LOGGER.error("else statement");

            Auth service = client.proxy(Auth.class);
            AuthLogin respose = service.authLogin("googlecomua@mail.ru", "qqqqqq");
            Assert.assertNotNull(respose);
            Assert.assertNotNull(respose.getId());
            Assert.assertNotNull(respose.getToken());
            return respose.getToken();
        }
    }

}
