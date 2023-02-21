package com.task.one.hibernate.entegration.dao;

import com.task.one.hibernate.entegration.entities.Address;

public interface IAddressDao {

	public abstract void addAddress(Address address);
	public abstract Address  fetchAddressbyId(int id);
	public abstract void updateAddressById(int addressId);
	public abstract void  deleteAddressById(Integer addressId);
}
