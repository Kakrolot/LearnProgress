package day2019228;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

/**
 * 
 * @author 40272
 * ͳ�ƴ���С�����ֵĴ���
 * ���������ַ���
 * �� woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun��
 * ��java������5��
 */
public class StringTest01 {
	public static void main(String[] args) {
		String maxString = "woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun";
		String minString = "java";
		
		int count = getCount(maxString,minString);
		System.out.println(count);
		
	}
	public static int getCount(String maxString,String minString) {
		int count = 0;
		//�Ȳ���һ��
		int index = maxString.indexOf(minString);
		//����һ�����������ڼ�¼ÿ�����µĲ���λ��
		int startIndex = 0;
		
		while(index!= -1){
			count++;
			startIndex = index+minString.length();
			index = maxString.indexOf(minString,startIndex);
		}
		return count;
		
	}

}
