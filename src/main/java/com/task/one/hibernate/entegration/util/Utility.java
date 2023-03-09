package com.task.one.hibernate.entegration.util;
import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;


import org.jdom2.JDOMException;
import org.xml.sax.InputSource;

import com.task.one.hibernate.entegration.constants.CommandKeyConstant;
import com.task.one.hibernate.entegration.entities.Customer;
import com.task.one.hibernate.entegration.enums.CommandNameEnum;
import com.task.one.hibernate.entegration.handler.RequestHandler;


public class Utility {
    
    public static RequestHandler xmlParser(String xmlRequest) throws JDOMException, IOException {

	try {
	    SAXParserFactory factory = SAXParserFactory.newInstance();
	    SAXParser saxParser = factory.newSAXParser();

	    RequestHandler requestHandler = new RequestHandler();
	    saxParser.parse(new InputSource(new StringReader(xmlRequest)), requestHandler);
	    return requestHandler;
	    
	} catch (Exception e) {
	    e.printStackTrace();
	}
	return null;

    }

    public static  HashMap<String, Object> createCommandParameter(CommandNameEnum commandName, Customer customer){
        HashMap<String, Object> map = new HashMap<String, Object>();	
        map.put(CommandKeyConstant.COMMAND_NAME, commandName.getValue());
        map.put(CommandKeyConstant.PARAMETER, customer);
	return map;
	
    }
}
