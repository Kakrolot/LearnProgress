package day2019304;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarTest {
	public static void main(String[] args) {
		//��ȡ����һ��Ķ����ɶ�����
		Calendar c = Calendar.getInstance();
		
		//���������� ����
		Scanner sc = new Scanner(System.in);
		System.out.println("������Ҫ��ȡ���·ݵ����:");
		int year = sc.nextInt();
		
		c.set(year, 2, 1);//��������һ���3��1��
		c.add(Calendar.DATE, -1);//����һ���2�µ����һ��
		
		System.out.println(c.get(Calendar.DATE));
	}

}
