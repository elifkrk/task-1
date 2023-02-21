package com.task.one.hibernate.entegration.dao;

import com.task.one.hibernate.entegration.entities.Account;

public interface IAccountDao {
    
    	public  void addAccount(Account account);
	public  Account  fetchAccountbyNo(int accountNumber);
	public  void updateAccountByNo(int accountNumber);
	public  void  deleteAccountByNo(Integer accountNumber);


}
