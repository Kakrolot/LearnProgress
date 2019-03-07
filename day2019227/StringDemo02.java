package day2019227;

import sun.launcher.resources.launcher;

/**
 * 
 * @author 40272
 *"=="号比较的是字符串的引用类型，比较的是地址值
 *equal();默认比较的是地址值。String类重写了equals()方法，该方法比较的是字符串
 *内容是否相同
 */
public class StringDemo02 {
	public static void main(String[] args) {
		String s1 = new String("hello");
		String s2 = "hello";
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}

}
