package day2019304;

import java.util.Calendar;

/**
 * 
 * @author 40272
 * Calendar:��ʱ��ָ����һ�������꣬�£��գ�ʱ���֣���ȡ������Ҫ�õ�һ��������������ʱ���롣��Ҫ�����Լ�Ʒ����
 * �������� ----  �꣬�£��գ�ʱ���֣���
 * 
 * public int get(int fied):���ظ��������ֶε�ֵ
 *
 */
public class CalendarDemo {
	public static void main(String[] args) {
		//��������
		//�����ֶ����ɵ�Ǯ���ں�ʱ���ʼ��:
		Calendar rightNow = Calendar.getInstance();//��̬
		
		//��ȡ�� 
		int year = rightNow.get(Calendar.YEAR);
		System.out.println(year);
		//��ȡ��
		int month = rightNow.get(Calendar.MONTH);
		System.out.println(month+1);
		//��ȡ��
		int date = rightNow.get(Calendar.DATE);
		System.out.println(date);
		//��ȡʱ
		int hour = rightNow.get(Calendar.HOUR);
		System.out.println(hour);
		//��ȡ��
		int minute = rightNow.get(Calendar.MINUTE);
		System.out.println(minute);
		//��ȡ��
		int second = rightNow.get(Calendar.SECOND);
		System.out.println(second);
	}

}
