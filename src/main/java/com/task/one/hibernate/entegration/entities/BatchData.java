package com.task.one.hibernate.entegration.entities;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="batch_data")
public class BatchData {
    
    @Id
    @Column(name="sira_no")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long siraNo;
    
    @Column(name="status")
    private String status;
    
    @Column(name="account_no")
    private String accountNo;
    
    @Column(name="amount")
    private BigDecimal amount;
    
    @Column(name="transaction_type")
    private String transactionType;
    
    public Long getSiraNo() {
        return siraNo;
    }
    public void setSiraNo(Long siraNo) {
        this.siraNo = siraNo;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getAccountNo() {
        return accountNo;
    }
    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }
    public BigDecimal getAmount() {
        return amount;
    }
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
    public String getTransactionType() {
        return transactionType;
    }
    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    } 
    
    

}
