package day2019304;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * @author 40272
 *DateFormat:是针对日期进行格式化和解析的抽象类。
 *所以，我们学习其子类并使用。
 *SimpleDateFormat:
 *格式化(日期->文本）
 *           Date -- String
 *                   public final  String format(Date date)
 *解析    (文本->日期)
 *           String-- Date
 *                    public Date parse(String source)
 *                    模式对象必须和给定的字符串匹配。
 */
public class DateFormatDemo {
	public static void main(String[] args) throws ParseException {
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		String result = sdf.format(d);
		System.out.println(result);
		System.out.println("---------------------------------");
		
		String s = "2008-08-08 12:23:34";
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		Date dd = sdf2.parse(s);
		System.out.println(dd);
	}

}
