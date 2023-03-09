package com.task.one.hibernate.entegration.dao;

import com.task.one.hibernate.entegration.entities.Customer;

public interface ICustomerDao {

	public abstract void addCustomer(Customer Customer);
	public abstract Customer  fetchCustomerbyNo(String customerNo);
	public abstract void updateCustomerByNo(String customerNo);
	public abstract void  deleteCustomerByNo(String customerNo);
}
