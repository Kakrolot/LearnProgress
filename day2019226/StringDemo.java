package day2019226;
/**
 * 
 * @author 40272
 * �ַ������ɶ���ַ���ɵ�һ������
 * 
 * ���췽����
 *public String():����String ����
 *public String(byte[] bytes):���ֽ�����ת���ַ���
 *public String(byte[] bytes,int index,int length):���ֽ������е�һ����ת�����ַ���
 *public String(char[] value):���ַ�������ת���ַ���
 *public String(char[] value,int index,int count):���ַ������һ����ת���ַ���
 *public String(String original)�����ַ���ת���ַ���
 *
 *
 *����û��length(); String��length();
 */

public class StringDemo {
	public static void main(String[] args) {
		//public String() :����String����
		String s1 = new String();
		System.out.println("s1:"+s1);
		System.out.println("s1.length:"+s1.length());
		System.out.println("-----------------------");
		
		//public String(byte[] bytes):���ֽ�����ת���ַ�����
		byte[] bytes = {97,98,99,100,101};
		String s2 = new String(bytes);
		System.out.println("s2:"+s2);
		System.out.println("s2.length():"+s2.length());
		System.out.println("------------------------");
		
		//public String(byte[] bytes,int index,int length):���ֽ������е�һ����ת��Ϊ�ַ���
		String s3 = new String(bytes,0,bytes.length);
		System.out.println("s3:"+s3);
		System.out.println("s3.length:"+s3.length());
		System.out.println("------------------------");
		
		
		//public String(char[] value):���ַ�����ת���ַ���
		char[] chs = {'a','b','c','d','e','��','��'};
		String s4 = new String(chs);
		System.out.println("s4:"+s4);
		System.out.println("s4.length():"+s4.length());
		System.out.println("------------------------");
		
		
	}

}
