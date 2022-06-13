package com.icomteq.erp.company.administration.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
	
	static SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm a");

	public static String MonthDayYearTimeStamp(Date date) {
		return sdf.format(date);
	}
	
	public static Date ToDate(String date) throws ParseException {
		return sdf.parse(date);
	}
}
