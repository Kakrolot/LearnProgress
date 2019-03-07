package day2019307;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo03 {
	public static void main(String[] args) {
		String s = "2015-04-03 10:37:45";
		//请写功能实现
		Date d = null;
		
		try {
			d = stringToDate(s);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(d);
		System.out.println("haha");
	}
	public static Date stringToDate(String s) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date d = sdf.parse(s);
		return d;
		
	}

}
