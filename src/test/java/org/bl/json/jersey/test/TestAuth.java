package org.bl.json.jersey.test;

import org.bl.json.jersey.TestVariables;
import org.bl.json.jersey.client.JerseyClient;
import org.bl.json.jersey.report.ReportGenerator;
import org.bl.json.jersey.rest.service.Auth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author Bogdan Lupashko
 */


public class TestAuth {
    private static Logger LOGGER = LoggerFactory.getLogger(TestAuth.class.getName());
    public static final String docLink = "http://vegaster.webprv.com/api/doc#auth";
    public static final String authLoginDescription = "Login test";
    private static final String authLogoutDescription = "logout test";


    @Test(description = TestVariables.DESCRIPTION_TESTS_HEADER + authLoginDescription + "<br> <a href=" + docLink + ">" + TestVariables.LINK_API_DOC_HEADER + "</a>")
    public void authLogin() {
        TestVariables.getToken();

    }

    @Test(description = TestVariables.DESCRIPTION_TESTS_HEADER + authLogoutDescription + "<br> <a href=" + docLink + ">" + TestVariables.LINK_API_DOC_HEADER + "</a>")
    public void authLogout() {
        try {
            Auth service = TestVariables.getClient().proxy(Auth.class);
            String response = service.authLogout(TestVariables.getToken());
            TestVariables.reportFiller(docLink, authLogoutDescription, response);
            Assert.assertTrue(response.toString().isEmpty());
            JerseyClient.LOG.error(response.toString());
        } catch (Exception e){
            e.printStackTrace();
            TestVariables.reportFillerStackTrace(docLink, authLogoutDescription, e.getLocalizedMessage());
            Assert.fail();
        }
        finally {
            new ReportGenerator().createHtmlReport(TestVariables.requestsToReport);
        }
    }
}
