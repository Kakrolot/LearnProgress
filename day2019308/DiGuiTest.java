package day2019308;
/*
 * ��������(쳲���������):��һ�����ӣ��ӳ��������������ÿ���¶���һ�����ӣ�С���ӳ����������º�ÿ��������һ��
 * ���ӣ��������Ӳ��������20���µ�������
 * ��һ���� 1
 * �ڶ����� 1
 * �������� 2
 * ���ĸ��� 3
 * ������� 5
 * �������� 8
 * 
 */
public class DiGuiTest {
	public static void main(String[] args) {
		System.out.println(tuZi(20));
	}
	public static int tuZi(int n) {
		
		if (n<=2) {
			return  1;
		}else {
			return tuZi(n-2) + tuZi(n-1);
			
		}
		
	}

}
