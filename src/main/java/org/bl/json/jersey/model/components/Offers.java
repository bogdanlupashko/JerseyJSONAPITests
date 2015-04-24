package org.bl.json.jersey.model.components;

import org.codehaus.jackson.annotate.JsonIgnore;

/**
 * Created by blupashko on 17.04.2015.
 */
public class Offers {
    private int id;
    private int venueId;
    private int userId;
    private String type;
    private String name;
    private String description;
    private int cost;
    private String costType;
    private int deposit;
    private int paymentFull;
    private int paymentDeposit;
    private int people;
    private String peopleType;
    private String tableLocation;
    private String additionalDetails;
    private String requirements;
    private int limit;
    private int redeemed;
    private String status;
    private String bachelor;
    private String dateTime;
    @JsonIgnore
    private int periodId;

    @JsonIgnore
    private int archived;

    public int getArchived() {
        return archived;
    }

    public void setArchived(int archived) {
        this.archived = archived;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVenueId() {
        return venueId;
    }

    public void setVenueId(int venueId) {
        this.venueId = venueId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getCostType() {
        return costType;
    }

    public void setCostType(String costType) {
        this.costType = costType;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public int isPaymentFull() {
        return paymentFull;
    }

    public void setPaymentFull(int paymentFull) {
        this.paymentFull = paymentFull;
    }

    public int isPaymentDeposit() {
        return paymentDeposit;
    }

    public void setPaymentDeposit(int paymentDeposit) {
        this.paymentDeposit = paymentDeposit;
    }

    public int getPeople() {
        return people;
    }

    public void setPeople(int people) {
        this.people = people;
    }

    public String getPeopleType() {
        return peopleType;
    }

    public void setPeopleType(String peopleType) {
        this.peopleType = peopleType;
    }

    public String getTableLocation() {
        return tableLocation;
    }

    public void setTableLocation(String tableLocation) {
        this.tableLocation = tableLocation;
    }

    public String getAdditionalDetails() {
        return additionalDetails;
    }

    public void setAdditionalDetails(String additionalDetails) {
        this.additionalDetails = additionalDetails;
    }

    public String getRequirements() {
        return requirements;
    }

    public void setRequirements(String requirements) {
        this.requirements = requirements;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getRedeemed() {
        return redeemed;
    }

    public void setRedeemed(int redeemed) {
        this.redeemed = redeemed;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBachelor() {
        return bachelor;
    }

    public void setBachelor(String bachelor) {
        this.bachelor = bachelor;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public int getPeriodId() {
        return periodId;
    }

    public void setPeriodId(int periodId) {
        this.periodId = periodId;
    }
}
