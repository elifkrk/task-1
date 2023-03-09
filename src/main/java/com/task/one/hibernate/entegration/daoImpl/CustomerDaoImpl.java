package com.task.one.hibernate.entegration.daoImpl;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.task.one.hibernate.entegration.dao.ICustomerDao;
import com.task.one.hibernate.entegration.entities.Customer;
import com.task.one.hibernate.entegration.util.HibernateUtil;

public class CustomerDaoImpl implements ICustomerDao {


    public void addCustomer(Customer Customer) {
 	// TODO Auto-generated method stub
	      Session session = HibernateUtil.getSessionFactory().openSession();

 	try {
 		session.beginTransaction();
 		session.save(Customer);
 		System.out.println("Customer is created  with :");
 		session.getTransaction().commit();
 	} catch (HibernateException e) {
 	    session.getTransaction().rollback();
 		e.printStackTrace();
 	}
 	
     }

     public Customer fetchCustomerbyNo(String customerNumber) {
 	// TODO Auto-generated method stub
 	Customer Customer = null;
	        Session session = HibernateUtil.getSessionFactory().openSession();

 	try {
 	        Customer = session.get(Customer.class, customerNumber );
 		if(Customer != null){
 		 return Customer;
 		}else{
 			System.out.println("Customer doesn't exist with provideded number..");
 		}
 	} catch (HibernateException e) {
 	    session.getTransaction().rollback();
 		e.printStackTrace();
 	}
 	return null;
 	
     }


     public void updateCustomerByNo(String customerNumber) {
 	// TODO Auto-generated method stub
	        Session session = HibernateUtil.getSessionFactory().openSession();	    

 	try { 
 		Customer Customer = session.get(Customer.class, customerNumber);
 		if(Customer != null){
 			Customer.setCustomerNumber(customerNumber);
 			session.beginTransaction();
 			session.update(Customer);
 			session.getTransaction().commit();
 		}else{
 			System.out.println("Customer doesn't exist with provideded id..");
 		}
 		
 	} catch (HibernateException e) {
 	       session.getTransaction().rollback();
 		e.printStackTrace();
 	}
 	
     }

     public void deleteCustomerByNo(String customerNumber) {
 	// TODO Auto-generated method stub
	 Session session = HibernateUtil.getSessionFactory().openSession();

 	try {   
 		Customer customer = session.get(Customer.class, customerNumber);
 		if(customer != null){
 			session.beginTransaction();
 			customer.setCustomerNumber(customerNumber);
 			session.delete(customer);
 			session.getTransaction().commit();
 		}else{
 			System.out.println("Customer doesn't exist with provideded id..");
 		}
 	} catch (HibernateException e) {
	        session.getTransaction().rollback();
 		e.printStackTrace();
 	}
 	
     }
}
