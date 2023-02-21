package com.task.one.hibernate.entegration.entities;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="account")
public class Account {
    
    @Id
    @Column(name="account_number")
    private String accountNumber;
    
    @Column(name="created_date")
    private Date createdDate;
    
    @Column(name="customer_number")
    private String customerNumber;

    @Column(name="iban")
    private String iban;
    
  
    @Column(name="is_blocked")
    private String isBlocked;
    
  
    @Column(name="last_modify_date")
    private Date lastModifyDate;
    
    
    @Column(name="status")
    private String status;
    

   
    @Column(name="total_amount")
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
