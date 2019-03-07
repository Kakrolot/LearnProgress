package day2019304;

import java.util.Scanner;

public class RegexTest {
	public static void main(String[] args) {
		//定义规则
		String regex = "\\w+@\\w{2,8}(\\.[a-z]{2,3})+";
		
		//键盘录入
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入邮箱:");
		String email = sc.nextLine();
		
		//校查
		boolean flag = email.matches(regex);
		System.out.println(flag);
	}

}
