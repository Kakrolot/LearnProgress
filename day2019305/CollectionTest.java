package day2019305;

import java.util.ArrayList;
import java.util.Collection;

/*
 * Object[] toArray():�Ѽ���ת�ɶ�������
 * 
 * ��ϰ:�ü��ϴ洢����ѧ�����󣬲�������
 * 
 * �ܽ�:���ϵ�ʹ�ò���
 * A�������϶���
 * B:����Ԫ�ض���
 * C:��Ԫ����ӵ�����
 * D:��������
 */
public class CollectionTest {
	public static void main(String[] args) {
		//�������϶���
		Collection c = new ArrayList();
		//����Ԫ�ض���
		Student s1 = new Student("����",18);
		Student s2 = new Student("���¸�",12);
		Student s3 = new Student("Ѧ����",16);
		//��ѧ��������ӵ�����
		c.add(s1);
		c.add(s2);
		c.add(s3);
		
		//��������
		Object[] objs = c.toArray();
		for(int x=0;x<objs.length;x++){
			Student s = (Student)objs[x];
			System.out.println(s.getName()+"---"+s.getAge());
		}
	}

}
