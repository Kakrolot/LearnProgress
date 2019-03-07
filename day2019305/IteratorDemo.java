package day2019305;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 
 * @author 40272
 * Iterator iterator() //Iterator ������
 *                     boolean hasNext():�Ƿ�����һ��Ԫ��
 *                     Object next():��ȡ��һ��Ԫ�أ����Զ��ƶ�����һ��λ�õȴ�
 *                     
 *                     NoSuchElementException:û��������Ԫ��һ��
 *                     ԭ����:���Ѿ���ȡ��Ԫ�ص�ĩβ�ˣ��㻹Ҫ��ȡԪ�أ��Ѿ�û��Ԫ���ˣ����Ա���
 *                     
 *                     
 */
public class IteratorDemo {
	public static void main(String[] args) {
		//����������
		Collection c = new ArrayList();
		
		//����Ԫ�ز����Ԫ��
		c.add("hello");
		c.add("world");
		c.add("java");
		
		//�����еķ���:Iterator iterator()
		Iterator it = c.iterator();//�ұ���ʵ�ǽӿڵ�ʵ����������Ƕ�̬��Ӧ��
		while(it.hasNext()){
			String s = (String)it.next();
			System.out.println(s);
		}
		
	}

}
