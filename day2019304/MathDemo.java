package day2019304;

import org.omg.CORBA.PUBLIC_MEMBER;

/*
 * Math��������ѧ�������ࡣ�������Ǿ�̬��
 *
 */
public class MathDemo {
	 public static void main(String[] args) {
		//pulbic static int abs (int a):����ֵ
		 System.out.println("abs:"+Math.abs(12));
		 System.out.println("abs:"+Math.abs(-12));
		 System.out.println("------------------");
		 
		//public static double ceil(double a):���ڵ��ڲ�������С����ֵ
		 System.out.println("ceil:"+Math.ceil(10.3));
		 System.out.println("ceil:"+Math.ceil(11));
		 System.out.println("-------------------");
		 
		 //public static double floor(double a):С�ڵ��ڲ������������ֵ
		 System.out.println("floor:"+Math.floor(52.1));
		 System.out.println("floor:"+Math.floor(21));
		 System.out.println("--------------------");
		 
		 //public static int max(int a,int b)
		 //public static int min(int a,int b)
		 //�Ƚ������Сֵ ����Ƕ�� Minͬ��
		 System.out.println("max:"+Math.max(22, 11));
		 System.out.println("--------------------");
		 
		 //public static double pow(double a,double b)
		 System.out.println("pow"+Math.pow(2, 3));//2*2*2
		 System.out.println("---------------------");
		 //Math.random ��������Ĳ���
		 
		 //public static int round (float a)����Ϊdouble ����ѧ
		 System.out.println("round:"+Math.round(12.23f));
		 System.err.println("round:"+Math.round(123.5351f));
		 System.out.println("-------------------------");
		 
		 //public static double sqrt(double a):��ƽ����
		 System.out.println("sqrt:"+Math.sqrt(16));
		 
		 
	}

}
