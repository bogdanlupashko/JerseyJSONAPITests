package org.bl.json.jersey;

import com.google.gson.Gson;
import com.sun.javafx.collections.MappingChange;
import org.apache.commons.io.FileUtils;
import org.bl.json.jersey.model.auth.AuthLogin;
import org.bl.json.jersey.model.errors.Error;
import org.bl.json.jersey.model.errors.ErrorString;
import org.bl.json.jersey.report.ApiResult;
import org.bl.json.jersey.rest.service.Auth;
import org.bl.json.jersey.test.TestAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import javax.ws.rs.ProcessingException;
import javax.ws.rs.WebApplicationException;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Bogdan Lupashko
 */

public class TestVariables {

    public static final String DESCRIPTION_TESTS_HEADER = "<br> <b> Description </b> <br> ";
    public static final String LINK_API_DOC_HEADER = "API doc ";

    public static ArrayList<ApiResult> requestsToReport = new ArrayList<>();

    private final static Logger LOGGER = LoggerFactory.getLogger(TestAuth.class.getName());
    public static String email = "m1@mm.mm";
    public static String password = "qqqqqq";
    public static String passwordRaw = "qqqqqq";
    public static String passwordRepeat = "qqqqqq";
    public static String phone = "1234567890";
    public static String firstName = "qqqqqq";
    public static String lastName = "qqqqqq";
    public static String deviceToken = "qqqqqq";
    public static String affiliateCode = "100500";

    public static String tripName = "qqqqqq";
    public static String type = "flight";
    /**
     * @type value: flight, hotel, event, restaurant, show, misc
     */
    public static String syncCode = "100500";
    public static int travelType = 1;
    /**
     * TRAVEL_TYPE_PARTY = 1;
     * TRAVEL_TYPE_VACATION = 2;
     * TRAVEL_TYPE_BUSINESS = 3;
     */

    public static int costType = 1;
    /**
     * @type value: const COST_TYPE_PER_PERSON = 1;const COST_TYPE_TOTAL_PACKAGE = 2;
     */


    public static int[] categories = {1, 2};


    public static int categoryId = 1;
    public static int venueId = 20;
    public static int requestId = 20;
    public static int hostId = 20;
    public static int reservationId = 678;
    public final static int offerId = 257;
    public static int malesCount = 4;
    public static int femalesCount = 0;
    public static float lat = 45.2f;
    public static float deltaLat = 64646.242f;
    public static float lng = 64646.242f;
    public static float deltaLng = 64646.242f;
    public static String reservedDateTime = "2015-06-01T22:00:00-0700";
    public static String beginDateTime = "2015-06-27T22:05:54-0700";
    public static String leaveDate = "2015-06-27T00:05:54-0700";
    public static String flightTime = "2015-06-27T00:05:54-0700";
    public static int budget = 20;
    public static int viatorId = 20;
    public static int showsId = 12;
    public static String note = "some notes";
    public static String status = "confirmed_by_user";
    public static File photoFile = FileUtils.getFile("src\\java\\resources\\photo.jpg");
    public static Map<String,String>[] contacts;


    /**
     * @status values: confirmed_by_user, cancelled_by_user
     */
    public static String paymentId = "ygfyegfefefeg";
    public static String provider = "facebook";
    /**
     * facebook, google, twitter
     */
    public static String tokenProvider = "egfgyrgygy";
    public static int tripStatus = 4;
    /**
     * STATUS_NEW = 1;
     * STATUS_CANCELED = 2;
     * STATUS_HAVE_PLAN = 3;
     * STATUS_APPROVED = 4;
     * STATUS_EXPIRED = 5;
     * <p/>
     * STATUS_NEW => [STATUS_CANCELED],
     * STATUS_CANCELED => [],
     * STATUS_HAVE_PLAN => [STATUS_CANCELED, STATUS_APPROVED]
     * STATUS_APPROVED => [STATUS_CANCELED],
     * STATUS_EXPIRED => [].
     */


    static RestClient client;
    static String token;

    public static String getToken() {
//        contacts[0].put("email", "email@email.com");
//        contacts[0].put("fullName", "John Smith");
        if (token != null) {
            return TestVariables.token;
        } else {
            try {
                Auth service = getClient().proxy(Auth.class);
                AuthLogin response = service.authLogin(email, password);

                TestVariables.reportFiller(TestAuth.docLink, TestAuth.authLoginDescription, response);
//                Assert.assertNotNull(response);
//                Assert.assertNotNull(response.getId());
//                Assert.assertNotNull(response.getToken());
//                Assert.assertNotNull(response.getErrors());
                token = response.getToken();

            } catch (WebApplicationException errorsMessage) {
                try {
                    TestVariables.reportFiller(TestAuth.docLink, TestAuth.authLoginDescription, errorsMessage.getResponse().readEntity(Error.class));

                } catch (ProcessingException e) {
                    try {
                        TestVariables.reportFiller(TestAuth.docLink, TestAuth.authLoginDescription, errorsMessage.getResponse().readEntity(ErrorString.class));
                    } catch (ProcessingException e1) {
                        TestVariables.reportFillerStackTrace(TestAuth.docLink, TestAuth.authLoginDescription, errorsMessage.getLocalizedMessage());
                    }
                }
            } catch (ProcessingException pro) {
                TestVariables.reportFillerStackTrace(TestAuth.docLink, TestAuth.authLoginDescription, pro.getLocalizedMessage());
                Assert.fail("Object mapping failed : ", pro.getCause());
            }

            return token;
        }
    }


    public static void reportFiller(String docLink, String description, Object responseJson) throws WebApplicationException {
        ApiResult apiResult = new ApiResult();
        apiResult.setDocLink(docLink);
        apiResult.setDescription(description);
        apiResult.setResponseJson(new Gson().toJson(responseJson));
        apiResult.setStatus(true);
        requestsToReport.add(apiResult);
    }

    public static void reportFillerStackTrace(String docLink, String description, String stackTrace) {
        ApiResult apiResult = new ApiResult();
        apiResult.setDocLink(docLink);
        apiResult.setDescription(description);
        apiResult.setResponseJson(stackTrace);
        apiResult.setStatus(false);
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
