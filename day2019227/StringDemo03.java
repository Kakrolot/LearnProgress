package day2019227;
/**
 * 
 * @author 40272
 *String类的判断功能:
 *boolean equals(Object obj):比较字符串的内容是否相同，严格区分大小写
 *boolean equalsIgnoreCase(String str):比较字符串的内容是否相同，不考虑大小写）
 *boolean contains(String str):判断是否包含指定的小串
 *boolean startsWith(String str):判断是否以指定的字符串开头
 *boolean endsWith(String str):判断是否以指定的字符串结尾
 *boolean ifEmpty():判断字符串的内容是否为空
 */
public class StringDemo03 {
	public static void main(String[] args) {
		String s = "helloworld";
		
		//boolean equals(Object obj):比较字符串的内容是否相同，严格区分大小写
		System.out.println("equals():"+s.equals("helloworld"));
		System.out.println("equals():"+s.equals("HelloWorld"));
		System.out.println("--------------------------------");
		
		//boolean equalsIgnoreCase(String str):比较字符串的内容是否相同，不考虑大小写
		System.out.println("equalsIgnoreCase:"+s.equals("helloworld"));
		System.out.println("equalsIgnoreCase:"+s.equals("HelloWorld"));
		System.out.println("----------------------------------------");
		
		//boolean contains(String str):判断是否包含指定的小串
		System.out.println("contains()"+s.contains("wow"));
		System.out.println("contains()"+s.contains("hw"));
		System.out.println("---------------------------");
		
		//boolean starsWith(String str):判断是否以指定的字符串开头
		System.out.println("startsWith():"+s.startsWith("hw"));
		System.out.println("startsWith():"+s.startsWith("owo"));
		System.out.println("startsWith():"+s.startsWith("h"));
		System.out.println("-------------------------------");
		
	}

}
