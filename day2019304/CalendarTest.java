package day2019304;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarTest {
	public static void main(String[] args) {
		//获取任意一年的二月由多少天
		Calendar c = Calendar.getInstance();
		
		//设置年月日 输入
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要获取二月份的年份:");
		int year = sc.nextInt();
		
		c.set(year, 2, 1);//设置任意一年的3月1日
		c.add(Calendar.DATE, -1);//任意一年的2月的最后一天
		
		System.out.println(c.get(Calendar.DATE));
	}

}
