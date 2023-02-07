package Mosh;

import java.text.NumberFormat;

public class Numberforms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		// format currency
	NumberFormat	percent=NumberFormat.getPercentInstance();
	
	String  result=percent.format(0.891);
	System.out.println(result);
		
		
	}

}
