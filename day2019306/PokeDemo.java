package day2019306;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 
 * @author 40272
 * 模拟斗地主洗牌和发牌
 * 扑克牌:54
 * 大王
 * 小王
 * 黑桃A，黑桃2，黑桃3....黑桃10，黑桃J，黑桃Q，黑桃K
 * 红桃
 * 梅花
 * 方块
 * 
 * 分析:
 *       A:造一个牌盒（集合）
 *       B:每造一张牌，然后存储到牌盒里面去
 *       C:洗牌
 *       D:发牌
 *       E:看牌
 */
public class PokeDemo {
	public static void main(String[] args) {
		//造一个牌盒(集合)
		ArrayList<String> array = new ArrayList<>();
		//造每一张牌，然后存储到牌盒里
		String[] colors = {"♠","♥","♣","♦"};
		String[] numbers = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		for(String color : colors){
			for(String number : numbers){
				array.add(color.concat(number));	
			}
		}
		array.add("小王");
		array.add("大王");
		//看牌
		//System.out.println(array);
		//洗牌
		Collections.shuffle(array);
		//发牌
		//三个人
		ArrayList<String> liuyi = new ArrayList<String>();
		ArrayList<String> xueweiwei = new ArrayList<String>();
		ArrayList<String> zhaiyonggao = new ArrayList<String>();
		ArrayList<String> dipai = new ArrayList<String>();	
		
		for(int x = 0;x<array.size();x++){
			if(x>=array.size()-3){
				dipai.add(array.get(x));
			}else if (x%3 == 0) {
				liuyi.add(array.get(x));
			}else if (x%3 == 1) {
				xueweiwei.add(array.get(x));
			}else if (x%3 == 2) {
				zhaiyonggao.add(array.get(x));
			}
		}
		lookPokers("刘毅", liuyi);
		lookPokers("薛卫卫", xueweiwei);
		lookPokers("翟勇高",zhaiyonggao);
	}	
	public static void lookPokers(String name,ArrayList<String> array) {
		System.out.println(name+"的牌是:");
		for(String s:array){
			System.out.println(s+" ");
		}
		System.out.println();
	}

}
