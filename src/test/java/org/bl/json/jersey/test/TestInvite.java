package org.bl.json.jersey.test;

import org.bl.json.jersey.TestVariables;
import org.bl.json.jersey.client.JerseyClient;
import org.bl.json.jersey.model.errors.Error;
import org.bl.json.jersey.model.errors.ErrorString;
import org.bl.json.jersey.model.invite.Invited;
import org.bl.json.jersey.rest.service.Invite;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.ws.rs.ProcessingException;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

/**
 * @author Bogdan Lupashko
 */

public class TestInvite {
    private static final String inviteItemDescription = "Invite item test";
    private static final String inviteListDescription = "Invite list test";
    private static final String docLink = "http://vegaster.webprv.com/api/doc#invite";
  //  public static Invited[] invitedContacts;
     Response  invitedContacts;


    @Test(description = TestVariables.DESCRIPTION_TESTS_HEADER + inviteItemDescription + "<br> <a href=" + docLink + ">" + TestVariables.LINK_API_DOC_HEADER + "</a>")
    public void inviteList() {
        try {
            Invite service = TestVariables.getClient().proxy(Invite.class);
            Response invitedContacts = service.inviteList(TestVariables.getToken(),
                    /*TestReservation.reservationItemId.getReservationId()*/671);
            TestVariables.reportFiller(docLink, inviteItemDescription, (Invited[]) invitedContacts.getEntity());
            JerseyClient.LOG.error(invitedContacts.toString());
            Assert.assertNotNull(invitedContacts);
            JerseyClient.LOG.error(invitedContacts.toString());
        } catch (WebApplicationException errorsMessage) {
            try {
                TestVariables.reportFiller(docLink, inviteItemDescription, errorsMessage.getResponse().readEntity(org.bl.json.jersey.model.errors.Error.class));

            } catch (ProcessingException e) {
                try {
                    TestVariables.reportFiller(docLink, inviteItemDescription, errorsMessage.getResponse().readEntity(ErrorString.class));
                } catch (ProcessingException e1) {
                    TestVariables.reportFillerStackTrace(docLink, inviteItemDescription, errorsMessage.getLocalizedMessage());
                }
            }
        } catch (ProcessingException pro) {
            TestVariables.reportFillerStackTrace(docLink, inviteItemDescription, pro.getLocalizedMessage());
            Assert.fail("Object mapping failed : ", pro.getCause());
        }
    }

    @Test(description = TestVariables.DESCRIPTION_TESTS_HEADER + inviteListDescription + "<br> <a href=" + docLink + ">" + TestVariables.LINK_API_DOC_HEADER + "</a>")
    public void inviteShare() {
        try {
            Invite service = TestVariables.getClient().proxy(Invite.class);
            String response = service.inviteShare(TestVariables.getToken(),
                    TestReservation.reservationItemId.getReservationId(),
                    TestVariables.contacts);
            TestVariables.reportFiller(docLink, inviteListDescription, response);
            JerseyClient.LOG.error(response.toString());
            Assert.assertNotNull(response);
            JerseyClient.LOG.error(response.toString());
        } catch (WebApplicationException errorsMessage) {
            try {
                TestVariables.reportFiller(docLink, inviteListDescription, errorsMessage.getResponse().readEntity(org.bl.json.jersey.model.errors.Error.class));

            } catch (ProcessingException e) {
                try {
                    TestVariables.reportFiller(docLink, inviteListDescription, errorsMessage.getResponse().readEntity(ErrorString.class));
                } catch (ProcessingException e1) {
                    TestVariables.reportFillerStackTrace(docLink, inviteListDescription, errorsMessage.getLocalizedMessage());
                }
            }
        } catch (ProcessingException pro) {
            TestVariables.reportFillerStackTrace(docLink, inviteListDescription, pro.getLocalizedMessage());
            Assert.fail("Object mapping failed : ", pro.getCause());
        }
    }
}
