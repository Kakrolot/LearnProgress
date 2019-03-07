package day2019301;

import sun.security.acl.WorldGroupImpl;

/**
 * 
 * @author 40272
 *添加功能 :
 *public StringBuffer append(String str):追加数据，往已有的后面
 *public StringBuffer insert(int offset,String str):插入数据，往指定位置添加
 *
 *删除功能:
 *public StringBuffer deleteCharAt(int index):删除指定位置的字符
 *public StringBuffer deleteCharAt(int start,int end):删除从指定为值到结束位置的内容
 *
 *替代功能:
 *public StringBuffer replace(int start,int end,String str):用给定的字符串替换从指定位置开始到指定位置结束的数据
 *
 *截取功能:返回值类型是String 类型，本身没有发生改变
 *public String substring(int start):从指定位置开始到末尾
 *public String substring(int start, int end):从指定位置开始到指定位置结束
 */

public class StringBufferDemo01 {
	public static void main(String[] args) {
		//创建字符串缓冲区对象
		StringBuffer sb = new StringBuffer();
		
		sb.append("hello").append("world").append("java");
		System.out.println(sb);
		sb.insert(5, "ggsimida");
		System.out.println(sb);
		sb.delete(1, 2);
		System.out.println(sb);
		sb.replace(1, 2, "aa");
		System.out.println(sb);
		String s = sb.substring(1,5);
		System.out.println(s);
		
	}

}
