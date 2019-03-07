package day2019304;

import java.util.Scanner;

/*
 * 判断功能
 * String类的方法:
 *            public boolean matches(String regex)
 */
public class RegexDemo02 {
	public static void main(String[] args) {
		/*
		 * 需求:检验电话号码
		 * 
		 * 分析:
		 *       电话号码的组成
		 *       
		 */
		//定义规则
		String regex = "1[38][0-9]{9}";
		
		//键盘录入手机号码
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入手机号码:");
		String phone = sc.nextLine();
		
		//调用判断功能
		boolean flag = phone.matches(regex);
		System.out.println(flag);
	}

}
