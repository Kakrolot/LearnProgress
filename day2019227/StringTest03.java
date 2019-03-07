package day2019227;

import java.util.Scanner;

public class StringTest03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = s1.substring(0,1);
		String s3 = s1.substring(1);
		String result = s2.toUpperCase()+s3.toLowerCase();
		System.out.println(result);
		}
	

}
