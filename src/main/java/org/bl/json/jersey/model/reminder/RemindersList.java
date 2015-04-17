package org.bl.json.jersey.model.reminder;

import org.bl.json.jersey.model.components.Reminder;

import java.util.LinkedList;

/**
 * Created by blupashko on 17.04.2015.
 */
public class RemindersList {
    private LinkedList<Reminder> reminders;

    public LinkedList<Reminder> getReminders() {
        return reminders;
    }

    public void setReminders(LinkedList<Reminder> reminders) {
        this.reminders = reminders;
    }
}
