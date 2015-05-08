package org.bl.json.jersey.test;

import org.bl.json.jersey.TestVariables;
import org.bl.json.jersey.model.errors.ErrorString;
import org.bl.json.jersey.model.user.UserAgent;
import org.bl.json.jersey.client.JerseyClient;
import org.bl.json.jersey.rest.service.User;
import org.bl.json.jersey.model.user.UserProfile;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.ws.rs.ProcessingException;
import javax.ws.rs.WebApplicationException;

/**
 * @author Bogdan Lupashko
 */
public class TestUser {
    public static UserProfile userProfile;
    private static final String docLink = "http://vegaster.webprv.com/api/doc#user";
    private static final String userProfileDescription = "User profile test ";
    private static final String userProfileUpdateDescription = "Update user profile test ";
    private static final String userPhotoUpdateDescription = "Update user photo test ";
    private static final String userPhotoDeleteDescription = "Delete user photo test ";
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
        } catch (WebApplicationException errorsMessage) {
            try {
                TestVariables.reportFiller(docLink, userProfileDescription, errorsMessage.getResponse().readEntity(org.bl.json.jersey.model.errors.Error.class));

            } catch (ProcessingException e) {
                try {
                    TestVariables.reportFiller(docLink, userProfileDescription, errorsMessage.getResponse().readEntity(ErrorString.class));
                } catch (ProcessingException e1) {
                    TestVariables.reportFillerStackTrace(docLink, userProfileDescription, errorsMessage.getLocalizedMessage());
                }
            }
        } catch (ProcessingException pro) {
            TestVariables.reportFillerStackTrace(docLink, userProfileDescription, pro.getLocalizedMessage());
            Assert.fail("Object mapping failed : ", pro.getCause());
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
        } catch (WebApplicationException errorsMessage) {
            try {
                TestVariables.reportFiller(docLink, userProfileUpdateDescription, errorsMessage.getResponse().readEntity(org.bl.json.jersey.model.errors.Error.class));

            } catch (ProcessingException e) {
                try {
                    TestVariables.reportFiller(docLink, userProfileUpdateDescription, errorsMessage.getResponse().readEntity(ErrorString.class));
                } catch (ProcessingException e1) {
                    TestVariables.reportFillerStackTrace(docLink, userProfileUpdateDescription, errorsMessage.getLocalizedMessage());
                }
            }
        } catch (ProcessingException pro) {
            TestVariables.reportFillerStackTrace(docLink, userProfileUpdateDescription, pro.getLocalizedMessage());
            Assert.fail("Object mapping failed : ", pro.getCause());
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
        } catch (WebApplicationException errorsMessage) {
            try {
                TestVariables.reportFiller(docLink, userPhotoUpdateDescription, errorsMessage.getResponse().readEntity(org.bl.json.jersey.model.errors.Error.class));

            } catch (ProcessingException e) {
                try {
                    TestVariables.reportFiller(docLink, userPhotoUpdateDescription, errorsMessage.getResponse().readEntity(ErrorString.class));
                } catch (ProcessingException e1) {
                    TestVariables.reportFillerStackTrace(docLink, userPhotoUpdateDescription, errorsMessage.getLocalizedMessage());
                }
            }
        } catch (ProcessingException pro) {
            TestVariables.reportFillerStackTrace(docLink, userPhotoUpdateDescription, pro.getLocalizedMessage());
            Assert.fail("Object mapping failed : ", pro.getCause());
        }
    }

    @Test(description = TestVariables.DESCRIPTION_TESTS_HEADER + userPhotoDeleteDescription + "<br> <a href=" + docLink + ">" + TestVariables.LINK_API_DOC_HEADER + "</a>")
    public void userPhotoDelete() {
        try {
            User service = TestVariables.getClient().proxy(User.class);
            String response = service.userPhotoDelete(TestVariables.getToken(),
                    TestVariables.photoFile);
            TestVariables.reportFiller(docLink, userPhotoDeleteDescription, response);
            JerseyClient.LOG.error(response.toString());
            Assert.assertTrue(response.toString().isEmpty());
            JerseyClient.LOG.error(response.toString());
        } catch (WebApplicationException errorsMessage) {
            try {
                TestVariables.reportFiller(docLink, userPhotoDeleteDescription, errorsMessage.getResponse().readEntity(org.bl.json.jersey.model.errors.Error.class));

            } catch (ProcessingException e) {
                try {
                    TestVariables.reportFiller(docLink, userPhotoDeleteDescription, errorsMessage.getResponse().readEntity(ErrorString.class));
                } catch (ProcessingException e1) {
                    TestVariables.reportFillerStackTrace(docLink, userPhotoDeleteDescription, errorsMessage.getLocalizedMessage());
                }
            }
        }
    }

        @Test(description = TestVariables.DESCRIPTION_TESTS_HEADER + userAffiliateDescription + "<br> <a href=" + docLink + ">" + TestVariables.LINK_API_DOC_HEADER + "</a>")
        public void userAffiliateSet () {
            try {
                User service = TestVariables.getClient().proxy(User.class);
                String response = service.userAffiliateSet(TestVariables.getToken(),
                        TestVariables.affiliateCode);
                TestVariables.reportFiller(docLink, userAffiliateDescription, response);
                JerseyClient.LOG.error(response.toString());
                Assert.assertTrue(response.toString().isEmpty());
                JerseyClient.LOG.error(response.toString());
            } catch (WebApplicationException errorsMessage) {
                try {
                    TestVariables.reportFiller(docLink, userAffiliateDescription, errorsMessage.getResponse().readEntity(org.bl.json.jersey.model.errors.Error.class));

                } catch (ProcessingException e) {
                    try {
                        TestVariables.reportFiller(docLink, userAffiliateDescription, errorsMessage.getResponse().readEntity(ErrorString.class));
                    } catch (ProcessingException e1) {
                        TestVariables.reportFillerStackTrace(docLink, userAffiliateDescription, errorsMessage.getLocalizedMessage());
                    }
                }
            } catch (ProcessingException pro) {
                TestVariables.reportFillerStackTrace(docLink, userAffiliateDescription, pro.getLocalizedMessage());
                Assert.fail("Object mapping failed : ", pro.getCause());
            }
        }

        @Test(description = TestVariables.DESCRIPTION_TESTS_HEADER + userTrackDescription + "<br> <a href=" + docLink + ">" + TestVariables.LINK_API_DOC_HEADER + "</a>")
        public void userTrack () {
            try {
                User service = TestVariables.getClient().proxy(User.class);
                String response = service.userTrack(TestVariables.getToken(),
                        TestVariables.lat,
                        TestVariables.lng);
                TestVariables.reportFiller(docLink, userTrackDescription, response);
                JerseyClient.LOG.error(response.toString());
                Assert.assertTrue(response.toString().isEmpty());
                JerseyClient.LOG.error(response.toString());
            } catch (WebApplicationException errorsMessage) {
                try {
                    TestVariables.reportFiller(docLink, userTrackDescription, errorsMessage.getResponse().readEntity(org.bl.json.jersey.model.errors.Error.class));

                } catch (ProcessingException e) {
                    try {
                        TestVariables.reportFiller(docLink, userTrackDescription, errorsMessage.getResponse().readEntity(ErrorString.class));
                    } catch (ProcessingException e1) {
                        TestVariables.reportFillerStackTrace(docLink, userTrackDescription, errorsMessage.getLocalizedMessage());
                    }
                }
            } catch (ProcessingException pro) {
                TestVariables.reportFillerStackTrace(docLink, userTrackDescription, pro.getLocalizedMessage());
                Assert.fail("Object mapping failed : ", pro.getCause());
            }
        }

        @Test(description = TestVariables.DESCRIPTION_TESTS_HEADER + userSocialsLinkDescription + "<br> <a href=" + docLink + ">" + TestVariables.LINK_API_DOC_HEADER + "</a>")
        public void userSocialsLink () {
            try {
                User service = TestVariables.getClient().proxy(User.class);
                String response = service.userSocialsLink(TestVariables.getToken(),
                        TestVariables.provider,
                        TestVariables.tokenProvider);
                TestVariables.reportFiller(docLink, userSocialsLinkDescription, response);
                JerseyClient.LOG.error(response.toString());
                Assert.assertTrue(response.toString().isEmpty());
                JerseyClient.LOG.error(response.toString());
            } catch (WebApplicationException errorsMessage) {
                try {
                    TestVariables.reportFiller(docLink, userSocialsLinkDescription, errorsMessage.getResponse().readEntity(org.bl.json.jersey.model.errors.Error.class));

                } catch (ProcessingException e) {
                    try {
                        TestVariables.reportFiller(docLink, userSocialsLinkDescription, errorsMessage.getResponse().readEntity(ErrorString.class));
                    } catch (ProcessingException e1) {
                        TestVariables.reportFillerStackTrace(docLink, userSocialsLinkDescription, errorsMessage.getLocalizedMessage());
                    }
                }
            } catch (ProcessingException pro) {
                TestVariables.reportFillerStackTrace(docLink, userSocialsLinkDescription, pro.getLocalizedMessage());
                Assert.fail("Object mapping failed : ", pro.getCause());
            }
        }

        @Test(description = TestVariables.DESCRIPTION_TESTS_HEADER + userSocialsDeleteDescription + "<br> <a href=" + docLink + ">" + TestVariables.LINK_API_DOC_HEADER + "</a>")
        public void userSocialsLinkDelete () {
            try {
                User service = TestVariables.getClient().proxy(User.class);
                String response = service.userSocialsLinkDelete(TestVariables.getToken(),
                        TestVariables.provider);
                TestVariables.reportFiller(docLink, userSocialsDeleteDescription, response);
                JerseyClient.LOG.error(response.toString());
                Assert.assertTrue(response.toString().isEmpty());
            } catch (WebApplicationException errorsMessage) {
                try {
                    TestVariables.reportFiller(docLink, userSocialsDeleteDescription, errorsMessage.getResponse().readEntity(org.bl.json.jersey.model.errors.Error.class));

                } catch (ProcessingException e) {
                    try {
                        TestVariables.reportFiller(docLink, userSocialsDeleteDescription, errorsMessage.getResponse().readEntity(ErrorString.class));
                    } catch (ProcessingException e1) {
                        TestVariables.reportFillerStackTrace(docLink, userSocialsDeleteDescription, errorsMessage.getLocalizedMessage());
                    }
                }
            } catch (ProcessingException pro) {
                TestVariables.reportFillerStackTrace(docLink, userSocialsDeleteDescription, pro.getLocalizedMessage());
                Assert.fail("Object mapping failed : ", pro.getCause());
            }
        }


        @Test(description = TestVariables.DESCRIPTION_TESTS_HEADER + userAgentDescription + "<br> <a href=" + docLink + ">" + TestVariables.LINK_API_DOC_HEADER + "</a>")
        public void userAgent () {
            try {
                User service = TestVariables.getClient().proxy(User.class);
                UserAgent response = service.userAgent(TestVariables.getToken());
                TestVariables.reportFiller(docLink, userAgentDescription, response);
                Assert.assertNotNull(response);
            } catch (WebApplicationException errorsMessage) {
                try {
                    TestVariables.reportFiller(docLink, userAgentDescription, errorsMessage.getResponse().readEntity(org.bl.json.jersey.model.errors.Error.class));

                } catch (ProcessingException e) {
                    try {
                        TestVariables.reportFiller(docLink, userAgentDescription, errorsMessage.getResponse().readEntity(ErrorString.class));
                    } catch (ProcessingException e1) {
                        TestVariables.reportFillerStackTrace(docLink, userAgentDescription, errorsMessage.getLocalizedMessage());
                    }
                }
            } catch (ProcessingException pro) {
                TestVariables.reportFillerStackTrace(docLink, userAgentDescription, pro.getLocalizedMessage());
                Assert.fail("Object mapping failed : ", pro.getCause());
            }
        }
    }
