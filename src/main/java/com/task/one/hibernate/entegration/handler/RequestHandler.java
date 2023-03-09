package com.task.one.hibernate.entegration.handler;


import com.task.one.hibernate.entegration.entities.Customer;

import javax.xml.parsers.*;
import org.xml.sax.*;
import org.xml.sax.helpers.*;

public class RequestHandler extends DefaultHandler {
    
    private Customer customer = null;
    private String commandName;    
    private String currentElement;
    

    public Customer getCustomer() {
        return customer;
    }


    public String getCommandName() {
        return commandName;
    }

    
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
	currentElement = qName;
        if (qName.equalsIgnoreCase("customer")) {
            customer = new Customer();
            customer.setCustomerNumber(attributes.getValue("customerNumber"));
        }
        if (qName.equalsIgnoreCase("commandName")) {
            commandName = attributes.getValue("commandName");
        }
    }

    public void characters(char[] ch, int start, int length) throws SAXException {
        if (customer != null) {
            String value = new String(ch, start, length);
            if ("firstName".equals(currentElement())) {
                customer.setName(value);
            } else if ("lastName".equals(currentElement())) {
                customer.setSurname(value);
            } 
        }
    }

    private String currentElement() {
	return currentElement;
        // return the name of the current element being processed
    }
}
