package com.task.one.hibernate.entegration.dao;

import com.task.one.hibernate.entegration.entities.Phone;

public interface IPhoneDao {

    	public abstract void addPhone(Phone phone);
	public abstract Phone  fetchPhonebyNo(String phoneNo);
	public abstract void updatePhoneByNo(String phoneNo);
	public abstract void  deletePhoneByNo(String phoneNo);
}
