package org.bl.json.jersey.model.reservation;

import org.bl.json.jersey.model.components.*;

import java.util.ArrayList;

/**
 * Created by blupashko on 23.04.2015.
 */
public class ReservationItem {
    private int id;
    private int userId;
    private int offerId;
    private int requestId;
    private int transactionId;
    private String status;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String addedDateTime;
    private String reservedDateTime;
    private int malesCount;
    private int femalesCount;
    private String pickup;
    private String note;
    private String feedback;
    private int payed;
    private int paymentId;
    private int apn;
    private int archived;
    private int invites;
    private ReminderRes reminderRes;
    private HostRes hostRes;
    private ArrayList<Image> venueImage;
    private Offer offer;
    private Request request;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getOfferId() {
        return offerId;
    }

    public void setOfferId(int offerId) {
        this.offerId = offerId;
    }

    public int getRequestId() {
        return requestId;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddedDateTime() {
        return addedDateTime;
    }

    public void setAddedDateTime(String addedDateTime) {
        this.addedDateTime = addedDateTime;
    }

    public String getReservedDateTime() {
        return reservedDateTime;
    }

    public void setReservedDateTime(String reservedDateTime) {
        this.reservedDateTime = reservedDateTime;
    }

    public int getMalesCount() {
        return malesCount;
    }

    public void setMalesCount(int malesCount) {
        this.malesCount = malesCount;
    }

    public int getFemalesCount() {
        return femalesCount;
    }

    public void setFemalesCount(int femalesCount) {
        this.femalesCount = femalesCount;
    }

    public String getPickup() {
        return pickup;
    }

    public void setPickup(String pickup) {
        this.pickup = pickup;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public int getPayed() {
        return payed;
    }

    public void setPayed(int payed) {
        this.payed = payed;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public int getApn() {
        return apn;
    }

    public void setApn(int apn) {
        this.apn = apn;
    }

    public int getArchived() {
        return archived;
    }

    public void setArchived(int archived) {
        this.archived = archived;
    }

    public int getInvites() {
        return invites;
    }

    public void setInvites(int invites) {
        this.invites = invites;
    }

    public ReminderRes getReminderRes() {
        return reminderRes;
    }

    public void setReminderRes(ReminderRes reminderRes) {
        this.reminderRes = reminderRes;
    }

    public HostRes getHostRes() {
        return hostRes;
    }

    public void setHostRes(HostRes hostRes) {
        this.hostRes = hostRes;
    }

    public ArrayList<Image> getVenueImage() {
        return venueImage;
    }

    public void setVenueImage(ArrayList<Image> venueImage) {
        this.venueImage = venueImage;
    }

    public Offer getOffer() {
        return offer;
    }

    public void setOffer(Offer offer) {
        this.offer = offer;
    }

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }
}
