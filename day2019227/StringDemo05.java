package day2019227;

import sun.net.www.content.audio.x_aiff;

/**
 * 
 * @author 40272
 *String的转换功能:
 *byte[] getBytes():把字符串转换为字节数组
 *char[] toCharArray():把字符串转换为字符数组
 *static String valueOf(char[] chs):把字符数组转成字符串
 *static String valueOf(int i):把int
 */
public class StringDemo05 {
	public static void main(String[] args) {
		String s = "abcde";
		
		
		//byte[] getBytes():把字符串转换成为字节数组
		byte[] bys = s.getBytes();
		for(int i = 0; i<s.length();i++){
			System.out.println(bys[i]);
		}
		System.out.println("-----------");
		
		//char[] toCharArray():把字符串转换为字符数组
		char[] chs = s.toCharArray();
		for (int i=0; i<chs.length;i++){
			System.out.println(chs[i]);
		}
		System.out.println("-----------");
		
		//static String valueOf(char[] chs):把字符数组转成字符串
		String s2 = String.valueOf(chs);
		System.out.println("s2:"+ s2);
		System.out.println("------------");
		
		//static String valueOf(int i):把int类型的数据转成字符串
		int number = 100;
		String s3 = number +"";
		String s4 = String.valueOf(number);
		System.out.println("s3:"+s3);
		System.out.println("s4:"+s4);
		System.out.println("-------------");;
		
		//String toLowerCase():把字符串转小写
		//String toUpperCase():把字符串转大写
		System.out.println("toLowerCase():"+"HelloWorld".toLowerCase());
		System.out.println("toUpperCase():"+"HelloWorld".toUpperCase());
		System.out.println("---------------");
		
		
		//String concat(String str):字符串的连接
		String s5 = "hello";
		String s6 = "world";
		String s7 = s5+s6;
		String s8 = s5.concat(s6);
		System.out.println(s7);
		System.out.println(s8);
	}

}
