package day2019307;

public class ExceptionDemo02 {
	public static void main(String[] args) {
		//method3();
		//method2();
		method();
	}
	public static void method3() {
		int a = 10;
		int b = 0;
		int[] arr = {1,2,3};
		try {
			//System.out.println(a/b);
			System.out.println(arr[3]);
		} catch (ArithmeticException|ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("�����������");
		}
		System.out.println("over");	
	}
	public static void method2() {
		int a = 10;
		int b = 0;
		int[] arr = {1,2,3};
		try {
			System.out.println(a/b);
			System.out.println(arr[3]);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("��������Ϊ0");
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("����Խ���쳣");
			// TODO: handle exception
		}catch (Exception e) {
			System.out.println("�����������");
			// TODO: handle exception
		}
		System.out.println("over");
	}
	public static void method() {
		int a = 10;
		int b = 0;
		try {
			System.out.println(a/b);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("��������Ϊ0");
		}
		
		int[] arr={1,2,3};
		try {
			System.out.println(arr[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("����Խ���쳣");
		}
		System.out.println("over");
	}

}
