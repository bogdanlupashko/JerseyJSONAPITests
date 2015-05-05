package org.bl.json.jersey.test;

import org.bl.json.jersey.TestVariables;
import org.bl.json.jersey.client.JerseyClient;
import org.bl.json.jersey.model.reminder.ReminderItem;
import org.bl.json.jersey.model.reminder.ReminderItemForList;
import org.bl.json.jersey.rest.service.Reminder;
import org.testng.Assert;
import org.testng.annotations.Test;

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
        } catch (Exception e) {
            e.printStackTrace();
            TestVariables.reportFillerStackTrace(docLink, reminderListDescription, e.getLocalizedMessage());
            Assert.fail();
        }
    }

    @Test(description = TestVariables.DESCRIPTION_TESTS_HEADER + getReminderItemDescription + "<br> <a href=" + docLink + ">" + TestVariables.LINK_API_DOC_HEADER + "</a>")
    public void reminderItem() {
        try {
            Reminder service = TestVariables.getClient().proxy(Reminder.class);
            ReminderItem response = service.reminderItem(TestVariables.getToken(),
                    getReminderId(reminderItems));
            TestVariables.reportFiller(docLink, getReminderItemDescription, response);
            JerseyClient.LOG.error(response.toString());
            Assert.assertNotNull(response);
            JerseyClient.LOG.error(response.toString());
        } catch (Exception e) {
            e.printStackTrace();
            TestVariables.reportFillerStackTrace(docLink, getReminderItemDescription, e.getLocalizedMessage());
            Assert.fail();
        }
    }

    private int getReminderId( ReminderItemForList[] reminderItems){
        for ( ReminderItemForList item : reminderItems){
            return 0;
        }
        return 0;
    }
}
