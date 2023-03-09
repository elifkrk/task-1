package com.task.one.hibernate.entegration.enums;

public enum TransactionType {

    A("Alacak"),
    B("Borc"),
    
    private String value;

    /**
     * @param value
     */
    private TransactionType(String value) {
	this.value = value;
    }
    
    public String getValue() {
	
	return this.value;
    }
}
