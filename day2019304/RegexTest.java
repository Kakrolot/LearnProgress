package day2019304;

import java.util.Scanner;

public class RegexTest {
	public static void main(String[] args) {
		//�������
		String regex = "\\w+@\\w{2,8}(\\.[a-z]{2,3})+";
		
		//����¼��
		Scanner sc = new Scanner(System.in);
		System.out.println("����������:");
		String email = sc.nextLine();
		
		//У��
		boolean flag = email.matches(regex);
		System.out.println(flag);
	}

}
