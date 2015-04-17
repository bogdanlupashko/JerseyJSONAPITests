package org.bl.json.jersey.model.notification;

import org.bl.json.jersey.model.components.Notification;

import java.util.LinkedList;

/**
 * Created by blupashko on 17.04.2015.
 */
public class NotificationList {
    private LinkedList<Notification> notifications;

    public LinkedList<Notification> getNotifications() {
        return notifications;
    }

    public void setNotifications(LinkedList<Notification> notifications) {
        this.notifications = notifications;
    }
}
