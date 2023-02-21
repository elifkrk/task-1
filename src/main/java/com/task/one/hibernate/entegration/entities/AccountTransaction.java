package com.task.one.hibernate.entegration.entities;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "account_transaction")
public class AccountTransaction {

    @Id
    @Column(name = "account_number")
    private String accountNumber ;
    
    @Column(name = "transaction_type")
    private String transactionType;
    
    @Column(name = "cost_amount")
    private BigDecimal costAmount;
    
    @Column(name = "destination_account_number")
    private  String destinationAccountNumber;
    
    @Column(name = "destination_bank_code")
    private String destinationBankCode;
    
    @Column(name = "destination_credit_card_number")
    private String destinationCreditCardNumber;
    
    @Column(name = "destination_iban")
    private String destinationIban;
    
    @Column(name = "last_modify_date")
    private  Date lastModifyDate;
    
    @Column(name = "outgoing_amount")
    private BigDecimal outgoingAmount;
    
    @Column(name = "tax_amount")
    private BigDecimal taxAmount;
    
    @Column(name = "total_amount")
    private BigDecimal totalAmount;
    
    @Column(name = "transaction_date")
    private Date transactionDate;
    
    @Column(name = "transaction_no")
    private String transactionNo;
    
    @Column(name = "transaction_query_no")
    private int transactionQueryNo;
    
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public String getTransactionType() {
        return transactionType;
    }
    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }
    public BigDecimal getCostAmount() {
        return costAmount;
    }
    public void setCostAmount(BigDecimal costAmount) {
        this.costAmount = costAmount;
    }
    public String getDestinationAccountNumber() {
        return destinationAccountNumber;
    }
    public void setDestinationAccountNumber(String destinationAccountNumber) {
        this.destinationAccountNumber = destinationAccountNumber;
    }
    public String getDestinationBankCode() {
        return destinationBankCode;
    }
    public void setDestinationBankCode(String destinationBankCode) {
        this.destinationBankCode = destinationBankCode;
    }
    public String getDestinationCreditCardNumber() {
        return destinationCreditCardNumber;
    }
    public void setDestinationCreditCardNumber(String destinationCreditCardNumber) {
        this.destinationCreditCardNumber = destinationCreditCardNumber;
    }
    public String getDestinationIban() {
        return destinationIban;
    }
    public void setDestinationIban(String destinationIban) {
        this.destinationIban = destinationIban;
    }
    public Date getLastModifyDate() {
        return lastModifyDate;
    }
    public void setLastModifyDate(Date lastModifyDate) {
        this.lastModifyDate = lastModifyDate;
    }
    public BigDecimal getOutgoingAmount() {
        return outgoingAmount;
    }
    public void setOutgoingAmount(BigDecimal outgoingAmount) {
        this.outgoingAmount = outgoingAmount;
    }
    public BigDecimal getTaxAmount() {
        return taxAmount;
    }
    public void setTaxAmount(BigDecimal taxAmount) {
        this.taxAmount = taxAmount;
    }
    public BigDecimal getTotalAmount() {
        return totalAmount;
    }
    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }
    public Date getTransactionDate() {
        return transactionDate;
    }
    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }
    public String getTransactionNo() {
        return transactionNo;
    }
    public void setTransactionNo(String transactionNo) {
        this.transactionNo = transactionNo;
    }
    public int getTransactionQueryNo() {
        return transactionQueryNo;
    }
    public void setTransactionQueryNo(int transactionQueryNo) {
        this.transactionQueryNo = transactionQueryNo;
    }   
    
  
}
