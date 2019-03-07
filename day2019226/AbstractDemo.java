package day2019226;

abstract class Animal{
	int num = 10;
	final int num2 = 20;
	public Animal() {}
	public void method() {
		System.out.println("method");
	}
	public abstract void function();
}
class Dog extends Animal{
	public void show() {
		num = 100;
		System.out.println(num);
		System.out.println(num2);
	}

	@Override
	public void function() {
		// TODO Auto-generated method stub
		
	}
}
public class AbstractDemo {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.show();
	}

}
