package day2019227;
/**
 * 
 * @author 40272
 *String����жϹ���:
 *boolean equals(Object obj):�Ƚ��ַ����������Ƿ���ͬ���ϸ����ִ�Сд
 *boolean equalsIgnoreCase(String str):�Ƚ��ַ����������Ƿ���ͬ�������Ǵ�Сд��
 *boolean contains(String str):�ж��Ƿ����ָ����С��
 *boolean startsWith(String str):�ж��Ƿ���ָ�����ַ�����ͷ
 *boolean endsWith(String str):�ж��Ƿ���ָ�����ַ�����β
 *boolean ifEmpty():�ж��ַ����������Ƿ�Ϊ��
 */
public class StringDemo03 {
	public static void main(String[] args) {
		String s = "helloworld";
		
		//boolean equals(Object obj):�Ƚ��ַ����������Ƿ���ͬ���ϸ����ִ�Сд
		System.out.println("equals():"+s.equals("helloworld"));
		System.out.println("equals():"+s.equals("HelloWorld"));
		System.out.println("--------------------------------");
		
		//boolean equalsIgnoreCase(String str):�Ƚ��ַ����������Ƿ���ͬ�������Ǵ�Сд
		System.out.println("equalsIgnoreCase:"+s.equals("helloworld"));
		System.out.println("equalsIgnoreCase:"+s.equals("HelloWorld"));
		System.out.println("----------------------------------------");
		
		//boolean contains(String str):�ж��Ƿ����ָ����С��
		System.out.println("contains()"+s.contains("wow"));
		System.out.println("contains()"+s.contains("hw"));
		System.out.println("---------------------------");
		
		//boolean starsWith(String str):�ж��Ƿ���ָ�����ַ�����ͷ
		System.out.println("startsWith():"+s.startsWith("hw"));
		System.out.println("startsWith():"+s.startsWith("owo"));
		System.out.println("startsWith():"+s.startsWith("h"));
		System.out.println("-------------------------------");
		
	}

}
