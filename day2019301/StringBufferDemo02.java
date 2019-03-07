package day2019301;
/**
 * 
 * @author 40272
 *反转是StringBuffer的特有功能，String没有。
 *而String 要做反转，稍微麻烦。
 *可以让一个类使用另一个类的功能，前提是两个类可以互相转换
 *reverse
 */
public class StringBufferDemo02 {
	public static void main(String[] args) {
		String s = "hello";
		StringBuffer sb = new StringBuffer(s);
		
		String ss = new String(sb);
	}

}
