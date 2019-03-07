package day2019305;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;


/*
 * ListIterator ListIterator
 * 通过查看API，我们知道列表迭代器继承自迭代器，所以它就具有haxNext()方法和next()方法
 */
public class ListIteratorDemo {
	public static void main(String[] args) {
		//创建几何对象
		List list = new ArrayList();
		
		list.add("hello");
		list.add("world");
		list.add("java");
		
		//使用方法
		//ListIterator listIterator()
		ListIterator lit = list.listIterator();
		while(lit.hasNext()){
			String s = (String)lit.next();
			System.out.println(s);
		}
		System.out.println("--------------");
		while(lit.hasPrevious()){
			String s1 = (String)lit.previous();
			System.out.println(s1);
		}
	}

}
