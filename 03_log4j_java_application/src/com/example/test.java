package com.example;
//log4j
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class test {
	private static Logger logger = LogManager.getLogger(test.class.getName());//test.class.getName()//log4jdemo
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("this is java.");
		logger.info("log4j info.");
		logger.debug("log4j debug.");
		logger.error("log4j error.");
	}

}
