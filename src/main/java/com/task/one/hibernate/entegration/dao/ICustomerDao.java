package com.task.one.hibernate.entegration.dao;

import com.task.one.hibernate.entegration.entities.Customer;

public interface ICustomerDao {

	public abstract void addCustomer(Customer Customer);
	public abstract Customer  fetchCustomerbyNo(int customerNo);
	public abstract void updateCustomerByNo(int customerNo);
	public abstract void  deleteCustomerByNo(Integer customerNo);
}
