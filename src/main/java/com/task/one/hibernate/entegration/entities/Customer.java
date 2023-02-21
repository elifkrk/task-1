package com.task.one.hibernate.entegration.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @Column(name="customer_number")
    private String customerNumber;
    
    @Column(name="corporation_name")
    private String corporationName;
    
    @Column(name="customer_type")
    private String customerType;
    
    @Column(name="is_wage_customer")
    private String isWageCustomer;
    
    @Column(name="name")
    private String name;
    
    @Column(name="surname")
    private String surname;
    
    @Column(name="tckn")
    private String tckn;
    
    @Column(name="vkn")
    private String vkn ;
    
    
    @Column(name="last_modify_date")
    private Date lastModifyDate;
    
    @Column(name="created_date")
    private Date createdDate;
    
    public String getCustomerNumber() {
        return customerNumber;
    }
    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }
    public String getCorporationName() {
        return corporationName;
    }
    public void setCorporationName(String corporationName) {
        this.corporationName = corporationName;
    }
    public String getCustomerType() {
        return customerType;
    }
    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }
    public String getIsWageCustomer() {
        return isWageCustomer;
    }
    public void setIsWageCustomer(String isWageCustomer) {
        this.isWageCustomer = isWageCustomer;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getTckn() {
        return tckn;
    }
    public void setTckn(String tckn) {
        this.tckn = tckn;
    }
    public String getVkn() {
        return vkn;
    }
    public void setVkn(String vkn) {
        this.vkn = vkn;   
    }
    public Date getLastModifyDate() {
        return lastModifyDate;
    }
    public void setLastModifyDate(Date lastModifyDate) {
        this.lastModifyDate = lastModifyDate;
    }
    public Date getCreatedDate() {
        return createdDate;
    }
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    } 
    

}
