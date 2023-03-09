package com.task.one.hibernate.entegration.daoImpl;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.task.one.hibernate.entegration.dao.IPhoneDao;
import com.task.one.hibernate.entegration.entities.Phone;
import com.task.one.hibernate.entegration.util.HibernateUtil;

public class PhoneDaoImpl implements IPhoneDao {

    public void addPhone(Phone phone) {
 	// TODO Auto-generated method stub
	Session session = HibernateUtil.getSessionFactory().openSession();

 	try {
 		session.beginTransaction();
 		
 		Integer id =(Integer)session.save(phone);
 		System.out.println("Phone is created  with Id::"+id);
 		session.getTransaction().commit();
 	} catch (HibernateException e) {
 	    session.getTransaction().rollback();
 	    e.printStackTrace();
 	}
 	
     }

     public Phone fetchPhonebyNo(String phoneNumber) {
 	// TODO Auto-generated method stub
 	Phone phone = null;
	Session session = HibernateUtil.getSessionFactory().openSession();

 	try {
 	        phone = session.get(Phone.class, phoneNumber );
 		if(phone != null){
 		 return phone;
 		}else{
 			System.out.println("Phone doesn't exist with provideded Id..");
 		}
 	} catch (HibernateException e) {
 		e.printStackTrace();
 	}
 	return null;
 	
     }


     public void updatePhoneByNo(String phoneNumber) {
 	// TODO Auto-generated method stub
	Session session = HibernateUtil.getSessionFactory().openSession();	    

 	try { 
 		Phone phone = session.get(Phone.class, phoneNumber);
 		if(phone != null){
 			phone.setPhoneNumber(phoneNumber);
 			session.beginTransaction();
 			session.update(phone);
 			session.getTransaction().commit();
 		}else{
 			System.out.println("Phone doesn't exist with provideded Id..");
 		}
 		
 	} catch (HibernateException e) {
 	    session.getTransaction().rollback();
            e.printStackTrace();
 		
 	}
 	
     }

     public void deletePhoneByNo(String phoneNumber) {
 	// TODO Auto-generated method stub
        Session session = HibernateUtil.getSessionFactory().openSession();

 	try {   
 		Phone phone = session.get(Phone.class, phoneNumber);
 		if(phone != null){
 			session.beginTransaction();
 			
 			session.delete(phone);
 			session.getTransaction().commit();
 		}else{
 			System.out.println("Phone doesn't exist with provideded Id..");
 		}
 	} catch (HibernateException e) {
 	    session.getTransaction().rollback();
 	    e.printStackTrace();
 	}
 	
     }


}
