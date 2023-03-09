package com.task.one.hibernate.entegration.enums;

public enum CommandNameEnum {
    
    ADD_CUSTOMER_INFO("add_customer_info"),
    DELETE_CUSTOMER_INFO("delete_customer_info"),
    UPDATE_CUSTOMER_INFO("update_customer_info");

    
    private String value;

    /**
     * @param value
     */
    private CommandNameEnum(String value) {
	this.value = value;
    }
    
    public String getValue() {
	
	return this.value;
    }
    
}
