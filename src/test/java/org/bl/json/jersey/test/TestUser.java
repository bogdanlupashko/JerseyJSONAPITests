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
    private static final String userProfileUpdateDescription = "Update user profile test ";
    private static final String userPhotoUpdateDescription = "Update user photo test ";
    private static final String userPhotodeleteDescription = "Delete user photo test ";
    private static final String userAffiliateDescription = "Affiliate user  test ";
    private static final String userTrackDescription = "Track user  test ";
    private static final String userSocialsLinkDescription = "Socials link user test ";
    private static final String userSocialsDeleteDescription = "Socials deletion link user test ";
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


    @Test(description = TestVariables.DESCRIPTION_TESTS_HEADER + userProfileUpdateDescription + "<br> <a href=" + docLink + ">" + TestVariables.LINK_API_DOC_HEADER + "</a>")
    public void userProfileUpdate() {
        try {
            User service = TestVariables.getClient().proxy(User.class);
            String response = service.userProfile(TestVariables.getToken(),
                    TestVariables.email,
                    TestVariables.passwordRaw,
                    TestVariables.passwordRepeat,
                    TestVariables.phone,
                    TestVariables.firstName,
                    TestVariables.lastName,
                    TestVariables.leaveDate,
                    TestVariables.flightTime);
            TestVariables.reportFiller(docLink, userProfileUpdateDescription, response);
            JerseyClient.LOG.error(response.toString());
            Assert.assertNotNull(response);
            JerseyClient.LOG.error(response.toString());
        } catch (Exception e) {
            e.printStackTrace();
            TestVariables.reportFillerStackTrace(docLink, userProfileUpdateDescription, e.getLocalizedMessage());
            Assert.fail();
        }
    }

    @Test(description = TestVariables.DESCRIPTION_TESTS_HEADER + userPhotoUpdateDescription + "<br> <a href=" + docLink + ">" + TestVariables.LINK_API_DOC_HEADER + "</a>")
    public void userPhotoSet() {
        try {
            User service = TestVariables.getClient().proxy(User.class);
            String response = service.userPhotoSet(TestVariables.getToken(),
                    TestVariables.photoFile);
            TestVariables.reportFiller(docLink, userPhotoUpdateDescription, response);
            JerseyClient.LOG.error(response.toString());
            Assert.assertTrue(response.toString().isEmpty());
            JerseyClient.LOG.error(response.toString());
        } catch (Exception e) {
            e.printStackTrace();
            TestVariables.reportFillerStackTrace(docLink, userPhotoUpdateDescription, e.getLocalizedMessage());
            Assert.fail();
        }
    }

    @Test(description = TestVariables.DESCRIPTION_TESTS_HEADER + userPhotodeleteDescription + "<br> <a href=" + docLink + ">" + TestVariables.LINK_API_DOC_HEADER + "</a>")
    public void userPhotoDelete() {
        try {
            User service = TestVariables.getClient().proxy(User.class);
            String response = service.userPhotoDelete(TestVariables.getToken(),
                    TestVariables.photoFile);
            TestVariables.reportFiller(docLink, userPhotodeleteDescription, response);
            JerseyClient.LOG.error(response.toString());
            Assert.assertTrue(response.toString().isEmpty());
            JerseyClient.LOG.error(response.toString());
        } catch (Exception e) {
            e.printStackTrace();
            TestVariables.reportFillerStackTrace(docLink, userPhotodeleteDescription, e.getLocalizedMessage());
            Assert.fail();
        }
    }

    @Test(description = TestVariables.DESCRIPTION_TESTS_HEADER + userAffiliateDescription + "<br> <a href=" + docLink + ">" + TestVariables.LINK_API_DOC_HEADER + "</a>")
    public void userAffiliateSet() {
        try {
            User service = TestVariables.getClient().proxy(User.class);
            String response = service.userAffiliateSet(TestVariables.getToken(),
                    TestVariables.affiliateCode);
            TestVariables.reportFiller(docLink, userAffiliateDescription, response);
            JerseyClient.LOG.error(response.toString());
            Assert.assertTrue(response.toString().isEmpty());
            JerseyClient.LOG.error(response.toString());
        } catch (Exception e) {
            e.printStackTrace();
            TestVariables.reportFillerStackTrace(docLink, userAffiliateDescription, e.getLocalizedMessage());
            Assert.fail();
        }
    }

    @Test(description = TestVariables.DESCRIPTION_TESTS_HEADER + userTrackDescription + "<br> <a href=" + docLink + ">" + TestVariables.LINK_API_DOC_HEADER + "</a>")
    public void userTrack() {
        try {
            User service = TestVariables.getClient().proxy(User.class);
            String response = service.userTrack(TestVariables.getToken(),
                    TestVariables.lat,
                    TestVariables.lng);
            TestVariables.reportFiller(docLink, userTrackDescription, response);
            JerseyClient.LOG.error(response.toString());
            Assert.assertTrue(response.toString().isEmpty());
            JerseyClient.LOG.error(response.toString());
        } catch (Exception e) {
            e.printStackTrace();
            TestVariables.reportFillerStackTrace(docLink, userTrackDescription, e.getLocalizedMessage());
            Assert.fail();
        }
    }

    @Test(description = TestVariables.DESCRIPTION_TESTS_HEADER + userSocialsLinkDescription + "<br> <a href=" + docLink + ">" + TestVariables.LINK_API_DOC_HEADER + "</a>")
    public void userSocialsLink() {
        try {
            User service = TestVariables.getClient().proxy(User.class);
            String response = service.userSocialsLink(TestVariables.getToken(),
                    TestVariables.provider,
                    TestVariables.tokenProvider);
            TestVariables.reportFiller(docLink, userSocialsLinkDescription, response);
            JerseyClient.LOG.error(response.toString());
            Assert.assertTrue(response.toString().isEmpty());
            JerseyClient.LOG.error(response.toString());
        } catch (Exception e) {
            e.printStackTrace();
            TestVariables.reportFillerStackTrace(docLink, userSocialsLinkDescription, e.getLocalizedMessage());
            Assert.fail();
        }
    }

    @Test(description = TestVariables.DESCRIPTION_TESTS_HEADER + userSocialsDeleteDescription + "<br> <a href=" + docLink + ">" + TestVariables.LINK_API_DOC_HEADER + "</a>")
    public void userSocialsLinkDelete() {
        try {
            User service = TestVariables.getClient().proxy(User.class);
            String response = service.userSocialsLinkDelete(TestVariables.getToken(),
                    TestVariables.provider);
            TestVariables.reportFiller(docLink, userSocialsDeleteDescription, response);
            JerseyClient.LOG.error(response.toString());
            Assert.assertTrue(response.toString().isEmpty());
            JerseyClient.LOG.error(response.toString());
        } catch (Exception e) {
            e.printStackTrace();
            TestVariables.reportFillerStackTrace(docLink, userSocialsDeleteDescription, e.getLocalizedMessage());
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
