package day2019305;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * @author 40272
 *����¼�������ݣ���0������Ҫ���ڿ���̨�����ô��������е����ֵ
 *
 *����:
 *         A:���弯�ϣ�����洢�������
 *         B:ѭ������¼�����ݣ���while(true){}
 *         C:�жϼ���¼��������Ƿ���0
 *                ��:break
 *                ��:��ӵ�����
 *         D:�Ѽ���ת������
 *         E:�������������(����)
 *         F:��ȡ�����е����һ��Ԫ�ؼ���
 *
 */
public class GetMaxNumberDemo {
	public static void main(String[] args) {
		//���弯�ϣ����ڴ洢�������
		ArrayList<Integer> array = new ArrayList<Integer>();
		
		//ѭ������¼�����ݣ���while(true){}
		Scanner sc = new Scanner(System.in);
		while(true){
			int number = sc.nextInt();
			
			//�жϼ���¼��������Ƿ���0
			if(number == 0){
				break;
			}else{
				array.add(number);
			}
		}
		//�Ѽ���ת������
		//<T> T[] toArray(T[] a)
		Integer[] i = new Integer[array.size()];
		Integer[] iArray = array.toArray(i);
		
		//�������������(����)
		Arrays.sort(iArray);
		
		//��ȡ�����е����һ��Ԫ�ؼ���
		System.out.println("���ֵ��:"+iArray[iArray.length-1]);
		
	}

}
