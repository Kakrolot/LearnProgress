package day2019304;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ��ȡ���� 
 *         Pattern �� Matcher���ʹ��
 * 
 */
public class RegexDemo04 {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("\\d+");
		Matcher m = p.matcher("22w2");
		System.out.println(m.matches());
		
	}

}
