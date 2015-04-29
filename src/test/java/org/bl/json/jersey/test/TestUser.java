package org.bl.json.jersey.test;

import org.bl.json.jersey.TestVariables;
import org.bl.json.jersey.model.user.UserAgent;
import org.bl.json.jersey.client.JerseyClient;
import org.bl.json.jersey.rest.service.User;
import org.bl.json.jersey.model.user.UserProfile;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author Bogdan Lupashko
 */
public class TestUser {
    public static UserProfile userProfile;
    private static final String docLink = "http://vegaster.webprv.com/api/doc#user";
    private static final String userProfileDescription = "User profile test ";
    private static final String userAgentDescription = "Support agent test ";

    @Test(description = TestVariables.DESCRIPTION_TESTS_HEADER + userProfileDescription + "<br> <a href=" + docLink + ">" + TestVariables.LINK_API_DOC_HEADER + "</a>")
    public void userProfile() {
        try {
            User service = TestVariables.getClient().proxy(User.class);
            userProfile = service.userProfile(TestVariables.getToken());
            TestVariables.reportFiller(docLink, userProfileDescription, userProfile);
            JerseyClient.LOG.error(userProfile.toString());
            Assert.assertNotNull(userProfile);
            JerseyClient.LOG.error(userProfile.toString());
        } catch (Exception e) {
            e.printStackTrace();
            TestVariables.reportFillerStackTrace(docLink, userProfileDescription, e.getLocalizedMessage());
            Assert.fail();
        }
    }

    @Test(description = TestVariables.DESCRIPTION_TESTS_HEADER + userAgentDescription + "<br> <a href=" + docLink + ">" + TestVariables.LINK_API_DOC_HEADER + "</a>")
    public void userAgent() {
        try {
            User service = TestVariables.getClient().proxy(User.class);
            UserAgent response = service.userAgent(TestVariables.getToken());
            TestVariables.reportFiller(docLink, userAgentDescription, response);
            Assert.assertNotNull(response);
        } catch (Exception e) {
            e.printStackTrace();
            TestVariables.reportFillerStackTrace(docLink, userAgentDescription, e.getLocalizedMessage());
            Assert.fail();
        }
    }
}
