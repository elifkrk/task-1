package com.task.one.hibernate.entegration.command;


import java.lang.reflect.Method;
import java.util.HashMap;

import com.task.one.hibernate.entegration.constants.CommandKeyConstant;
import com.task.one.hibernate.entegration.dao.ICommandDao;
import com.task.one.hibernate.entegration.entities.Command;
import com.task.one.hibernate.entegration.exception.DataNotFoundException;

public class CommandExecutor implements ICommand {
    
    private static final String CLASS_LOCATION = "com.task.one.hibernate.entegration.daoImpl.";
        
    private ICommandDao commandDao;     

    /**
     * @param commandDao
     */
    public CommandExecutor(ICommandDao commandDao) {
	super();
	this.commandDao = commandDao;
    }


    public void execute(HashMap<String, Object> parameterMap) throws Exception {
	// TODO Auto-generated method stub
	
	Command command = getCommandRecord((String)parameterMap.get(CommandKeyConstant.COMMAND_NAME));
	
	if(command == null) {
	     throw new DataNotFoundException("Command is not found ....");
	}	


        try {
            Class classRef = Class.forName(CLASS_LOCATION + command.getClassName());
            Object instance = classRef.newInstance();        
        
             Method method = classRef.getDeclaredMethod(command.getMethodName(), parameterMap.get(CommandKeyConstant.PARAMETER).getClass());
             Object result = method.invoke(instance, parameterMap.get(CommandKeyConstant.PARAMETER));  
             

        } catch (Exception ex) {
            ex.printStackTrace();
        }
	
    }

     
    
    private  Command getCommandRecord(String commandName) {
	
	return 	this.commandDao.fetchCommandbyCommandName(commandName);
    }
}
