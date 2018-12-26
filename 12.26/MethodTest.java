package learnprogress;

import java.util.Scanner;

public class MethodTest {
	public static void main(String[] args) {
		//创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个整数:(1-9)");
		int n = sc.nextInt();
		
		//调用方法 输出 nn乘法表
		printNN(n);
	}
	public static void printNN(int n) {
		for(int x=1;x<=n;x++)
		{
			for(int y=1;y<=x;y++){
				System.out.print(y+"*"+x+"="+x*y+"\t");
			}
			System.out.println();
		}
		
	}
}
