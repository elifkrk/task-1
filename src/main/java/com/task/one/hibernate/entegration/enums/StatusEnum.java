package com.task.one.hibernate.entegration.enums;

public enum StatusEnum {

    ISLENDI("0"),
    ISLENECEK("1");
    
    private String value;

    /**
     * @param value
     */
    private StatusEnum(String value) {
	this.value = value;
    }
    
    public String getValue() {
	
	return this.value;
    }
}
