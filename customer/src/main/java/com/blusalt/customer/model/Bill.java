package com.blusalt.customer.model;

public class Bill {

    private Long billId;
    private Long transactionId;
    private Long customerId;
    private Double amount;
    private String status = "pending";

    public Bill() {
    }

    public Bill(Long billId, Long transactionId, Long customerId, Double amount) {
        this.billId = billId;
        this.transactionId = transactionId;
        this.customerId = customerId;
        this.amount = amount;
    }

    public Long getBillId() {
        return billId;
    }

    public void setBillId(Long billId) {
        this.billId = billId;
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
