package day2019304;

import java.util.Random;

/**
 * 
 * @author 40272
 *Random:�������������
 *
 *���췽��:
 *         public Random():��Ĭ�����ӣ����Һͷ�����׼ȷ�Ŀ���ϵͳ��ʱ���ĵ�ǰֵ���Ժ���Ϊ��λ��������
 *         public Random(long seed):ָ������
 *         
 *��Ա����:
 *         public int nextInt():int ��Χ�ڵ�����
 *         public int nextInt(int n):[0,n)����
 *������:
 *         ���췽�����������ӵ�����
 *                    ������Ӳ�ͬ���������ͬ��
 *                    ���������ͬ���������ͬ��
 */
public class RandomDemo {
	public static void main(String[] args) {
		//��������
		//Random r = new Random();
		Random r = new Random(17);
		
		for(int x = 0;x<10;x++){
			System.out.println(r.nextInt(100));
		}
	}

}
