package org.bl.json.jersey.test;

import org.bl.json.jersey.TestVariables;
import org.bl.json.jersey.client.JerseyClient;
import org.bl.json.jersey.model.auth.AuthLogin;
import org.bl.json.jersey.model.components.UserTopCategories;
import org.bl.json.jersey.model.errors.*;
import org.bl.json.jersey.model.errors.Error;
import org.bl.json.jersey.report.ReportGenerator;
import org.bl.json.jersey.rest.service.Auth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.ws.rs.ProcessingException;
import javax.ws.rs.WebApplicationException;

/**
 * @author Bogdan Lupashko
 */


public class TestAuth {
    private static Logger LOGGER = LoggerFactory.getLogger(TestAuth.class.getName());
    public static final String docLink = "http://vegaster.webprv.com/api/doc#auth";
    public static final String authLoginDescription = "Login test";
    private static final String authLogoutDescription = "logout test";
    private static final String authRegisterDescription = "register test";
    private static final String authRecoverDescription = "recover test";
    private static final String authHotelListDescription = "hotels list test";
    private static final String authPasswordCheckDescription = "password check test";
    private static final String authDeviceTokenUpdateDescription = "password check test";
    private static final String authCategoriesListDescription = "categories list test";


    @Test(description = TestVariables.DESCRIPTION_TESTS_HEADER + authLoginDescription + "<br> <a href=" + docLink + ">" + TestVariables.LINK_API_DOC_HEADER + "</a>")
    public void authLogin() {
        TestVariables.getToken();
        new ReportGenerator().createHtmlReport(TestVariables.requestsToReport);

    }

    @Test(description = TestVariables.DESCRIPTION_TESTS_HEADER + authLogoutDescription + "<br> <a href=" + docLink + ">" + TestVariables.LINK_API_DOC_HEADER + "</a>")
    public void authLogout() {
        try {
            Auth service = TestVariables.getClient().proxy(Auth.class);
            String response = service.authLogout(TestVariables.getToken());
            TestVariables.reportFiller(docLink, authLogoutDescription, response);
            Assert.assertTrue(response.toString().isEmpty());
            JerseyClient.LOG.error(response.toString());
        } catch (WebApplicationException errorsMessage) {
            try {
                TestVariables.reportFiller(TestAuth.docLink, TestAuth.authLogoutDescription, errorsMessage.getResponse().readEntity(org.bl.json.jersey.model.errors.Error.class));

            } catch (ProcessingException e) {
                try {
                    TestVariables.reportFiller(TestAuth.docLink, TestAuth.authLogoutDescription, errorsMessage.getResponse().readEntity(ErrorString.class));
                } catch (ProcessingException e1) {
                    TestVariables.reportFillerStackTrace(TestAuth.docLink, TestAuth.authLogoutDescription, errorsMessage.getLocalizedMessage());
                }
            }
        } catch (ProcessingException pro) {
            TestVariables.reportFillerStackTrace(TestAuth.docLink, TestAuth.authLogoutDescription, pro.getLocalizedMessage());
            Assert.fail("Object mapping failed : ", pro.getCause());
        } finally {
            new ReportGenerator().createHtmlReport(TestVariables.requestsToReport);
        }
    }

    @Test(description = TestVariables.DESCRIPTION_TESTS_HEADER + authRegisterDescription + "<br> <a href=" + docLink + ">" + TestVariables.LINK_API_DOC_HEADER + "</a>")
    public void authRegister() {
        try {
            Auth service = TestVariables.getClient().proxy(Auth.class);
            AuthLogin response = service.authRegister(TestVariables.email,
                    TestVariables.passwordRaw,
                    TestVariables.passwordRepeat,
                    TestVariables.phone,
                    TestVariables.firstName,
                    TestVariables.lastName);

            TestVariables.reportFiller(docLink, authRegisterDescription, response);
            Assert.assertNotNull(response);
            JerseyClient.LOG.error(response.toString());
        } catch (WebApplicationException errorsMessage) {
            try {
                TestVariables.reportFiller(TestAuth.docLink, TestAuth.authRegisterDescription, errorsMessage.getResponse().readEntity(Error.class));

            } catch (ProcessingException e) {
                try {
                    TestVariables.reportFiller(TestAuth.docLink, TestAuth.authRegisterDescription, errorsMessage.getResponse().readEntity(ErrorString.class));
                } catch (ProcessingException e1) {
                    TestVariables.reportFillerStackTrace(TestAuth.docLink, TestAuth.authRegisterDescription, errorsMessage.getLocalizedMessage());
                }
            }
        } catch (ProcessingException pro) {
            TestVariables.reportFillerStackTrace(TestAuth.docLink, TestAuth.authRegisterDescription, pro.getLocalizedMessage());
            Assert.fail("Object mapping failed : ", pro.getCause());
        }
    }

    @Test(description = TestVariables.DESCRIPTION_TESTS_HEADER + authRecoverDescription + "<br> <a href=" + docLink + ">" + TestVariables.LINK_API_DOC_HEADER + "</a>")
    public void authRecover() {
        try {
            Auth service = TestVariables.getClient().proxy(Auth.class);
            String response = service.authRecover(TestVariables.email);

            TestVariables.reportFiller(docLink, authRecoverDescription, response);
            Assert.assertTrue(response.toString().isEmpty());
            JerseyClient.LOG.error(response.toString());
        } catch (WebApplicationException errorsMessage) {
            try {
                TestVariables.reportFiller(TestAuth.docLink, TestAuth.authRecoverDescription, errorsMessage.getResponse().readEntity(Error.class));

            } catch (ProcessingException e) {
                try {
                    TestVariables.reportFiller(TestAuth.docLink, TestAuth.authRecoverDescription, errorsMessage.getResponse().readEntity(ErrorString.class));
                } catch (ProcessingException e1) {
                    TestVariables.reportFillerStackTrace(TestAuth.docLink, TestAuth.authRecoverDescription, errorsMessage.getLocalizedMessage());
                }
            }
        } catch (ProcessingException pro) {
            TestVariables.reportFillerStackTrace(TestAuth.docLink, TestAuth.authRecoverDescription, pro.getLocalizedMessage());
            Assert.fail("Object mapping failed : ", pro.getCause());
        }

    }

    @Test(description = TestVariables.DESCRIPTION_TESTS_HEADER + authHotelListDescription + "<br> <a href=" + docLink + ">" + TestVariables.LINK_API_DOC_HEADER + "</a>")
    public void hotelsList() {
        try {
            Auth service = TestVariables.getClient().proxy(Auth.class);
            String[] response = service.authHotelsList(TestVariables.email);

            TestVariables.reportFiller(docLink, authHotelListDescription, response);
            Assert.assertNotNull(response);
            JerseyClient.LOG.error(response.toString());
        } catch (WebApplicationException errorsMessage) {
            try {
                TestVariables.reportFiller(TestAuth.docLink, TestAuth.authHotelListDescription, errorsMessage.getResponse().readEntity(Error.class));

            } catch (ProcessingException e) {
                try {
                    TestVariables.reportFiller(TestAuth.docLink, TestAuth.authHotelListDescription, errorsMessage.getResponse().readEntity(ErrorString.class));
                } catch (ProcessingException e1) {
                    TestVariables.reportFillerStackTrace(TestAuth.docLink, TestAuth.authHotelListDescription, errorsMessage.getLocalizedMessage());
                }
            }
        } catch (ProcessingException pro) {
            TestVariables.reportFillerStackTrace(TestAuth.docLink, TestAuth.authHotelListDescription, pro.getLocalizedMessage());
            Assert.fail("Object mapping failed : ", pro.getCause());
        }

    }

    @Test(description = TestVariables.DESCRIPTION_TESTS_HEADER + authPasswordCheckDescription + "<br> <a href=" + docLink + ">" + TestVariables.LINK_API_DOC_HEADER + "</a>")
    public void passwordCheck() {
        try {
            Auth service = TestVariables.getClient().proxy(Auth.class);
            String response = service.authPasswordCheck(TestVariables.getToken(),
                    TestVariables.password);

            TestVariables.reportFiller(docLink, authPasswordCheckDescription, response);
            Assert.assertTrue(response.toString().isEmpty());
            JerseyClient.LOG.error(response.toString());
        } catch (WebApplicationException errorsMessage) {
            try {
                TestVariables.reportFiller(TestAuth.docLink, TestAuth.authPasswordCheckDescription, errorsMessage.getResponse().readEntity(Error.class));

            } catch (ProcessingException e) {
                try {
                    TestVariables.reportFiller(TestAuth.docLink, TestAuth.authPasswordCheckDescription, errorsMessage.getResponse().readEntity(ErrorString.class));
                } catch (ProcessingException e1) {
                    TestVariables.reportFillerStackTrace(TestAuth.docLink, TestAuth.authPasswordCheckDescription, errorsMessage.getLocalizedMessage());
                }
            }
        } catch (ProcessingException pro) {
            TestVariables.reportFillerStackTrace(TestAuth.docLink, TestAuth.authPasswordCheckDescription, pro.getLocalizedMessage());
            Assert.fail("Object mapping failed : ", pro.getCause());
        }

    }

    @Test(description = TestVariables.DESCRIPTION_TESTS_HEADER + authDeviceTokenUpdateDescription + "<br> <a href=" + docLink + ">" + TestVariables.LINK_API_DOC_HEADER + "</a>")
    public void deviceTokenUpdate() {
        try {
            Auth service = TestVariables.getClient().proxy(Auth.class);
            String response = service.authDeviceTokenUpdate(TestVariables.deviceToken);

            TestVariables.reportFiller(docLink, authDeviceTokenUpdateDescription, response);
            Assert.assertTrue(response.toString().isEmpty());
            JerseyClient.LOG.error(response.toString());
        } catch (WebApplicationException errorsMessage) {
            try {
                TestVariables.reportFiller(TestAuth.docLink, TestAuth.authDeviceTokenUpdateDescription, errorsMessage.getResponse().readEntity(Error.class));

            } catch (ProcessingException e) {
                try {
                    TestVariables.reportFiller(TestAuth.docLink, TestAuth.authDeviceTokenUpdateDescription, errorsMessage.getResponse().readEntity(ErrorString.class));
                } catch (ProcessingException e1) {
                    TestVariables.reportFillerStackTrace(TestAuth.docLink, TestAuth.authDeviceTokenUpdateDescription, errorsMessage.getLocalizedMessage());
                }
            }
        } catch (ProcessingException pro) {
            TestVariables.reportFillerStackTrace(TestAuth.docLink, TestAuth.authDeviceTokenUpdateDescription, pro.getLocalizedMessage());
            Assert.fail("Object mapping failed : ", pro.getCause());
        }

    }

    @Test(description = TestVariables.DESCRIPTION_TESTS_HEADER + authCategoriesListDescription + "<br> <a href=" + docLink + ">" + TestVariables.LINK_API_DOC_HEADER + "</a>")
    public void categoriesList() {
        try {
            Auth service = TestVariables.getClient().proxy(Auth.class);
            UserTopCategories[] response = service.authCategoriesList(TestVariables.getToken());

            TestVariables.reportFiller(docLink, authCategoriesListDescription, response);
            Assert.assertNotNull(response);
            JerseyClient.LOG.error(response.toString());
        } catch (WebApplicationException errorsMessage) {
            try {
                TestVariables.reportFiller(TestAuth.docLink, TestAuth.authCategoriesListDescription, errorsMessage.getResponse().readEntity(Error.class));

            } catch (ProcessingException e) {
                try {
                    TestVariables.reportFiller(TestAuth.docLink, TestAuth.authCategoriesListDescription, errorsMessage.getResponse().readEntity(ErrorString.class));
                } catch (ProcessingException e1) {
                    TestVariables.reportFillerStackTrace(TestAuth.docLink, TestAuth.authCategoriesListDescription, errorsMessage.getLocalizedMessage());
                }
            }
        } catch (ProcessingException pro) {
            TestVariables.reportFillerStackTrace(TestAuth.docLink, TestAuth.authCategoriesListDescription, pro.getLocalizedMessage());
            Assert.fail("Object mapping failed : ", pro.getCause());
        }

    }

}

