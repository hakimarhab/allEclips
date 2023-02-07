package com.qa.mycode.utilities;

import java.util.Date;


public  class Utility {
	

public static String generateDateTimeStramp() {
	    	
	    	Date date=new Date();
	    	String timeStamp= date.toString().replace(":", "_").replace(" ", "_");
	    	
	    	return "selenium"+timeStamp+"@gmail.com";
	    	}
       public static final int IMPLICIT_WAIT_TIME=200;
       public static final int PAGELOAD_TIME=200;

}
