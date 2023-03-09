package com.task.one.hibernate.entegration.dao;

import com.task.one.hibernate.entegration.entities.Command;

public interface ICommandDao {
    
    	public  void addCommand(Command command);
	public  Command  fetchCommandbyId(int id);
	public  Command  fetchCommandbyCommandName(String className);
	public  void updateCommandById(int id);
	public  void  deleteCommandById(int id);
}
