package com.task.one.hibernate.entegration.dao;

import com.task.one.hibernate.entegration.entities.AccountTransaction;

public interface IAccountTransactionDao {

	public abstract void addAccountTransaction(AccountTransaction AccountTransaction);
	public abstract AccountTransaction  fetchAccountTransactionbyNo(int TransactionNo);
	public abstract void updateAccountTransactionById(int AccountTransactionId);
	public abstract void  deleteAccountTransactionById(Integer AccountTransactionId);
}
