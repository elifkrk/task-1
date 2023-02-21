package com.task.one.hibernate.entegration.daoImpl;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.task.one.hibernate.entegration.dao.IAccountDao;
import com.task.one.hibernate.entegration.entities.Account;
import com.task.one.hibernate.entegration.util.HibernateUtil;

public class AccountDaoImpl {

    public void addAccount(Account account) {
	// TODO Auto-generated method stub
	      Session session = HibernateUtil.getSessionFactory().openSession();

	try {
		session.beginTransaction();
		session.save(account);
		System.out.println("Account is created ::");
		session.getTransaction().commit();
	} catch (HibernateException e) {
	    session.getTransaction().rollback();

		e.printStackTrace();
	}
	
    }

    public Account fetchAccountbyNo(String accountNumber) {
	// TODO Auto-generated method stub
	Account account = null;
        Session session = HibernateUtil.getSessionFactory().openSession();

	try {
	        account = session.get(Account.class, accountNumber );
		if(account != null){
		 return account;
		}else{
			System.out.println("Account doesn't exist with provideded Id..");
		}
	} catch (HibernateException e) {
	    session.getTransaction().rollback();

		e.printStackTrace();
	}
	return null;
	
    }


    public void updateAccountByNo(String accountNumber) {
	// TODO Auto-generated method stub
        Session session = HibernateUtil.getSessionFactory().openSession();	    

	try { 
		Account account = session.get(Account.class, accountNumber);
		if(account != null){
			account.setAccountNumber(accountNumber);
			session.beginTransaction();
			session.update(account);
			session.getTransaction().commit();
		}else{
			System.out.println("Account doesn't exist with provideded Id..");
		}
		
	} catch (HibernateException e) {
	    session.getTransaction().rollback();
		e.printStackTrace();
	}
	
    }

    public void deleteAccountByNo(String accountNumber) {
	// TODO Auto-generated method stub
     	Session session = HibernateUtil.getSessionFactory().openSession();

	try {   
		Account account = session.get(Account.class, accountNumber);
		if(account != null){
			session.beginTransaction();
			
			session.delete(account);
			session.getTransaction().commit();
		}else{
			System.out.println("Account doesn't exist with provideded Id..");
		}
	} catch (HibernateException e) {
	    session.getTransaction().rollback();
		e.printStackTrace();
	}
	
    }

    
}
