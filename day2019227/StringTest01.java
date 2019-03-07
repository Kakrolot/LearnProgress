package day2019227;
/**
 * 
 * @author 40272
 *字符串的遍历：遍历获取字符串中的每一个字符
 */
public class StringTest01 {
	public static void main(String[] args) {
		String s = "java";
		for(int i = 0;i <s.length();i++){
			char ch = s.charAt(i);
			System.out.println(ch);
		}
	}

}
