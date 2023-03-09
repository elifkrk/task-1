package com.task.one.hibernate.entegration.dao;

import com.task.one.hibernate.entegration.entities.Account;

public interface IAccountDao {
    
    	public  void addAccount(Account account);
	public  Account  fetchAccountbyNo(String accountNumber);
	public  void updateAccountByNo(String accountNumber);
	public  void  deleteAccountByNo(String accountNumber);


}
