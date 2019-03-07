package day2019226;
/**
 * 
 * @author 40272
 * 字符串：由多个字符组成的一组数据
 * 
 * 构造方法：
 *public String():创建String 对象
 *public String(byte[] bytes):吧字节数组转乘字符串
 *public String(byte[] bytes,int index,int length):把字节数组中的一部分转换成字符串
 *public String(char[] value):把字符串数组转成字符串
 *public String(char[] value,int index,int count):把字符数组的一部分转成字符串
 *public String(String original)：把字符串转成字符串
 *
 *
 *数组没有length(); String由length();
 */

public class StringDemo {
	public static void main(String[] args) {
		//public String() :创建String对象
		String s1 = new String();
		System.out.println("s1:"+s1);
		System.out.println("s1.length:"+s1.length());
		System.out.println("-----------------------");
		
		//public String(byte[] bytes):把字节数组转成字符串。
		byte[] bytes = {97,98,99,100,101};
		String s2 = new String(bytes);
		System.out.println("s2:"+s2);
		System.out.println("s2.length():"+s2.length());
		System.out.println("------------------------");
		
		//public String(byte[] bytes,int index,int length):把字节数组中的一部分转换为字符串
		String s3 = new String(bytes,0,bytes.length);
		System.out.println("s3:"+s3);
		System.out.println("s3.length:"+s3.length());
		System.out.println("------------------------");
		
		
		//public String(char[] value):把字符数组转成字符串
		char[] chs = {'a','b','c','d','e','刘','毅'};
		String s4 = new String(chs);
		System.out.println("s4:"+s4);
		System.out.println("s4.length():"+s4.length());
		System.out.println("------------------------");
		
		
	}

}
