package day2019306;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

/**
 * 
 * @author 40272
 * A:创建一个HashMap集合
 * B:创建一个ArrayList 集合
 * C:装牌
 * D:洗牌
 * E:发牌
 * F:看牌
 */
public class PokeDemo2 {
	public static void main(String[] args) {
		//创建一个HashMap集合
		HashMap<Integer,String> hm = new HashMap<Integer,String	>();
		//创建一个ArrayList集合
		ArrayList<Integer> array = new ArrayList<Integer>();
		// 存储牌
		// 定义花色数组
		String[] colors = { "♠", "♥", "♣", "♦" };
		// 定义点数数组
		String[] numbers = { "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q",
				"K", "A", "2" };
		//建立索引
		int key = 0;
		for(String number:numbers){
			for(String color:colors){
				String value = color.concat(number);
				hm.put(key, value);
				array.add(key);
				key++;
			}
		}
		hm.put(key,"小王");
		array.add(key);
		key++;
		hm.put(key,"大王");
		array.add(key);
		
		
		
		//洗牌
		Collections.shuffle(array);
		//发牌
		TreeSet<Integer> liuyi = new TreeSet<Integer>();
		TreeSet<Integer> xueweiwei = new TreeSet<Integer>();
		TreeSet<Integer> zhaiyonggao = new TreeSet<Integer>();
		TreeSet<Integer> dipai = new TreeSet<Integer>();
		for(int x=0;x<array.size();x++){
			if (x>=array.size()-3) {
				dipai.add(array.get(x));	
			}else if (x%3 == 0) {
				liuyi.add(array.get(x));
			}else if (x%3 == 1) {
				xueweiwei.add(array.get(x));
			}else if (x%3 == 2) {
				zhaiyonggao.add(array.get(x));
			}
		}
		lookPoker("刘毅", liuyi, hm);
		lookPoker("薛卫卫", xueweiwei, hm);
		lookPoker("翟勇高", zhaiyonggao, hm);
		lookPoker("底牌", dipai, hm);

	}
	public static void lookPoker(String name,TreeSet<Integer> ts,HashMap<Integer,String> hm) {
		System.out.print(name+"的牌是:");
		for(Integer key:ts){
			String value = hm.get(key);
			System.out.print(value+" ");
		}
		System.out.println();
	}

}
