package com.task.one.hibernate.entegration.daoImpl;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.task.one.hibernate.entegration.entities.AccountTransaction;
import com.task.one.hibernate.entegration.util.HibernateUtil;

public class AccountTransactionDaoImpl {
    public void addAccountTransaction(AccountTransaction AccountTransaction) {
 	// TODO Auto-generated method stub
	      Session session = HibernateUtil.getSessionFactory().openSession();
 	try {
 		session.beginTransaction();
 		session.save(AccountTransaction);
 		System.out.println("Transaction is created  with Id::");
 		session.getTransaction().commit();
 	} catch (HibernateException e) {
 	    	session.getTransaction().rollback();
 		e.printStackTrace();
 	}
 	
     }

     public AccountTransaction fetchAccountTransactionbyNo(String transactionNo) {
 	// TODO Auto-generated method stub
 	AccountTransaction AccountTransaction = null;
	        Session session = HibernateUtil.getSessionFactory().openSession();

 	try {
 	        AccountTransaction = session.get(AccountTransaction.class, transactionNo );
 		if(AccountTransaction != null){
 		 return AccountTransaction;
 		}else{
 			System.out.println("AccountTransaction doesn't exist with provideded number..");
 		}
 	} catch (HibernateException e) {
 	    session.getTransaction().rollback();
 		e.printStackTrace();
 	}
 	return null;
 	
     }


     public void updateAccountTransactionByNo(String transactionNo) {
 	// TODO Auto-generated method stub
	        Session session = HibernateUtil.getSessionFactory().openSession();	    

 	try { 
 		AccountTransaction accountTransaction = session.get(AccountTransaction.class, transactionNo);
 		if(accountTransaction != null){
 			accountTransaction.setTransactionNo(transactionNo);
 			session.beginTransaction();
 			session.update(accountTransaction);
 			session.getTransaction().commit();
 		}else{
 			System.out.println("AccountTransaction doesn't exist with provideded number..");
 		}
 		
 	} catch (HibernateException e) {
 	    session.getTransaction().rollback();
 		e.printStackTrace();
 	}
 	
     }

     public void deleteAccountTransactionByNo(String transactionNo) {
 	// TODO Auto-generated method stub
	     	Session session = HibernateUtil.getSessionFactory().openSession();

 	try {   
 		AccountTransaction accountTransaction = session.get(AccountTransaction.class, transactionNo);
 		if(accountTransaction != null){
 			session.beginTransaction();
 			
 			session.delete(accountTransaction);
 			session.getTransaction().commit();
 		}else{
 			System.out.println("AccountTransaction doesn't exist with provideded number..");
 		}
 	} catch (HibernateException e) {
 	    session.getTransaction().rollback();
 		e.printStackTrace();
 	}
 	
     }
}
