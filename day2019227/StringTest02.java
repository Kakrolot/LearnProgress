package day2019227;

import java.awt.datatransfer.StringSelection;
import java.util.Scanner;

/**
 * ͳ��һ���ַ����д�д��ĸ�ַ���Сд��ĸ�ַ��������ַ����ֵĴ�����(�����������ַ�)
 * ������Hello123World
 * �����
 * 		��д��2
 * 		Сд��8
 * 		���֣�3
 * 
 * ������
 * 		A:����¼��һ���ַ���
 * 		B:��������ͳ�Ʊ���
 * 			int bigCount = 0;
 * 			int smallCount = 0;
 * 			int numberCount = 0;
 * 		C:�����ַ������õ�ÿһ���ַ�
 * 		D:����ж��ַ��Ǵ�д��Сд����������?
 * 			char ch = ???;
 * 
 * 			ASCII���
 * 				a	97	z=122
 * 				A	65  Z=90
 * 				0	48	9=57
 * 
 * 				ch>=97 && ch<=122
 * 				...
 * 
 * 			ch>='a' && ch<='z'
 * 			ch>='A'	&& ch<='Z'
 * 			ch>='0'	&& ch<='9'
 * 		E:������
 */
public class StringTest02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��һ���ַ���");
		String s = sc.nextLine();
		//��������ͳ�Ʊ���
		int bigCount = 0;
		int smallCount = 0;
		int numberCount = 0;
		for(int i = 0;i < s.length();i++){
			char ch = s.charAt(i);
			
			//����ж��ַ�ʱ��д��Сд���������أ�
			if(ch >= 'A'&&ch <= 'Z'){
				bigCount++;
			}else if(ch>='a'&&ch<='z'){
				smallCount++;
				
			}else if (ch>='0'&&ch<='9') {
				numberCount++;
				
			}
		}
		System.out.println("��д�ĸ���:"+bigCount);
		System.out.println("Сд�ĸ���:"+smallCount);
		System.out.println("���ֵĸ���:"+numberCount);
	}
	

}
