package showDateTimeStampCode;

import java.util.Date;

public class DateTimeStamp {

	public static String main(String[] args) {
		Date date = new Date();
		
		String timeStamp =  date.toString().replace(" ", "_").replace(":", "_");
		return "seleniumpanda" + timeStamp + "@gmail.com";
		
		
		//System.out.println(date.toString());
		//String replacedDate = date.toString().replace(" ", "_");
		//System.out.println(replacedDate);
		//String FinalReplacedDate = replacedDate.replace(":", "_");
		//System.out.println(FinalReplacedDate);
	}

}
