package com.rashid;
import java.util.*;
public class DateandTime {

	public static void main(String[] args) {
	int day , month ,year;
	int second ,minute ,hour ;
	GregorianCalendar date = new GregorianCalendar();
	day=date.get(Calendar.DAY_OF_MONTH);
	month = date.get(Calendar.MONTH);
	year = date.get(Calendar.YEAR);
	second = date.get(Calendar.SECOND);
	minute = date.get(Calendar.MINUTE);
	hour = date.get(Calendar.HOUR);
	System.out.println("Current Date is "+day+"/"+month+"/"+year);
	System.out.println("Current time is :"+hour+":"+minute+":"+second);
	
			

	}

}
