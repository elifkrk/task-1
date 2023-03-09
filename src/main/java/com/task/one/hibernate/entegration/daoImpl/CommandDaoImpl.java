package com.task.one.hibernate.entegration.daoImpl;

import org.hibernate.HibernateException;
import org.hibernate.Session;


import com.task.one.hibernate.entegration.dao.ICommandDao;
import com.task.one.hibernate.entegration.entities.Command;
import com.task.one.hibernate.entegration.util.HibernateUtil;

public class CommandDaoImpl implements ICommandDao {

    
    
    public Command fetchCommandbyCommandName(String commandName) {
	// TODO Auto-generated method stub
        Session session = HibernateUtil.getSessionFactory().openSession();

	try {
		Command command = (Command)session.createQuery("from Command where commandName = :commandName")
	    					.setParameter("commandName", commandName)
	    					.uniqueResult()	;
		
		if(command != null){
		    return command;
		}else{
			System.out.println("Command doesn't exist with provideded Id..");
		}
	} catch (HibernateException e) {
	        session.close();
		e.printStackTrace();
	}
	return null;
    }

    public void addCommand(Command command) {
	// TODO Auto-generated method stub
	Session session = HibernateUtil.getSessionFactory().openSession();
	try {
		session.beginTransaction();
		
		Integer id =(Integer)session.save(command);
		System.out.println("Command is created  with Id::"+id);
		session.getTransaction().commit();
	} catch (HibernateException e) {
	    session.getTransaction().rollback();
		e.printStackTrace();
	}
    }

    public Command fetchCommandbyId(int id) {
	// TODO Auto-generated method stub
	Command command = null;
        Session session = HibernateUtil.getSessionFactory().openSession();

	try {
	    	command = session.get(Command.class, id );
		if(command != null){
		 return command;
		}else{
			System.out.println("Command doesn't exist with provideded Id..");
		}
	} catch (HibernateException e) {
		e.printStackTrace();
	}
	return null;
    }

    public void updateCommandById(int id) {
	// TODO Auto-generated method stub
	
    }

    public void deleteCommandById(int id) {
	// TODO Auto-generated method stub
	
    }

}
