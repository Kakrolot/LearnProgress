package day2019227;

import sun.launcher.resources.launcher;

/**
 * 
 * @author 40272
 *"=="�űȽϵ����ַ������������ͣ��Ƚϵ��ǵ�ֵַ
 *equal();Ĭ�ϱȽϵ��ǵ�ֵַ��String����д��equals()�������÷����Ƚϵ����ַ���
 *�����Ƿ���ͬ
 */
public class StringDemo02 {
	public static void main(String[] args) {
		String s1 = new String("hello");
		String s2 = "hello";
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}

}
