package day2019228;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

/**
 * 
 * @author 40272
 * 统计大串中小串出现的次数
 * 举例：在字符串
 * ” woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun”
 * 中java出现了5次
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
		//先查找一次
		int index = maxString.indexOf(minString);
		//定义一个变量，用于记录每次最新的查找位置
		int startIndex = 0;
		
		while(index!= -1){
			count++;
			startIndex = index+minString.length();
			index = maxString.indexOf(minString,startIndex);
		}
		return count;
		
	}

}
