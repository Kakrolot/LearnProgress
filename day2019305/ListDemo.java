package day2019305;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * Collection
 *           List:元素有序(存储顺序和取出顺序一致),元素可 重复
 *           set:元素无需 元素位移
 * 需求:用List 集合存储字符串并遍历。
 */
public class ListDemo {
	public static void main(String[] args) {
		//创建集合对象
		List list = new ArrayList();
		
		//创建并添加元素
		list.add("诸葛亮");
		list.add("司马懿");
		list.add("曹操");
		
		//遍历集合
		Iterator it = list.iterator();
		while(it.hasNext()){
			String s = (String)it.next();
			System.out.println(s);
		}
	}

}
