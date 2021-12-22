package com.logger;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Property_Class {
	
	static Logger log = Logger.getLogger(Property_Class.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PropertyConfigurator.configure("log4j.properties");
		log.debug("Debug");
		log.info("Information");
		log.warn("Warning");
		log.error("Error");
		log.fatal("Fatal");
	}

}
