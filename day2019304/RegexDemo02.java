package day2019304;

import java.util.Scanner;

/*
 * �жϹ���
 * String��ķ���:
 *            public boolean matches(String regex)
 */
public class RegexDemo02 {
	public static void main(String[] args) {
		/*
		 * ����:����绰����
		 * 
		 * ����:
		 *       �绰��������
		 *       
		 */
		//�������
		String regex = "1[38][0-9]{9}";
		
		//����¼���ֻ�����
		Scanner sc = new Scanner(System.in);
		System.out.println("�������ֻ�����:");
		String phone = sc.nextLine();
		
		//�����жϹ���
		boolean flag = phone.matches(regex);
		System.out.println(flag);
	}

}
