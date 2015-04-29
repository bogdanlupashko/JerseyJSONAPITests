package org.bl.json.jersey;

import com.google.gson.Gson;
import org.bl.json.jersey.model.auth.AuthLogin;
import org.bl.json.jersey.report.ApiResult;
import org.bl.json.jersey.rest.service.Auth;
import org.bl.json.jersey.test.TestAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import java.util.ArrayList;

/**
 * @author Bogdan Lupashko
 */

public class TestVariables {

    public static final String DESCRIPTION_TESTS_HEADER = "<br> <b> Description </b> <br> ";
    public static final String LINK_API_DOC_HEADER = "API doc ";


    public static ArrayList<ApiResult> requestsToReport = new ArrayList<>();

    private static Logger LOGGER = LoggerFactory.getLogger(TestAuth.class.getName());
    public static String email = "aa@aa.aa";
    public static String password = "qqqqqq";

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
        if (token != null) {
            return TestVariables.token;
        } else {
            Auth service = getClient().proxy(Auth.class);
            AuthLogin response = service.authLogin(email, password);
            TestVariables.reportFiller(TestAuth.docLink, TestAuth.authLoginDescription, response);
            Assert.assertNotNull(response);
            Assert.assertNotNull(response.getId());
            Assert.assertNotNull(response.getToken());
            LOGGER.error("response auth : " + response.getToken());
            token = response.getToken();
        }
        return token;
    }

    public static void reportFiller(String docLink, String description, Object responseJson){
        ApiResult apiResult = new ApiResult();
        apiResult.setDocLink(docLink);
        apiResult.setDescription(description);
        apiResult.setResponseJson(new Gson().toJson(responseJson));
        requestsToReport.add(apiResult);
    }


    public static RestClient getClient() {
        if (TestVariables.client != null) {
            return client;
        } else {
           return new RestClient();
        }
    }

}
