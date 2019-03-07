package day2019305;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 
 * @author 40272
 *去除集合中字符串的重复值(字符串的内容相同)
 *创建新集合的方式：
 *             A：定义集合，存储带重复的元素
 *             B:创建新集合
 *             C:遍历旧集合，获取到旧集合中的每一个元素
 *             D:那就集合的每一个元素到新集合中去找，看有没有
 *             有就不添加
 *             没有就添加
 *             E:遍历新集合
 */
public class ArrayListTest {
	public static  void main(String[] args) {
		//定义集合，存储带重复的元素
		
		ArrayList<String> array = new ArrayList<String>();
		array.add("hello");
		array.add("world");
		array.add("java");
		array.add("android");
		array.add("world");
		array.add("java");
		array.add("javaee");
		array.add("java");
		array.add("java");
		array.add("java");
		array.add("android");
		//创建新集合
		ArrayList<String> newArray = new ArrayList<String>();
		//遍历旧集合，获取到旧集合中的每一个元素
		for(int x=0;x<array.size();x++){
			String s = (String)array.get(x);
			//那旧集合的每一个元素到新集合中去找，有没有，没有就添加
			if(!newArray.contains(s)){
				newArray.add(s);
			}
		}
		Iterator<String> it = newArray.iterator();
		while(it.hasNext()){
			String s = (String) it.next();
			System.out.println(s);
		}
		
	}

}
