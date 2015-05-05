package org.bl.json.jersey.test;

import org.bl.json.jersey.TestVariables;
import org.bl.json.jersey.client.JerseyClient;
import org.bl.json.jersey.model.invite.Invited;
import org.bl.json.jersey.rest.service.Invite;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author Bogdan Lupashko
 */

public class TestInvite {
    private static final String inviteItemDescription = "Invite item test";
    private static final String inviteListDescription = "Invite list test";
    private static final String docLink = "http://vegaster.webprv.com/api/doc#invite";
    public static Invited[] invitedContacts;


    @Test(description = TestVariables.DESCRIPTION_TESTS_HEADER + inviteItemDescription + "<br> <a href=" + docLink + ">" + TestVariables.LINK_API_DOC_HEADER + "</a>")
    public void inviteList() {
        try {
            Invite service = TestVariables.getClient().proxy(Invite.class);
            invitedContacts = service.inviteList(TestVariables.getToken(),
                    TestReservation.reservationItemId.getReservationId());
            TestVariables.reportFiller(docLink, inviteItemDescription, invitedContacts);
            JerseyClient.LOG.error(invitedContacts.toString());
            Assert.assertNotNull(invitedContacts);
            JerseyClient.LOG.error(invitedContacts.toString());
        } catch (Exception e) {
            e.printStackTrace();
            TestVariables.reportFillerStackTrace(docLink, inviteItemDescription, e.getLocalizedMessage());
            Assert.fail();
        }
    }

    @Test(description = TestVariables.DESCRIPTION_TESTS_HEADER + inviteListDescription + "<br> <a href=" + docLink + ">" + TestVariables.LINK_API_DOC_HEADER + "</a>")
    public void inviteShare() {
        try {
            Invite service = TestVariables.getClient().proxy(Invite.class);
            String response = service.inviteShare(TestVariables.getToken(),
                    TestReservation.reservationItemId.getReservationId(),
                    invitedContacts);
            TestVariables.reportFiller(docLink, inviteListDescription, response);
            JerseyClient.LOG.error(response.toString());
            Assert.assertNotNull(response);
            JerseyClient.LOG.error(response.toString());
        } catch (Exception e) {
            e.printStackTrace();
            TestVariables.reportFillerStackTrace(docLink, inviteListDescription, e.getLocalizedMessage());
            Assert.fail();
        }
    }
}
