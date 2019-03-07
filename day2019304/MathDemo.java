package day2019304;

import org.omg.CORBA.PUBLIC_MEMBER;

/*
 * Math是用于数学操作的类。方法都是静态的
 *
 */
public class MathDemo {
	 public static void main(String[] args) {
		//pulbic static int abs (int a):绝对值
		 System.out.println("abs:"+Math.abs(12));
		 System.out.println("abs:"+Math.abs(-12));
		 System.out.println("------------------");
		 
		//public static double ceil(double a):大于等于参数的最小整数值
		 System.out.println("ceil:"+Math.ceil(10.3));
		 System.out.println("ceil:"+Math.ceil(11));
		 System.out.println("-------------------");
		 
		 //public static double floor(double a):小于等于参数的最大整数值
		 System.out.println("floor:"+Math.floor(52.1));
		 System.out.println("floor:"+Math.floor(21));
		 System.out.println("--------------------");
		 
		 //public static int max(int a,int b)
		 //public static int min(int a,int b)
		 //比较最大最小值 可以嵌套 Min同理
		 System.out.println("max:"+Math.max(22, 11));
		 System.out.println("--------------------");
		 
		 //public static double pow(double a,double b)
		 System.out.println("pow"+Math.pow(2, 3));//2*2*2
		 System.out.println("---------------------");
		 //Math.random 是随机数的产生
		 
		 //public static int round (float a)参数为double 的自学
		 System.out.println("round:"+Math.round(12.23f));
		 System.err.println("round:"+Math.round(123.5351f));
		 System.out.println("-------------------------");
		 
		 //public static double sqrt(double a):正平方跟
		 System.out.println("sqrt:"+Math.sqrt(16));
		 
		 
	}

}
