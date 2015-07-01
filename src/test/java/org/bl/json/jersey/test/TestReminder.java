package org.bl.json.jersey.test;

import org.bl.json.jersey.TestVariables;
import org.bl.json.jersey.client.JerseyClient;
import org.bl.json.jersey.model.errors.ErrorString;
import org.bl.json.jersey.model.reminder.ReminderItem;
import org.bl.json.jersey.model.reminder.ReminderItemForList;
import org.bl.json.jersey.rest.service.Reminder;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.ws.rs.ProcessingException;
import javax.ws.rs.WebApplicationException;

/**
 * @author Bogdan Lupashko
 */

public class TestReminder {
    private static final String reminderListDescription = "Get reminder list test";
    private static final String getReminderItemDescription = "Get reminder item test";
    private static final String docLink = "http://vegaster.webprv.com/api/doc#reminder";
    public static  ReminderItemForList[] reminderItems;


    @Test(description = TestVariables.DESCRIPTION_TESTS_HEADER + reminderListDescription + "<br> <a href=" + docLink + ">" + TestVariables.LINK_API_DOC_HEADER + "</a>")
    public void reminderList() {
        try {
            Reminder service = TestVariables.getClient().proxy(Reminder.class);
            reminderItems = service.reminderList(TestVariables.getToken());
            TestVariables.reportFiller(docLink, reminderListDescription, reminderItems);
            JerseyClient.LOG.error(reminderItems.toString());
            Assert.assertNotNull(reminderItems);
            JerseyClient.LOG.error(reminderItems.toString());
        } catch (WebApplicationException errorsMessage) {
            try {
                TestVariables.reportFiller(docLink, reminderListDescription, errorsMessage.getResponse().readEntity(org.bl.json.jersey.model.errors.Error.class));

            } catch (ProcessingException e) {
                try {
                    TestVariables.reportFiller(docLink, reminderListDescription, errorsMessage.getResponse().readEntity(ErrorString.class));
                } catch (ProcessingException e1) {
                    TestVariables.reportFillerStackTrace(docLink, reminderListDescription, errorsMessage.getLocalizedMessage());
                }
            }
        } catch (ProcessingException pro) {
            TestVariables.reportFillerStackTrace(docLink, reminderListDescription, pro.getLocalizedMessage());
            Assert.fail("Object mapping failed : ", pro.getCause());
        }
    }

    @Test(description = TestVariables.DESCRIPTION_TESTS_HEADER + getReminderItemDescription + "<br> <a href=" + docLink + ">" + TestVariables.LINK_API_DOC_HEADER + "</a>")
    public void reminderItem() {
        try {
            Reminder service = TestVariables.getClient().proxy(Reminder.class);
            ReminderItem response = service.reminderItem(TestVariables.getToken(),
                    TestVariables.reservationId);
            TestVariables.reportFiller(docLink, getReminderItemDescription, response);
            JerseyClient.LOG.error(response.toString());
            Assert.assertNotNull(response);
            JerseyClient.LOG.error(response.toString());
        } catch (WebApplicationException errorsMessage) {
            try {
                TestVariables.reportFiller(docLink, getReminderItemDescription, errorsMessage.getResponse().readEntity(org.bl.json.jersey.model.errors.Error.class));

            } catch (ProcessingException e) {
                try {
                    TestVariables.reportFiller(docLink, getReminderItemDescription, errorsMessage.getResponse().readEntity(ErrorString.class));
                } catch (ProcessingException e1) {
                    TestVariables.reportFillerStackTrace(docLink, getReminderItemDescription, errorsMessage.getLocalizedMessage());
                }
            }
        } catch (ProcessingException pro) {
            TestVariables.reportFillerStackTrace(docLink, getReminderItemDescription, pro.getLocalizedMessage());
            Assert.fail("Object mapping failed : ", pro.getCause());
        }
    }

    private int getReminderId( ReminderItemForList[] reminderItems){
        for ( ReminderItemForList item : reminderItems){
            return item.getReservationId();
        }
        return 0;
    }
}
