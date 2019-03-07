package day2019227;
/**
 * 
 * @author 40272
 *String类的获取功能
 *int length():返回字符串的长度。字符的个数。
 *char charAt(int index):返回字符串中指定位置的字符
 *int indexOf(int ch):返回指定字符在字符串中第一次出现的位置 97，'a'
 *int indexOf(String str):返回指定字符串在字符串第一此出现的位置
 *int indexOf(int ch,int fromIndex):返回指定字符从指定位置开始在字符串中第一次出现的位置
 *int indexOf(String str,int fromIndex):返回指定字符串从指定位置开始在字符串中第一次出现的位置
 *String substring(int start):返回从指定位置开始到末尾的字串
 *String substring(int start,int end):返回从指定位置开始到指定位置结束的字串------注意左包右不包
 */
public class StringDemo04 {
	public static void main(String[] args) {
		String s = "helloworld";
		
		//int length():返回字符串长度。字符的个数。
		System.out.println("length():"+s.length());
		System.out.println("--------------------");
		
		//char charAt(int index):返回字符串中指定位置的字符
		System.out.println("charAt():"+s.charAt(0));
		System.out.println("charAt():"+s.charAt(3));
		System.out.println("---------------------");
		
		//int indexOf(int ch):返回指定字符在字符串中第一次出现的位置
		System.out.println("indexOf():"+s.indexOf('1'));
		//int indexOf(int ch,int fromIndex):返回指定字符从指定位置开始在字符串中第一次出现的位置
		System.out.println("indexOf():"+s.indexOf('1',4));
		
		//String substring(int start,int end):返回指定位置开始到指定位置结束的字串
		System.out.println("substring():"+s.substring(2,5));
	}

}
