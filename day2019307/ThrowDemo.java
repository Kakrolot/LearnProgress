package day2019307;

import java.text.ParseException;

/**
 * 
 * @author 40272
 * throw:用在方法中，让程序调转的。
 */
public class ThrowDemo {
	public static void main(String[] args) {
		show(10,0);
		
	}
	public static void show() throws ParseException {
		if("hello".equals("world")){
			throw new ParseException(null, 0);
		}else {
			System.out.println("over");
		}
		
	}
	public static void show(int a,int b) {
		if(b == 0){
			//
			throw new ArithmeticException();
		}else {
			System.out.println(a/b);
		}
		System.out.println("haha");
	}

}
