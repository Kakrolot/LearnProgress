package day2019227;

import sun.net.www.content.audio.x_aiff;

/**
 * 
 * @author 40272
 *String��ת������:
 *byte[] getBytes():���ַ���ת��Ϊ�ֽ�����
 *char[] toCharArray():���ַ���ת��Ϊ�ַ�����
 *static String valueOf(char[] chs):���ַ�����ת���ַ���
 *static String valueOf(int i):��int
 */
public class StringDemo05 {
	public static void main(String[] args) {
		String s = "abcde";
		
		
		//byte[] getBytes():���ַ���ת����Ϊ�ֽ�����
		byte[] bys = s.getBytes();
		for(int i = 0; i<s.length();i++){
			System.out.println(bys[i]);
		}
		System.out.println("-----------");
		
		//char[] toCharArray():���ַ���ת��Ϊ�ַ�����
		char[] chs = s.toCharArray();
		for (int i=0; i<chs.length;i++){
			System.out.println(chs[i]);
		}
		System.out.println("-----------");
		
		//static String valueOf(char[] chs):���ַ�����ת���ַ���
		String s2 = String.valueOf(chs);
		System.out.println("s2:"+ s2);
		System.out.println("------------");
		
		//static String valueOf(int i):��int���͵�����ת���ַ���
		int number = 100;
		String s3 = number +"";
		String s4 = String.valueOf(number);
		System.out.println("s3:"+s3);
		System.out.println("s4:"+s4);
		System.out.println("-------------");;
		
		//String toLowerCase():���ַ���תСд
		//String toUpperCase():���ַ���ת��д
		System.out.println("toLowerCase():"+"HelloWorld".toLowerCase());
		System.out.println("toUpperCase():"+"HelloWorld".toUpperCase());
		System.out.println("---------------");
		
		
		//String concat(String str):�ַ���������
		String s5 = "hello";
		String s6 = "world";
		String s7 = s5+s6;
		String s8 = s5.concat(s6);
		System.out.println(s7);
		System.out.println(s8);
	}

}
