package com.task.one.hibernate.entegration.clientTest;
	 
import java.util.HashMap;
import com.task.one.hibernate.entegration.command.CommandExecutor;
import com.task.one.hibernate.entegration.command.ICommand;
import com.task.one.hibernate.entegration.constants.CommandKeyConstant;
import com.task.one.hibernate.entegration.daoImpl.CommandDaoImpl;
import com.task.one.hibernate.entegration.entities.Account;
import com.task.one.hibernate.entegration.entities.Address;
import com.task.one.hibernate.entegration.entities.Customer;
import com.task.one.hibernate.entegration.entities.Phone;
import com.task.one.hibernate.entegration.enums.CommandNameEnum;

 
public class ClientTest {
 
    
    public static void main(String[] args) throws Exception {

	ICommand command = new CommandExecutor(new CommandDaoImpl());
	
	 HashMap<String, Object>  map= new HashMap<String, Object>();
	
	 command.execute(createCommandParameter(CommandNameEnum.ADD_CUSTOMER_INFO));
	

	 
//	HashMap<String, Object> map = getCustomerData();
//	new CustomerDaoImpl().addCustomer((Customer)map.get("customer"));
//	new AccountDaoImpl().addAccount((Account)map.get("account"));
//	new PhoneDaoImpl().addPhone((Phone)map.get("phone"));
//	new AddressDaoImpl().addAddress((Address)map.get("address"));	    
   }

    private static  HashMap<String, Object> createCommandParameter(CommandNameEnum commandName){
        HashMap<String, Object> map = new HashMap<String, Object>();
        
	Customer customer= new Customer();

	customer.setCustomerNumber("14578938");
	customer.setName("elif k");
	customer.setSurname("elif k");
	customer.setCustomerType("Bireysel");
	
        map.put(CommandKeyConstant.COMMAND_NAME, commandName.getValue());
        map.put(CommandKeyConstant.PARAMETER, customer);


	return map;
	
    }
	private static HashMap<String, Object> getCustomerData(){
	        HashMap<String, Object> map = new HashMap<String, Object>();
		Account account= new Account();
		Customer customer= new Customer();
		Phone phone= new Phone();
		Address address= new Address();
		
		customer.setCustomerNumber("14578938");
		customer.setName("elif k");
		customer.setSurname("elif k");
		customer.setCustomerType("Bireysel");
		map.put("customer", customer);
		
		
		account.setCustomerNumber("14578938");
		account.setAccountNumber("789636421569");
		map.put("account", account);
		
		phone.setCustomerNumber("14578938");
		phone.setPhoneNumber("05377777777");
		map.put("phone", phone);

		address.setCustomerNumber("14578938");
		address.setAddress("daaa");
		map.put("address", address);

		return map;
	}

	
}