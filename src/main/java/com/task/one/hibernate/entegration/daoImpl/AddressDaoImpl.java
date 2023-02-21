package com.task.one.hibernate.entegration.daoImpl;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.task.one.hibernate.entegration.entities.Address;
import com.task.one.hibernate.entegration.util.HibernateUtil;

public class AddressDaoImpl {
    
    public void addAddress(Address Address) {
 	// TODO Auto-generated method stub
 	try {
 	      Session session = HibernateUtil.getSessionFactory().openSession();
 		session.beginTransaction();
 		Integer id =(Integer)session.save(Address);
 		System.out.println("Address is created  with Id::"+id);
 		session.getTransaction().commit();
 	} catch (HibernateException e) {
 		e.printStackTrace();
 	}
 	
     }

     public Address fetchAddressbyNo(String addressId) {
 	// TODO Auto-generated method stub
 	Address Address = null;
 	try {
 	        Session session = HibernateUtil.getSessionFactory().openSession();
 	        Address = session.get(Address.class, addressId );
 		if(Address != null){
 		 return Address;
 		}else{
 			System.out.println("Address doesn't exist with provideded number..");
 		}
 	} catch (HibernateException e) {
 		e.printStackTrace();
 	}
 	return null;
 	
     }


     public void updateAddressByNo(Integer addressId) {
 	// TODO Auto-generated method stub
 	try { 
 	        Session session = HibernateUtil.getSessionFactory().openSession();	    
 		Address address = session.get(Address.class, addressId);
 		if(address != null){
 			address.setId(addressId);
 			session.beginTransaction();
 			session.update(address);
 			session.getTransaction().commit();
 		}else{
 			System.out.println("Address doesn't exist with provideded id..");
 		}
 		
 	} catch (HibernateException e) {
 		e.printStackTrace();
 	}
 	
     }

     public void deleteAddressByNo(String addressId) {
 	// TODO Auto-generated method stub
 	try {   
 	     	Session session = HibernateUtil.getSessionFactory().openSession();
 		Address address = session.get(Address.class, addressId);
 		if(address != null){
 			session.beginTransaction();
 			
 			session.delete(address);
 			session.getTransaction().commit();
 		}else{
 			System.out.println("Address doesn't exist with provideded id..");
 		}
 	} catch (HibernateException e) {
 		e.printStackTrace();
 	}
 	
     }

}
