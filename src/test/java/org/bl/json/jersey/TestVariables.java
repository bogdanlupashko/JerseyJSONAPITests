package org.bl.json.jersey;

import org.bl.json.jersey.model.auth.AuthLogin;
import org.bl.json.jersey.rest.service.Auth;
import org.bl.json.jersey.test.TestAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

/**
 * @author Bogdan Lupashko
 */

public class TestVariables {
    private static Logger LOGGER = LoggerFactory.getLogger(TestAuth.class.getName());
    private static String email = "aa@aa.aa";
    private static String password = "qqqqqq";

    private static int categoryId = 1;
    private static int venueId = 20;
    private final static int offerId = 257;
    private static int malesCount = 4;
    private static int femalesCount = 0;
    private static String reservedDateTime = "2015-04-27T00:05:54-0700";

    public static String getReservedDateTime() {
        return reservedDateTime;
    }

    public static int getFemalesCount() {
        return femalesCount;
    }

    public static int getMalesCount() {
        return malesCount;
    }

    public static Logger getLOGGER() {
        return LOGGER;
    }

    public static int getCategoryId() {
        return categoryId;
    }

    public static int getVenueId() {
        return venueId;
    }

    public static int getOfferId() {
        return offerId;
    }

    static RestClient client;
    static String token;


    public static String getToken() {
        if (TestVariables.token != null) {
            return TestVariables.token;
        } else {
            Auth service = getClient().proxy(Auth.class);
            AuthLogin respose = service.authLogin(email, password);
            Assert.assertNotNull(respose);
            Assert.assertNotNull(respose.getId());
            Assert.assertNotNull(respose.getToken());
            LOGGER.error("response auth : " + respose.getToken());
            return respose.getToken();
        }
    }

    public static RestClient getClient() {
        if (TestVariables.client != null) {
            return client;
        } else {
           return new RestClient();
        }
    }

}
