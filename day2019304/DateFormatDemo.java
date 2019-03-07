package day2019304;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * @author 40272
 *DateFormat:��������ڽ��и�ʽ���ͽ����ĳ����ࡣ
 *���ԣ�����ѧϰ�����ಢʹ�á�
 *SimpleDateFormat:
 *��ʽ��(����->�ı���
 *           Date -- String
 *                   public final  String format(Date date)
 *����    (�ı�->����)
 *           String-- Date
 *                    public Date parse(String source)
 *                    ģʽ�������͸������ַ���ƥ�䡣
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
