package com.logger;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Basic_Log {
	
	//Factory design pattern
	static Logger log = Logger.getLogger(Basic_Log.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicConfigurator.configure();
		log.debug("Debug");
		log.info("Information");
		log.warn("Warning");
		log.error("Error");
		log.fatal("Fatal");
	}

}
