package day2019308;
//递归需要设置一个出口
public class DiGuiDemo02 {
	public static void main(String[] args) {
		System.out.println("5的阶乘是:"+jc(5));
	}
	public static int jc(int n) {
		if(n==1){
			return 1;//1就是出口
		}else {
			return n*jc(n-1);
		}
		
	}
}
