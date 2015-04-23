package org.bl.json.jersey.model.components;

/**
 * Created by blupashko on 23.04.2015.
 */
public class Request {
    private int id;
    private String expirationDateTime;
    private String beginDateTime;
    private int malesCount;
    private int femalesCount;
    private int budget;
    private String costType;
    private int deposit;
    private boolean paymentFull;
    private boolean paymentDeposit;
    private String tableLocation;
    private String status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getExpirationDateTime() {
        return expirationDateTime;
    }

    public void setExpirationDateTime(String expirationDateTime) {
        this.expirationDateTime = expirationDateTime;
    }

    public String getBeginDateTime() {
        return beginDateTime;
    }

    public void setBeginDateTime(String beginDateTime) {
        this.beginDateTime = beginDateTime;
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

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
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

    public boolean isPaymentFull() {
        return paymentFull;
    }

    public void setPaymentFull(boolean paymentFull) {
        this.paymentFull = paymentFull;
    }

    public boolean isPaymentDeposit() {
        return paymentDeposit;
    }

    public void setPaymentDeposit(boolean paymentDeposit) {
        this.paymentDeposit = paymentDeposit;
    }

    public String getTableLocation() {
        return tableLocation;
    }

    public void setTableLocation(String tableLocation) {
        this.tableLocation = tableLocation;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
