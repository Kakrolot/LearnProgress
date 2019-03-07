package day2019308;
/*
 * 兔子问题(斐波那契数列):有一对兔子，从出生后第三个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对
 * 兔子，加入兔子不死，求第20个月的兔子数
 * 第一个月 1
 * 第二个月 1
 * 第三个月 2
 * 第四个月 3
 * 第五个月 5
 * 第六个月 8
 * 
 */
public class DiGuiTest {
	public static void main(String[] args) {
		System.out.println(tuZi(20));
	}
	public static int tuZi(int n) {
		
		if (n<=2) {
			return  1;
		}else {
			return tuZi(n-2) + tuZi(n-1);
			
		}
		
	}

}
