package learnprogress;

public class DoWhile {
	public static void main(String[] args) {
		int sum = 0;
		int x = 1;
		do{
			sum+=x;
			x++;
			
		}while(x<=100);
		System.out.println(sum);
	}

}
