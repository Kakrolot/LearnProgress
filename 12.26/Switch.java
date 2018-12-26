package learnprogress;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		//创建键盘输入对象
		Scanner sc = new Scanner(System.in);
		//键盘录入数据 用month 进行储存
		System.out.println("请输入月份：");
		int month = sc.nextInt();
		switch (month) {
		case 1:
		case 2:
		case 12:
			System.out.println("冬季");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("春季");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("夏季");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("秋季");
			break;
		default:
			System.out.println("您输入的月份有误");
			break;
		}
	}

}
