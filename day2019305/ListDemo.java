package day2019305;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * Collection
 *           List:Ԫ������(�洢˳���ȡ��˳��һ��),Ԫ�ؿ� �ظ�
 *           set:Ԫ������ Ԫ��λ��
 * ����:��List ���ϴ洢�ַ�����������
 */
public class ListDemo {
	public static void main(String[] args) {
		//�������϶���
		List list = new ArrayList();
		
		//���������Ԫ��
		list.add("�����");
		list.add("˾��ܲ");
		list.add("�ܲ�");
		
		//��������
		Iterator it = list.iterator();
		while(it.hasNext()){
			String s = (String)it.next();
			System.out.println(s);
		}
	}

}
