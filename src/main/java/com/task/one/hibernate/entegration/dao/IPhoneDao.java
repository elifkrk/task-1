package com.task.one.hibernate.entegration.dao;

import com.task.one.hibernate.entegration.entities.Phone;

public interface IPhoneDao {

    	public abstract void addPhone(Phone phone);
	public abstract Phone  fetchPhonebyId(int id);
	public abstract void updatePhoneById(int phoneNo);
	public abstract void  deletePhoneById(Integer phoneNo);
}
