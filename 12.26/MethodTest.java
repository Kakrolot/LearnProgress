package learnprogress;

import java.util.Scanner;

public class MethodTest {
	public static void main(String[] args) {
		//��������¼�����
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ������:(1-9)");
		int n = sc.nextInt();
		
		//���÷��� ��� nn�˷���
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
