package com.task.one.hibernater.entegration.com.task.one.hibernater.entegration.dto;

import java.math.BigDecimal;
import java.util.Date;


public class AccountTransaction {

    private String accountNumber                               ;
    private    String transactionType;
    private    BigDecimal costAmount;
    private    String destinationAccountNumber;
    private    String destinationBankCode;
    private    String destinationCreditCardNumber;
    private    String destinationIban;
    private    Date lastModifyDate;
    private    BigDecimal outgoingAmount;
    private    BigDecimal taxAmount;
    private    BigDecimal totalAmount;
    private    Date transactionDate;
    private    int transactionNo;
    private    int transactionQueryNo;
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
    public int getTransactionNo() {
        return transactionNo;
    }
    public void setTransactionNo(int transactionNo) {
        this.transactionNo = transactionNo;
    }
    public int getTransactionQueryNo() {
        return transactionQueryNo;
    }
    public void setTransactionQueryNo(int transactionQueryNo) {
        this.transactionQueryNo = transactionQueryNo;
    }   
    
  
}
