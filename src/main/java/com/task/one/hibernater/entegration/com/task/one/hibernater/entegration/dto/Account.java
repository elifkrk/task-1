package com.task.one.hibernater.entegration.com.task.one.hibernater.entegration.dto;

import java.math.BigDecimal;
import java.util.Date;

public class Account {
    
    private String accountNumber;
    private Date createdDate;
    private String customerNumber;
    private String iban;
    private String isBlocked;
    private Date lastModifyDate;
    private String status;
    private BigDecimal totalAmount;
    
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public Date getCreatedDate() {
        return createdDate;
    }
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
    public String getCustomerNumber() {
        return customerNumber;
    }
    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }
    public String getIban() {
        return iban;
    }
    public void setIban(String iban) {
        this.iban = iban;
    }
    public String getIsBlocked() {
        return isBlocked;
    }
    public void setIsBlocked(String isBlocked) {
        this.isBlocked = isBlocked;
    }
    public Date getLastModifyDate() {
        return lastModifyDate;
    }
    public void setLastModifyDate(Date lastModifyDate) {
        this.lastModifyDate = lastModifyDate;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public BigDecimal getTotalAmount() {
        return totalAmount;
    }
    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }    
    
}
